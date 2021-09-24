import java.util.Arrays;

public class Enseignant extends Personne  implements Comparable {

	protected long num_sec_soc;
	protected String[] modules;
	static String[] noms_ens = new String[2];

	public Enseignant(String nom, String prenom, int age, long num_sec_soc, String[] modules) {
		super(nom, prenom, age);
		this.num_sec_soc = num_sec_soc;
		this.modules = modules;
	}

	public void afficher() {
		System.out.println("---------------------------");
		System.out.println("nom:    " + nom);
		System.out.println("prenom: " + prenom);
		System.out.println("age:    " + age);
		System.out.println("numéro securité sociale: " + num_sec_soc);
		System.out.println("modules:    " + Arrays.toString(modules));
	}

	public void afficherType() {
		System.out.println("---------------------------");
		System.out.println("Enseignant");
	}
	
	public void compareTo() {
		Arrays.sort(noms_ens);
	}
} 