package stockPackage;
import java.util.List;
import java.util.Map;

import javax.ejb.Remote;

@Remote
public interface stockOperationsRemote {
	public boolean choisirBoisson(int numeroBoisson,List<Map<String, Object>> liste);
	public void rechargerStock(String nomBoisson, int quantite);
}
