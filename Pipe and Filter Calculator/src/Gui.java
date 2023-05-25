import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

public class Gui extends JFrame {
    private JLabel title, result;
    private JTextField num1Field, num2Field;
    private JButton sumButton, productButton, factorialButton, quitButton, traceButton;
    private JTextArea outputArea;

    public Gui(Pipe toGUI) {
        // window name
        setTitle("TP-AL Belli Bilal");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // window size
        setSize(400, 300);
        setLocationRelativeTo(null);
        // first label
        title = new JLabel("<html>LES FORMES ET LES VUES<br><hr></html>");
        title.setFont(new Font("Arial", Font.BOLD, 14));
        title.setAlignmentX(CENTER_ALIGNMENT);
        title.setHorizontalAlignment(0);
        // input field 1 and 2
        num1Field = new JTextField(4);
        num2Field = new JTextField(4);
        num1Field.setMaximumSize(new Dimension(70, 20));
        num2Field.setMaximumSize(new Dimension(70, 20));
        // input 1
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new BoxLayout(inputPanel, BoxLayout.X_AXIS));
        inputPanel.add(new JLabel("NOMBRE 1 "));
        inputPanel.add(num1Field);
        // input 2
        inputPanel.add(Box.createHorizontalStrut(20));
        inputPanel.add(new JLabel("NOMBRE 2 "));
        inputPanel.add(num2Field);
        // Operations btns
        sumButton 		= new JButton("SOMME");
        productButton 	= new JButton("PRODUIT");
        factorialButton = new JButton("FACTORIEL");

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.X_AXIS));
        buttonPanel.add(sumButton);
        buttonPanel.add(Box.createHorizontalStrut(10));
        buttonPanel.add(productButton);
        buttonPanel.add(Box.createHorizontalStrut(10));
        buttonPanel.add(factorialButton);
        // result label
        result = new JLabel("<html>RESULTATS<br><hr></html>");
        result.setFont(new Font("Arial", Font.BOLD, 14));
        result.setAlignmentX(CENTER_ALIGNMENT);
        result.setHorizontalAlignment(0);
        // output text label
        outputArea = new JTextArea();
        outputArea.setEditable(false);
        outputArea.setMaximumSize(new Dimension(300, 70));
        //
        quitButton = new JButton("QUITTER");
        traceButton = new JButton("TRACE");
        //
        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(new BoxLayout(bottomPanel, BoxLayout.X_AXIS));

        bottomPanel.add(quitButton);
        bottomPanel.add(Box.createHorizontalStrut(10)); // Add some space between the buttons
        bottomPanel.add(traceButton);
        // Add the components to the frame
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        add(title);
        add(inputPanel);
        add(buttonPanel);
        add(result);
        add(outputArea); 
        add(bottomPanel);
        // Display the frame
        setVisible(true);
        
        sumButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	String num1Str = num1Field.getText();
            	String num2Str = num2Field.getText();
            	String operationNum = "y x +";
            	try {
            	    if (num1Str != null && num2Str != null) {
                	    // passage des arguments
                    	toGUI.dataIN(num1Str);
                    	toGUI.dataIN(num2Str);
                    	toGUI.dataIN(operationNum);
            	    } else {
            	        System.out.println("Input string is null.");
            	    }
            	} catch (NumberFormatException ex2) {
            	    System.out.println("Failed to parse integer: " + ex2.getMessage());
            	}
            }
        });
        productButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	String num1Str = num1Field.getText();
            	String num2Str = num2Field.getText();
            	String operationNum = "y x *";
            	try {
            	    if (num1Str != null && num2Str != null) {
                	    // passage des arguments
                    	toGUI.dataIN(num1Str);
                    	toGUI.dataIN(num2Str);
                    	toGUI.dataIN(operationNum);
            	    } else {
            	        System.out.println("Input string is null.");
            	    }
            	} catch (NumberFormatException ex2) {
            	    System.out.println("Failed to parse integer: " + ex2.getMessage());
            	}
            }
        });
        factorialButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	String num1Str = num1Field.getText();
            	String num2Str = num1Field.getText();
            	String operationNum = "y x !";
            	try {
            	    if (num1Str != null) {
                	    // passage des arguments
                    	toGUI.dataIN(num1Str);
                    	toGUI.dataIN(num2Str);
                    	toGUI.dataIN(operationNum);
            	    } else {
            	        System.out.println("Input string is null.");
            	    }
            	} catch (NumberFormatException ex2) {
            	    System.out.println("Failed to parse integer: " + ex2.getMessage());
            	}
            }
        });
        quitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	System.exit(0); // Terminates the application with status code 0
            }
        });
        traceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	 //path to logfile
            	 File logFile  = new File("C:\\Users\\Hp\\OneDrive\\Bureau\\Java\\TP_AL\\Logfile.txt");
            	 openFile(logFile);
            }
        });
    }
    public static void openFile(File file) {
        if (Desktop.isDesktopSupported()) {
            Desktop desktop = Desktop.getDesktop();
            try {
                desktop.open(file);
            } catch (IOException e) {
                System.err.println("Error opening file: " + e.getMessage());
            }
        } else {
            System.err.println("Desktop not supported");
        }
    }
    public void setResultLabel(int res) {
    	this.outputArea.setText("");
    	this.outputArea.append(Integer.toString(res));
    }
    public void setResultLabel(String res) {
    	this.outputArea.setText("");
    	this.outputArea.append(res);
    }
}