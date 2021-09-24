import java.util.ArrayList;
import java.util.List;

public class Cinema {
	private String nom;
	private String adress;   
	private List<Salle> salles = new ArrayList<Salle>();
	private List<Client> client = new ArrayList<Client>();
	private List<Seance> seance = new ArrayList<Seance>();
	
	public Cinema(String nom, String adress, List<Salle> salles, List<Client> client, List<Seance> seance) {
		super();
		this.nom = nom;
		this.adress = adress;
		this.salles = salles;
		this.client = client;
		this.seance = seance;
	}
	public void afficher() {
		System.out.println("Nom: "+nom+" Adress: "+adress); 
		System.out.println( " seances: " );
		for ( Seance elem : seance ) {
			System.out.println("------------------"  );  
			elem.afficher(); 
			System.out.println("------------------"  ); 
			} 
		System.out.println( " clients: " );
		for ( Client elem : client ) {
			System.out.println("------------------"  );  
			elem.afficher(); 
			System.out.println("------------------"  ); 
			}
		System.out.println( " salles: " );
		for ( Salle elem : salles ) {
			System.out.println("------------------"  );  
			elem.afficher(); 
			System.out.println("------------------"  ); 
			}
	}
	
	public void reserver(Client client,Salle salle) {
		if ( salle.getNb_reservations() < salle.getCapacite()) {
			 salle.setNb_reservations(1+ salle.getNb_reservations());  
			 client.setNb_film_assister(1+ client.getNb_film_assister());
			 System.out.println("Reservation reussit!" );
		}
		else {
			System.out.println("Echec de reservation, pas plus de places !");
		}
	}
	public void calculer_tarif(Client client,Seance seance) {
		if ( 25 <= client.getNb_film_assister() ) {
			 //seance.setTarif( ( seance.getTarif() * 95 )/ 100 ); // la formule de reduction de 5 %
			 System.out.println("Le Tarif pour ce client est:"+( seance.getTarif() * 95 )/ 100);
		}
		else {
			System.out.println("Le Tarif pour ce client est:"+ seance.getTarif() );
		}
	}
}
