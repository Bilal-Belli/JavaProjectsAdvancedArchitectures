import java.util.Scanner;
public class test {
	public static void main(String[] args) {
		Scanner myWord = new Scanner(System.in);
		System.out.print("Enter your word: ");
		System.out.print("The result is : "+myMethod(myWord.nextLine()));
	}
	
	static boolean myMethod(String word) {
		boolean result = true;
		int[][] automateMatrice = {{2, 3, 0, 1}, {1, 0, 3, 2}};
		int maxLengthWord = word.length();
		int currentState = 0;	
		
		for (int i=0;i<maxLengthWord;i++) {
			System.out.println("currentState : "+currentState);
			currentState = automateMatrice[Character.getNumericValue(word.charAt(i))][currentState];
			System.out.println("currentState : "+currentState);
		}
		
		if (currentState != 1) {
			result = false;
		}
		return result;
	}
}