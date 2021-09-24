import java.util.ArrayList;
import java.util.List;

public class Netmusic {
	protected List<Album> albums = new ArrayList<Album>();
	protected List<Client> clients = new ArrayList<Client>();

	public Netmusic(List<Album> albums, List<Client> clients) {
		super();
		this.albums = albums;
		this.clients = clients;
	}

	public void afficherAlbumsETclients() {
		System.out.println("---------------------------");
		System.out.println("Albums:    ");
		for (Album elem : albums) {
			System.out.println(elem);
		}
		System.out.println("Clients: ");
		for (Client elem : clients) {
			System.out.println(elem);
		}
		System.out.println("---------------------------");
	}

	public void affichageAuthentification(Client etrie_a_comparer) {
		for (Client elem : clients) {
			if (elem == etrie_a_comparer) {
				System.out.println("CLIENT EXISTE");
			} else {
				System.out.println("CLIENT NON EXISTE");
			}
		}
	}

	public void affichageAuthentificationMotPasse(Client etrie_a_comparer, String motPasseEntie) {
		for (Client elem : clients) {
			if (elem == etrie_a_comparer ) {
				if ( elem.compte.motPasse == motPasseEntie) {
					System.out.println("CLIENT EXISTE");
					System.out.println("MOT PASSE VRAI");
				} 
				else {
					System.out.println("CLIENT EXISTE");
					System.out.println("MOT PASSE FAUX");
				} 
			}
		}
	}

	public List<Album> getAlbums() {
		return albums;
	}

	public void setAlbums(List<Album> albums) {
		this.albums = albums;
	}

	public List<Client> getClients() {
		return clients;
	}

	public void setClients(List<Client> clients) {
		this.clients = clients;
	}

}
