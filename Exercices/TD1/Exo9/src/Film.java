import java.util.Arrays;
public class Film {
	private String titre;
	private String anne_production;
	private String auteur;
	private String acteurs[]; 
	private String resumer; 
	
	public void afficher() {
		System.out.println("Titre: "+titre+" Anne_production: "+anne_production+" Auteur: "+auteur+" Acteurs: "+Arrays.toString(acteurs) +" Resumer: "+resumer); 
	} 
	public Film(String titre, String anne_production, String auteur, String[] acteurs, String resumer) {
		super();
		this.titre = titre;
		this.anne_production = anne_production;
		this.auteur = auteur;
		this.acteurs = acteurs;
		this.resumer = resumer;
	}
 
}
