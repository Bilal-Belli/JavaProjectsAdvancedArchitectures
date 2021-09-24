abstract class Personne {
	protected String nom;
	protected String prenom;
	protected int age;

	public Personne(String nom, String prenom, int age) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}

	public void afficher() {
		System.out.println("---------------------------");
		System.out.println("nom:    " + this.nom);
		System.out.println("prenom: " + this.prenom);
		System.out.println("age:    " + this.age);
	}

	public abstract void afficherType();			
}