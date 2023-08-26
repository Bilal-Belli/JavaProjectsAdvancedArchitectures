package caissePackage;
import java.util.Map;
import javax.ejb.Remote;

@Remote
public interface caisseOperationsRemote {
	public Map<Integer, Integer> effectuerPaiement(int montant);
}
