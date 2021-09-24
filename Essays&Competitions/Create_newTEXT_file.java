import java.util.Formatter;
public class Main {
	
	  public static void main(String[ ] args) {
	  try {
	    Formatter f = new Formatter("C:\\Users\\LENOVO\\eclipse-workspace\\Using_Files_First\\nom_fichier.txt");
	    f.format("my First name is:%s  And the Second is: %s","bilal","belli \n");
	    f.format("my First name is:%s  And the Second is: %s","bilal","belli");
	    f.close();
	  } catch (Exception e) {
	      System.out.println("Error");
	  }
	  }
}
