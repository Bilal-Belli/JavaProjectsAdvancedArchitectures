public class FilterGUI extends Filter {
    public FilterGUI(Pipe dataINPipe, Pipe dataOUTPipe) {
        super(dataINPipe, dataOUTPipe);
    }
    
    @Override
    public void execute() {
        String data1 = getData();
        String data2 = getData();
        String data3 = getData();
        
        //System.out.println("Data passed through FilterGUI: " + data1);
        //System.out.println("Data passed through FilterGUI: " + data2);
        //System.out.println("Data passed through FilterGUI: " + data3);
        
        // ce filtre fait le passage des entries vers le filtre calcule, mais comme le pipe ne
        // doit contenir que des données basiques (string), alors cette conversion est
        // inutile
        
        //int num1 = Integer.parseInt(data1);
        //int num2 = Integer.parseInt(data2);
        //String op = data3;
        
        sendData(data1);
        sendData(data2);
        sendData(data3);
    }
}