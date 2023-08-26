package stockPackage;
import java.util.List;
import java.util.Map;
import javax.ejb.Stateless;

@Stateless
public class stockOperations implements stockOperationsRemote {

	@Override
	public boolean choisirBoisson(int numeroBoisson, List<Map<String, Object>> liste) {
	    // check if the product exists in the database
	    for (Map<String, Object> map : liste) {
	        Object produit = map.get("Numero");
	        Object quantite = map.get("Quantite");
	        if (produit != null && Integer.valueOf(produit.toString()).equals(numeroBoisson) && Integer.valueOf(quantite.toString()) > 0) {
	            return true;
	        }
	    }
	    return false;
	}
}