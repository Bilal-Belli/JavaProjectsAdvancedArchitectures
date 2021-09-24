
public class Client {
	private String numero_client;
	private int nb_film_assister;
	
	public Client(String numero_client, int nb_film_assister) {
		super();
		this.numero_client = numero_client;
		this.nb_film_assister = nb_film_assister;
	}
	
	public void afficher() {
		System.out.println("Numero_client: "+numero_client+" NB_film_assister: "+nb_film_assister); 
	}
	public String getNumero_client() {
		return numero_client;
	}
	public void setNumero_client(String numero_client) {
		this.numero_client = numero_client;
	}
	public int getNb_film_assister() {
		return nb_film_assister;
	}
	public void setNb_film_assister(int nb_film_assister) {
		this.nb_film_assister = nb_film_assister;
	}
}
