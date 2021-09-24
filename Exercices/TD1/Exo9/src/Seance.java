 public class Seance {
	
	private int numero;
	private String date;
	private String heurdebut;
	private String heurfin;
	private int tarif; 
	private String film;

 

	public Seance(int numero, String date, String heurdebut, String heurfin, int tarif, String film) {
		super();
		this.numero = numero;
		this.date = date;
		this.heurdebut = heurdebut;
		this.heurfin = heurfin;
		this.tarif = tarif;
		this.film = film;
	}

	public void afficher() {
		System.out.println("Numero: "+numero+" Date: "+date+" Heurdebut: "+heurdebut+" Heurfin: "+heurfin+" Tarif: "+tarif+" Film: "+film); 
	}
	
	public void incrimenterPlace() {
		 
	}
	
	
 
	public int getTarif() {
		return tarif;
	}
	public void setTarif(int tarif) {
		this.tarif = tarif;
	} 
}
