import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		// Création de NetMusic
		List<Client> clients = new ArrayList<Client>();
		List<Album> albums = new ArrayList<Album>();
		Netmusic site = new Netmusic(albums, clients);

		/*** I. Gestion des clients ***/
		// A. Création de Compte 
		
		List<Album> panier1 = new ArrayList<Album>();
		panier1.add(null);
		Compte Compte1_1 = new Compte("bilal_belli","mon1motpasse",1200, panier1); 
		// 1. Création d'un client qui n'existe pas
		Client client1 = new Client("belli","bilal","Camp Chevalier",Compte1_1); 
		site.clients.add(client1);
		// 2. Test de création d'un client qui existe
		client1.afficherClient();
		// 3. Test de création d'un compte avec un nom d'utilisateur existant
		Compte1_1.afficherCompte();
		// 4. Création d'un compte avec un nom d'utilisateur différent
		List<Album> panier2 = new ArrayList<Album>();
		panier2.add(null);
		Compte Compte1_2 = new Compte("bi_bel","mon2motpasse",1400, panier2); 
		// B. Authentification

		// 1. Test d’authentification d'un client qui n'existe pas
		site.affichageAuthentification(client1);
		// 2. Test d’authentification d'un client qui existe mais mot de passe
		// incorrecte
		site.affichageAuthentificationMotPasse(client1, "fdsdsdf");
		// 3. Test d’authentification d'un client qui existe avec mot de passe correcte
		site.affichageAuthentificationMotPasse(client1, "mon1motpasse");
		
		/*** II. Gestion du catalogue d'Album ***/
		// A. Création et affichage des albums

		// 1. Ajouter des albums physiques et numériques au catalogue
		
		// 2. Consulter le catalogue d’album

		// B. Achat et Remboursement des albums

		// 1. Achat de deux albums physique
		// 2. Achat d'un album numérique
		// 3. Remboursement d'un album physique dans un délai >7 jours
		// 4. Remboursement d'un album physique dans un délai de 7 jours

		/*** III. Gestion du catalogue de magazines ***/
		// A. Création et affichage des magazines

		// 1. Ajouter des magazines au catalogue
		// 2. Consulter le catalogue de magazines

		// B. Achat et Remboursement des magazines

		// 1. Achat d’un magazine sans avoir le solde suffisant pour le faire
		// 2. Créditer le compte avec 500 DA
		// 3. Achat de deux magazines
		// 4. Remboursement d'un magazine dans un délai >7 jours
		// 5. Remboursement d'un magazine dans un délai de 7 jours
	}

}
