import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FilterTrace extends Filter {
    public FilterTrace(Pipe dataINPipe, Pipe dataOUTPipe) {
        super(dataINPipe, dataOUTPipe);
    }
 
    @Override
    public void execute() {
        String outputData = getData();
        String data1 = getData();
        String data2 = getData();
        String data3 = getData();
        
        //System.out.println("Data passed through FilterTrace: " + outputData);
        //System.out.println("Data passed through FilterTrace: " + data1);
        //System.out.println("Data passed through FilterTrace: " + data2);
        //System.out.println("Data passed through FilterTrace: " + data3);
        
        char lastChar = data3.charAt(data3.length() - 1); //Symbol d'operation * + !
        
        File file = new File("C:\\Users\\Hp\\OneDrive\\Bureau\\Java\\TP_AL\\Logfile.txt");
        try {
    	    FileWriter writer = new FileWriter(file, true);
    	    if (String.valueOf(lastChar).equals("!")) {
    	    	writer.write("\n"+outputData+" = "+data1+" "+lastChar);
    	    } else {
    	    	writer.write("\n"+outputData+" = "+data1+" "+lastChar+" "+data2);
    	    }
    	    writer.close();
    	    //System.out.println(" log added successfully ");
    	} catch (IOException ex) {
    	    System.out.println("Error writing to file: " + ex.getMessage());
    	}
        
        sendData(outputData);
    }
}