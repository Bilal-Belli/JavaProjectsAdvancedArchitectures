import java.util.LinkedList;
import java.util.Queue;
public class Pipe {
    private Queue<String> inData;
    
    public Pipe() {
        inData = new LinkedList<String>();
    }
    
    public void dataIN(String data) {
        inData.add(data);
    }
    
    public String dataOUT() {
        return inData.poll();
    }
    
    public void dataFlush() {
    	inData.clear();
    }
    
    public boolean pipeVide() {
    	if(inData.isEmpty()) {
    		return true;
    	} else {
    		return false;
    	}
    }
}