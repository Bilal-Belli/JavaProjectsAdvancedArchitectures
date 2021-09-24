import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// ------------- Question A ------------------
		/*
		 * Scanner scanner = new Scanner(System.in);
		 * 
		 * System.out.print("Entrer le nom: "); String nom = scanner.next();
		 * 
		 * System.out.print("Enter le prenom: "); String prenom = scanner.next();
		 * 
		 * System.out.print("Enter l'age': "); int age = scanner.nextInt();
		 * 
		 * 
		 * System.out.println("nom:    "+nom ); System.out.println("prenom: "+prenom );
		 * System.out.println("age:    "+age ); Personne[] tab_personnes = new
		 * Personne[5];
		 */

		// ------------- Question B ------------------

		/*
		 * Personne[] tab_personnes = new Personne[5]; // la boucle de remplissage de la
		 * partie enseignant for (int i = 0; i < 2; i++) { Scanner scanner = new
		 * Scanner(System.in); System.out.print("Entrer le nom ens: "); String nom =
		 * scanner.nextLine(); System.out.print("Enter le prenom: "); String prenom =
		 * scanner.nextLine(); System.out.print("Enter l'age': "); int age =
		 * scanner.nextInt(); System.out.print("Enter num_sec_soc: "); long num_sec_soc
		 * = scanner.nextLong(); System.out.print("Enter modules: "); String[] modules =
		 * new String[3]; for (int j = 0; j < 3; j++) { modules[j] = scanner.next(); }
		 * tab_personnes[i] = new Enseignant(nom, prenom, age, num_sec_soc, modules); }
		 * // la boucle de remplissage de la partie etudiant for (int i = 2; i < 5; i++)
		 * { Scanner scanner = new Scanner(System.in);
		 * System.out.print("Entrer le nom etu: "); String nom = scanner.nextLine();
		 * System.out.print("Enter le prenom: "); String prenom = scanner.nextLine();
		 * System.out.print("Enter l'age': "); int age = scanner.nextInt();
		 * System.out.print("Enter matricule: "); int matricule = scanner.nextInt();
		 * System.out.print("Enter notes: "); double[] notes = new double[3]; for (int j
		 * = 0; j < 3; j++) { notes[j] = scanner.nextDouble(); } tab_personnes[i] = new
		 * Etudiant(nom, prenom, age, matricule, notes); } for (int i = 0; i < 5; i++)
		 * {// la boucle de l'affichage tab_personnes[i].afficherType();
		 * tab_personnes[i].afficher(); }
		 */
		
		// ------------- Question C ------------------

		Enseignant[] tabEnseignant = new Enseignant[2];// une declaration des deux tableaux au lieu de un seul
		Etudiant[] tabEtudiant = new Etudiant[3];

		for (int i = 0; i < 2; i++) {// le remplissage du premier tableau d'apres l'utilisateur
			Scanner scanner = new Scanner(System.in);
			System.out.print("Entrer le nom ens: ");
			String nom = scanner.nextLine();
			System.out.print("Enter le prenom: ");
			String prenom = scanner.nextLine();
			System.out.print("Enter l'age': ");
			int age = scanner.nextInt();
			System.out.print("Enter num_sec_soc: ");
			long num_sec_soc = scanner.nextLong();
			System.out.print("Enter modules: ");
			String[] modules = new String[3];
			for (int j = 0; j < 3; j++) {
				modules[j] = scanner.next();
			}
			tabEnseignant[i] = new Enseignant(nom, prenom, age, num_sec_soc, modules);
		}
		for (int i = 0; i < 3; i++) {// le remplissage du deusieme tableau d'apres l'utilisateur
			Scanner scanner = new Scanner(System.in);
			System.out.print("Entrer le nom etu: ");
			String nom = scanner.nextLine();
			System.out.print("Enter le prenom: ");
			String prenom = scanner.nextLine();
			System.out.print("Enter l'age': ");
			int age = scanner.nextInt();
			System.out.print("Enter matricule: ");
			int matricule = scanner.nextInt();
			System.out.print("Enter notes: ");
			double[] notes = new double[3];
			for (int j = 0; j < 3; j++) {
				notes[j] = scanner.nextDouble();
			}
			tabEtudiant[i] = new Etudiant(nom, prenom, age, matricule, notes);
		}
		
		for (int i = 0; i < 2; i++) {// la boucle de l'affichage du premier tableau
			tabEnseignant[i].afficher();
		}
		for (int i = 0; i < 3; i++) {// la boucle de l'affichage du deusieme tableau
			tabEtudiant[i].afficher();
		}
		
		tabEnseignant[0].compareTo(); // car c'est un tableau static
		tabEtudiant[0].compareTo(); // car c'est un tableau static

		//Arrays.toString(tabEnseignant[0].noms_ens);
		Arrays.toString(tabEtudiant[0].notes);
		System.out.println(Arrays.toString(tabEtudiant[0].notes));
	}
}