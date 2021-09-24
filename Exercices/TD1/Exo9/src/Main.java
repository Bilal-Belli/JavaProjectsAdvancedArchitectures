import java.util.ArrayList;
import java.util.List;
public class Main {
	public static void main(String[] args) {
		List<Salle>  listSalles    = new ArrayList<Salle>();
		List<Client> listClients	= new ArrayList<Client>();
		List<Seance> listeSeances	= new ArrayList<Seance>();
		
		/* INITIALISATIONS POUR TESTER LE CODE */
		
		String acteurs1[]   = {"acteur1_1","acteur1_2"}; 
		String acteurs2[]   = {"acteur2_1","acteur2_2"};
	    
	    Film film1 = new Film("heros_1","2021","auteur1", acteurs1,"un bon film ancien");
	    Film film2 = new Film("heros_2","2021","auteur2", acteurs2,"un bon film nouveau");
		
	    Seance seance1 = new Seance(1,"10/11/2021","10:00","12:00",250,"Films1");
	    Seance seance2 = new Seance(2,"10/11/2021","16:00","18:00",250,"Films2");
	    Seance seance3 = new Seance(3,"10/11/2021","18:00","20:00",250,"Films3");
	     
	    listeSeances.add(seance1);
	    listeSeances.add(seance2);
	    listeSeances.add(seance3);
	    
	    Salle salle1 = new Salle("salle1",20,listeSeances,3,18); //suposons qu'il ont les memes seances et les memes films
	    Salle salle2 = new Salle("salle2",20,listeSeances,3,18);
	    
	    listSalles.add(salle1);
	    listSalles.add(salle2); 
	    
	    Client client1 = new Client("001",30);
	    Client client2 = new Client("010",20);
	    Client client3 = new Client("011",13);
	    Client client4 = new Client("100",15); 
	    
	    listClients.add(client1);
	    listClients.add(client2);
	    listClients.add(client3);
	    // listClients.add(client4);  pour tester les autres fonctionnalities
		
		Cinema cinema = new Cinema("opera alger","alger", listSalles,listClients,listeSeances);
		cinema.reserver(client1, salle1);
		cinema.calculer_tarif(client1, seance1);
		/*cinema.afficher();
		film1.afficher(); 
		seance1.afficher();
		salle1.afficher(); */
	}
}
