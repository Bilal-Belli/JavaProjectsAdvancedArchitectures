import java.util.ArrayList;
import java.util.List;

abstract class Album {
	protected Categorie categorie;
	protected String titre;
	protected String nomAuteur;
	protected int maisonProduction;
	protected int anneeEdition;
	protected int prix; 
	protected  List<String> titres = new ArrayList<String>();
	public Album(Categorie categorie, String titre, String nomAuteur, int maisonProduction, int anneeEdition, int prix,
			List<String> titres) {
		super();
		this.categorie = categorie;
		this.titre = titre;
		this.nomAuteur = nomAuteur;
		this.maisonProduction = maisonProduction;
		this.anneeEdition = anneeEdition;
		this.prix = prix;
		this.titres = titres;
	}
 
	public abstract double calculerPrix();
	
}
