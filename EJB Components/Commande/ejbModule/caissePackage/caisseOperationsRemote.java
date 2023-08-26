package caissePackage;
import javax.ejb.Remote;
import java.util.Map;

@Remote
public interface caisseOperationsRemote {
	public Map<Integer, Integer> effectuerPaiement(int montant);
}
