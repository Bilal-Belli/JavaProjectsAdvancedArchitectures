package test;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//import javax.naming.NameClassPair;
//import javax.naming.NamingEnumeration;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class test {
    public static void main(String[] args) throws NamingException {

        Context ctx;
        ctx = new InitialContext();
        // DISPLAY ALL EJB IN CONTAINER
        //TESTS POUR VOIR LA LISTE DES COMPOSANTS
        //NamingEnumeration<NameClassPair> list = ctx.list(""); 
        //System.out.println(list.hasMore());
        //while (list.hasMore()) {
        //	System.out.println(list.next().getName()+"" ); 
        //}
        String jdbcUrl = "jdbc:derby://localhost:1527/sample;create=true";
        String username = "user";
        String password = "123";
        String sql = "select * from productStock";
        List<Map<String, Object>> tableData = new ArrayList<>();
        try (Connection connection = DriverManager.getConnection(jdbcUrl, username, password); Statement statement = connection.createStatement(); ResultSet resultSet = statement.executeQuery(sql)) {
        	while (resultSet.next()) {
        	    int productId = resultSet.getInt("id_produit");
        	    String productName = resultSet.getString("name");
        	    int price = resultSet.getInt("price");
        	    int quantity = resultSet.getInt("quantity");
        	    // Create a map to represent a row in the table
        	    Map<String, Object> row = new HashMap<>();
        	    row.put("N°", productId);
        	    row.put("Produit", productName);
        	    row.put("Prix", price);
        	    row.put("Quantite", quantity);
        	    // Add the row to the table data list
        	    tableData.add(row);
        	}
        } catch (SQLException e) {
            e.printStackTrace();
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (Map<String, Object> map : tableData) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                stringBuilder.append(entry.getKey()).append(": ").append(entry.getValue()).append("\n");
            }
            stringBuilder.append("\n");
        }
        // Remove trailing newline if needed
        if (stringBuilder.length() > 0 && stringBuilder.charAt(stringBuilder.length() - 1) == '\n') {
            stringBuilder.setLength(stringBuilder.length() - 1);
        }
        //System.out.println(tableData);
        
        commandePackage.commandeOperationsRemote cmd = (commandePackage.commandeOperationsRemote) ctx.lookup("commandePackage.commandeOperationsRemote");
        
        guiClient gui = new guiClient();
        // AFFICHAGE DE LA LISTE DES PRODUITS POUR UN CLIENT
        gui.productsTextArea.setText(stringBuilder.toString());
        // BUTTON COMMANDER
        gui.orderButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String montantClie = gui.amountInput.getText();
                String numeroPro = gui.priceInput.getText();
                // CALL EJB COMMAND
                int result = cmd.passerCommande(Integer.parseInt(numeroPro), Integer.parseInt(montantClie));
            	switch (result) {
            	    case 1:
            	    	gui.setMachineState("STOCK VIDE");
            	        break;
            	    case 2:
            	    	gui.setMachineState("MONTANT INSUFFISANT");
            	        break;
            	    case 3:
            	    	gui.setMachineState("PIECES CAISSE INSUFFISANTS");
            	        break;
            	    default:
            	        // CODE TO EXECUTE IF RESULT IS NONE OF THE ABOVE CASES
            	    	gui.setMachineState("Operation successful");
            	        break;
            	}
            }
        });
    }
}