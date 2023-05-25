import java.util.HashMap;
import java.util.Map;

public class FilterCalcul extends Filter {
    public FilterCalcul(Pipe _dataINPipe, Pipe _dataOUTPipe) {
        super(_dataINPipe, _dataOUTPipe);
    }

    @Override
    public void execute() {
        String data1 = getData();
        String data2 = getData();
        String data3 = getData();
        
        int num1 = Integer.parseInt(data1);
        int num2 = Integer.parseInt(data2);
        String op = data3;
        
        Evaluator exp = new Evaluator(op);
        Map<String,Expression> variables = new HashMap<String,Expression>();
        String variableName1 = "x";
        int variableValue1 = num1;
        variables.put(variableName1, new Number(variableValue1));
        String variableName2 = "y";
        int variableValue2 = num2;
        variables.put(variableName2, new Number(variableValue2));
        int result = exp.interpret(variables);
        //System.out.println("Result: " + result);
        String outputData = String.valueOf(result);
        
        //System.out.println("Data passed through FilterCalcul: " + num1);
        //System.out.println("Data passed through FilterCalcul: " + num2);
        //System.out.println("Data passed through FilterCalcul: " + op);
        
        sendData(outputData);
        sendData(data1);
        sendData(data2);
        sendData(data3);
    }
}
