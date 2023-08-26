package testAgent;
import javax.swing.*;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;

public class guiAgent {
    public JButton addToCashierButton;
    public JButton addToStockButton;
    public JTextField nameInput;
    public JTextField priceInput;
    public JTextField productNumberInput;
    public JTextField fiveInput;
    public JTextField tenInput;
    public JTextField twentyInput;
    public JTextField fiftyInput;
    public JTextField hundredInput;
    public JTextField twohundredInput;
    
    public guiAgent() {
        JFrame frame = new JFrame("TP-AL Belli Bilal - Partie Agent");
        frame.setSize(250, 490);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setResizable(false);
        // WINDOW NAME
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // WINDOW SIZE
        int windowWidth = 250;
        int windowHeight = 490;
        frame.setPreferredSize(new Dimension(windowWidth, windowHeight));
        
        // LOCATE IN THE CENTER OF THE SCREEN
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;
        int windowX = (screenWidth - windowWidth) / 2;
        int windowY = (screenHeight - windowHeight) / 2;
        frame.setLocation(windowX, windowY);
        
        // DISABLE RESIZE
        frame.setResizable(false);
        frame.setLayout(new GridLayout(7, 2, 10, 10));
        
        JLabel nameLabel = new JLabel("NOM PRODUIT:");
        nameLabel.setBounds(10, 10, 100, 30);
        frame.add(nameLabel);

        nameInput = new JTextField();
        nameInput.setBounds(120, 10, 100, 30);
        frame.add(nameInput);

        JLabel priceLabel = new JLabel("PRIX:");
        priceLabel.setBounds(10, 50, 100, 30);
        frame.add(priceLabel);

        priceInput = new JTextField();
        priceInput.setBounds(120, 50, 100, 30);
        frame.add(priceInput);

        JLabel productNumberLabel = new JLabel("QUANTITÉ");
        productNumberLabel.setBounds(10, 90, 100, 30);
        frame.add(productNumberLabel);

        productNumberInput = new JTextField();
        productNumberInput.setBounds(120, 90, 100, 30);
        frame.add(productNumberInput);

        addToStockButton = new JButton("CHARGER STOCK");
        addToStockButton.setBounds(10, 130, 150, 30);

        frame.add(addToStockButton);

        JLabel fiveLabel = new JLabel("5:");
        fiveLabel.setBounds(10, 170, 100, 30);
        frame.add(fiveLabel);

        fiveInput = new JTextField();
        fiveInput.setBounds(120, 170, 100, 30);
        frame.add(fiveInput);

        JLabel tenLabel = new JLabel("10:");
        tenLabel.setBounds(10, 210, 100, 30);
        frame.add(tenLabel);

        tenInput = new JTextField();
        tenInput.setBounds(120, 210, 100, 30);
        frame.add(tenInput);

        JLabel twentyLabel = new JLabel("20:");
        twentyLabel.setBounds(10, 250, 100, 30);
        frame.add(twentyLabel);

        twentyInput = new JTextField();
        twentyInput.setBounds(120, 250, 100, 30);
        frame.add(twentyInput);

        JLabel fiftyLabel = new JLabel("50:");
        fiftyLabel.setBounds(10 ,290 ,100 ,30 );
        frame.add(fiftyLabel );

        fiftyInput= new JTextField();
        fiftyInput.setBounds(120 ,290 ,100 ,30 );
        frame.add(fiftyInput );

        JLabel hundredLabel= new JLabel("100:");
        hundredLabel.setBounds(10 ,330 ,100 ,30 );
        frame.add(hundredLabel );

        hundredInput= new JTextField();
        hundredInput.setBounds(120 ,330 ,100 ,30 );
        frame.add(hundredInput );
        
        JLabel twohundredLabel= new JLabel("200:");
        twohundredLabel.setBounds(10 ,370 ,100 ,30 );
        frame.add(twohundredLabel );

        twohundredInput= new JTextField();
        twohundredInput.setBounds(120 ,370 ,100 ,30 );
        frame.add(twohundredInput );

        addToCashierButton= new JButton("CHARGER CAISSE");
        addToCashierButton.setBounds(10 ,410 ,150 ,30 );

        frame.add(addToCashierButton );
        frame.repaint();
    }
}