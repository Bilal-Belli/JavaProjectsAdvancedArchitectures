package testAgent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class test {
    public static void main(String[] args) throws NamingException {
        Context ctx;
        ctx = new InitialContext();
        commandePackage.commandeOperationsRemote cmd = (commandePackage.commandeOperationsRemote) ctx.lookup("commandePackage.commandeOperationsRemote");
        guiAgent gui = new guiAgent();
        gui.addToCashierButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String five= gui.fiveInput.getText();
                String ten= gui.tenInput.getText();
                String twenty= gui.twentyInput.getText();
                String fifty= gui.fiftyInput.getText();
                String hundred= gui.hundredInput.getText();
                String twohundred= gui.twohundredInput.getText();
                if (!(five.isEmpty())) {
                	cmd.effectuerMaintenanceCaisse(5, Integer.parseInt(five));
                }
				if (!(ten.isEmpty())) {
					cmd.effectuerMaintenanceCaisse(10, Integer.parseInt(ten));      	
			    }
				if (!(twenty.isEmpty())) {
					cmd.effectuerMaintenanceCaisse(20, Integer.parseInt(twenty));
				}
				if (!(fifty.isEmpty())) {
					cmd.effectuerMaintenanceCaisse(50, Integer.parseInt(fifty));
				}
				if (!(hundred.isEmpty())) {
					cmd.effectuerMaintenanceCaisse(100, Integer.parseInt(hundred));
				}
				if (!(twohundred.isEmpty())) {
					cmd.effectuerMaintenanceCaisse(200, Integer.parseInt(twohundred));
				}
            }
        });
        gui.addToStockButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String productNumber = gui.productNumberInput.getText();
                String price = gui.priceInput.getText();
                String name = gui.nameInput.getText();
                cmd.effectuerMaintenanceStock(name,Integer.parseInt(price),Integer.parseInt(productNumber));
            }
        });
    }
}