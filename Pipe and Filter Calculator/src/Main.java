public class Main {
    public static void main(String[] args) {
    	
    	Pipe toGUI = new PipeQueue();
    	Pipe guiToCalcPipe = new PipeQueue();
        Pipe calcToTracePipe = new PipeQueue(); 

        Gui interfaceGrafique = new Gui(toGUI);
        
        Thread listenerThread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    synchronized (toGUI) {
                        if (!toGUI.pipeVide()) {
                            // execute the filters in a specific order
                            FilterGUI guiFilter 		= new FilterGUI(toGUI, guiToCalcPipe);
                            guiFilter.run();
                            FilterCalcul calculFilter 	= new FilterCalcul(guiToCalcPipe, calcToTracePipe);
                            calculFilter.run();
                            FilterTrace traceFilter 	= new FilterTrace(calcToTracePipe, toGUI);
                            traceFilter.run();
                            interfaceGrafique.setResultLabel(toGUI.dataOUT());
                            // clear the data for the next execution
                            toGUI.dataFlush();
                        }
                    }
                }
            }
        });
        listenerThread.start();
    }
}