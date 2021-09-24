import java.util.List;

public class Albumphysique extends Album implements Delai{
	private int quantite;
 
 
 

	public Albumphysique(Categorie categorie, String titre, String nomAuteur, int maisonProduction, int anneeEdition,
			int prix, List<String> titres, int quantite) {
		super(categorie, titre, nomAuteur, maisonProduction, anneeEdition, prix, titres);
		this.quantite = quantite;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	
	public double calculerPrix(){
		return ((this.prix*10)/100);
	}
	public void rembourser() {
		
	}
	public void echanger(){
		
	}
}
