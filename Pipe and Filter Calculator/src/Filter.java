public abstract class Filter implements Runnable {
    private Pipe dataINPipe;//pipe  -> data entered in filter , so this is the pipe before filter
    private Pipe dataOUTPipe;//data go out from filter -> pipe , so this is the pipe after filter
    
    public Filter(Pipe dataINPipe, Pipe dataOUTPipe) {
        this.dataINPipe = dataINPipe;
        this.dataOUTPipe = dataOUTPipe;
    }
    
    public String getData() {
        return dataINPipe.dataOUT();
    }
    
    public void sendData(String data) {
        dataOUTPipe.dataIN(data); //la sortie d'un filtre est l'entrie du pipe
    }

	public abstract void execute();
    
    @Override
    public void run() {
        execute();
    }
}