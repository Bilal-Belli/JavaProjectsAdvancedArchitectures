import java.util.ArrayList;
import java.util.List;

public class Compte {
	protected String nomUtilisateur;
	protected String motPasse;
	protected int solde; 
	protected  List<Album> panier = new ArrayList<Album>();
	
	
	
	public Compte(String nomUtilisateur, String motPasse, int solde, List<Album> panier) {
		super();
		this.nomUtilisateur = nomUtilisateur;
		this.motPasse = motPasse;
		this.solde = solde;
		this.panier = panier;
	}
	
	public void crediter(int argentsCredit){
		this.solde -= argentsCredit;
	}
	public void debiter(int argentsDebit){
		this.solde -= argentsDebit;
	}
	
	public void afficherCompte(){
		System.out.println("---------------------------");
		System.out.println("nomUtilisateur:    " + nomUtilisateur);
		System.out.println("motPasse: " + motPasse);
		System.out.println("solde:    " + solde); 
		System.out.println("panier:    " );
		for ( Album elem : panier ) {
			System.out.println(elem);
		}
	}
	
}
