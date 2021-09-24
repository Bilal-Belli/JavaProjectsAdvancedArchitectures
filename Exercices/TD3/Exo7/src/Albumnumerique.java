import java.util.List;

public class Albumnumerique extends Album {
	private String url;
 
  
	
	public Albumnumerique(Categorie categorie, String titre, String nomAuteur, int maisonProduction, int anneeEdition,
			int prix, List<String> titres, String url) {
		super(categorie, titre, nomAuteur, maisonProduction, anneeEdition, prix, titres);
		this.url = url;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	public double calculerPrix(){
		return ((this.prix*5)/100);
	};
}
