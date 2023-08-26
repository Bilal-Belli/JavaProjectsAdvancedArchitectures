package commandePackage;
import javax.ejb.Remote;

@Remote
public interface commandeOperationsRemote {
	public int passerCommande(int numeroBoisson, int montant);
	public void effectuerMaintenanceCaisse(int id_piece, int quantite);
	public void effectuerMaintenanceStock(String name, int price, int quantity);
}