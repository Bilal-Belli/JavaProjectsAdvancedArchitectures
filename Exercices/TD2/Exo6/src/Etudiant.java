import java.util.Arrays;

public class Etudiant extends Personne implements Comparable {

	protected int matricule;
	protected double[] notes;
	static double[]  notes_etu = new double[3];
	public Etudiant(String nom, String prenom, int age, int matricule, double[] notes) {
		super(nom, prenom, age);
		this.matricule = matricule;
		this.notes = notes;
	}

	public double claculMoyenne(double[] notes) {
		return ((notes[0] + notes[1] + notes[2]) / 3);
	}

	public void afficher() {
		System.out.println("---------------------------");
		System.out.println("nom:    " + nom);
		System.out.println("prenom: " + prenom);
		System.out.println("age:    " + age);
		System.out.println("matricule: " + matricule);
		System.out.println("notes:    " + Arrays.toString(notes));
	}

	public void afficherType() {
		System.out.println("---------------------------");
		System.out.println("Etudiant");
	}

	public void compareTo() {
		Arrays.sort(notes_etu);
	}
}
