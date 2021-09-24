
public class Client {
	protected String nom;
	protected String prenom;
	protected String adress;
	protected Compte compte;

	public Client(String nom, String prenom, String adress, Compte compte) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adress = adress;
		this.compte = compte;
	}

	public void afficherClient() {
		System.out.println("---------------------------");
		System.out.println("nom:    " + nom);
		System.out.println("prenom: " + prenom);
		System.out.println("adress:    " + adress);
		System.out.println("compte:    " + compte);
	}

}
