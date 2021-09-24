import java.util.ArrayList; 
import java.util.List;
public class Salle {
	private String nom;
	private int capacite;
	private List<Seance> seance = new ArrayList<Seance>();
	private int nb_seance ;
	private int nb_reservations;
	public Salle(String nom, int capacite, List<Seance> seance, int nb_seance, int nb_reservations) {
		super();
		this.nom = nom;
		this.capacite = capacite;
		this.seance = seance;
		this.nb_seance = nb_seance;
		this.nb_reservations = nb_reservations;
	}
	 
	public void afficher() {
		for ( Seance elem : seance ) {
			System.out.println("------------------"  ); 
			System.out.println("nom: "+nom+" capacite: "+capacite+" seance: "  ); 
			elem.afficher(); 
			System.out.println("------------------"  ); 
			}
	}

	public int getCapacite() {
		return capacite;
	}
	public int getNb_reservations() {
		return nb_reservations;
	}
	
	public void setNb_reservations(int nb_reservations) { 
		this.nb_reservations = nb_reservations;
	}
	
	public int getNb_seance() {
		return nb_seance;
	}
	public void setNb_seance(int nb_seance) {
		this.nb_seance = nb_seance;
	}
}
