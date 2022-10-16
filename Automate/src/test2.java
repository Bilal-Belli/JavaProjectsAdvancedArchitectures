import java.util.Scanner;
public class test2 {
	public static void main(String[] args) {
		while (true) {
			Scanner myWord = new Scanner(System.in);
			System.out.print("\nEnter your word: ");
			if ( PL2(myWord.nextLine()) == true ) {
				System.out.print(" Ce mot appartient au Langage L2 ");
			} else {
				System.out.print(" Ce mot n'appartient pas au Langage L2 ");
			}
		}
	}
	
	static boolean PL2(String word) {
		boolean result = true;
		int[][] automateMatrice = {{0, 2, 0, 2, 0, 2}, {7, 3, 1, 3, 1, 3}};
		int maxLengthWord = word.length();
		int currentState = 6;
//		S=6 A=0 B=1 C=2 D=3 E=4 F=5 Undefined=7
		for (int i=0;i<maxLengthWord;i++) {
			if(i==0) {
//				first letter
				if(Character.getNumericValue(word.charAt(i)) == 0) {
					System.out.println("oldState : "+currentState);
					currentState = 4;
					System.out.println("currentState : "+currentState);
				}else {
					if (Character.getNumericValue(word.charAt(i)) == 1) {
						System.out.println("oldState : "+currentState);
						currentState = 5;
						System.out.println("currentState : "+currentState);
					}
				}
			}
			if(i>=1) {
//				rest letters
				System.out.println("oldState : "+currentState);
				currentState = automateMatrice[Character.getNumericValue(word.charAt(i))][currentState];
				System.out.println("currentState : "+currentState);
			}
			if (currentState == 7) {
//				une foix on attent l'etat undifinie (001) on s'arrete avec une resultat negatif
				result = false;
				break;
			}
		}
		return result;
	}
}