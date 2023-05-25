import java.util.Scanner;
public class invrs {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
		char[] arr = text.toCharArray();
    
	  // initialisations	
    
		int nb_element = arr.length ; 
		char[] result = new char[nb_element];
		int max_index=nb_element-1;
		int index_loop=nb_element-1; 
		 
    // the loop that reverse all character's
    
	  	for (int i=0;i<nb_element;i++)
		{
	  		result[i]=arr[index_loop];
	  		
	  		index_loop=max_index-i-1;
		} 
    
    // a loop to write the result of reverse
    
	  	for (int i=0;i<nb_element;i++)
		{
			System.out.print(result[i]);
		}
	}

}
