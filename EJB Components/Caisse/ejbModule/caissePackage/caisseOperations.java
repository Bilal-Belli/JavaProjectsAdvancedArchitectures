package caissePackage;
import javax.ejb.Stateless;
import java.util.*;

@Stateless
public class caisseOperations implements caisseOperationsRemote {

	@Override
	public Map<Integer, Integer> effectuerPaiement(int change) {
		// calcul le nombre de pieces a retourner
	    Map<Integer, Integer> pieces = new HashMap<>();
	    int[] denominations = {200, 100, 50, 20, 10, 5}; // Available denominations in descending order
	    
	    for (int denomination : denominations) {
	        int quantity = change / denomination; // Calculate the quantity of the current denomination
	        if (quantity > 0) {
	            pieces.put(denomination, quantity); // Add the denomination and its quantity to the map
	            change -= quantity * denomination; // Update the remaining change
	        }
	    }
	    return pieces;
	}
}