package test;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.List;

public class guiClient extends JFrame {
	private static final long serialVersionUID = 1L;
	public List<String> products;
    public JTextArea productsTextArea;
    public JTextField amountInput,priceInput;
    public JLabel stateLabel,machineStateLabel;
    public JButton orderButton;
    public JButton quitButton;
    public guiClient() {
    	// WINDOW NAME
        setTitle("TP-AL Belli Bilal - Partie Client");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // WINDOW SIZE
        int windowWidth = 500;
        int windowHeight = 500;
        setPreferredSize(new Dimension(windowWidth, windowHeight));
        
        // LOCATE IN THE CENTER OF THE SCREEN
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;
        int windowX = (screenWidth - windowWidth) / 2;
        int windowY = (screenHeight - windowHeight) / 2;
        setLocation(windowX, windowY);
        
        // DISABLE RESIZE
        setResizable(false);
        setLayout(new GridLayout(7, 2, 10, 10));
        
        // CREATE AND ADD COMPONENTS
        JLabel productsLabel = new JLabel("PRODUITS");
        productsLabel.setFont(new Font("Arial", Font.BOLD, 14));
        
        productsTextArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(productsTextArea);
        scrollPane.setPreferredSize(new Dimension(200, 100));

        JLabel amountLabel = new JLabel("MONTANT");
      
        amountInput = new JTextField();
        

        JLabel numPorductLabel = new JLabel("NUMERO PRODUIT");
        
        priceInput = new JTextField();

        stateLabel = new JLabel("ETAT SERVICE");
        machineStateLabel = new JLabel("Disponible");
        
        orderButton = new JButton("COMMANDER");
        quitButton = new JButton("ARRETER");
        JPanel buttonPanel = new JPanel();
        add(productsLabel);
        add(scrollPane);
        add(amountLabel);
        add(amountInput);
        add(numPorductLabel);
        add(priceInput);
        add(stateLabel);
        add(machineStateLabel);
        buttonPanel.add(quitButton);
        buttonPanel.add(orderButton);

        // SET THE SIZE OF EACH BUTTON TO HALF THE WIDTH OF THE PANEL
        int buttonWidth = (int) (buttonPanel.getPreferredSize().getWidth() / 2.0);
        quitButton.setPreferredSize(new Dimension(buttonWidth, quitButton.getPreferredSize().height));
        orderButton.setPreferredSize(new Dimension(buttonWidth, orderButton.getPreferredSize().height));

        add(buttonPanel);
        add(new JLabel());

        // PACK AND DISPLAY THE JFRAME
        pack();
        setVisible(true);
        quitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
    public void setMachineState(String state) {
        this.machineStateLabel.setText(state);
    }
}