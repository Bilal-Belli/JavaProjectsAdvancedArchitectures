 import java.util.Map;

class Factorial implements Expression {
	 Expression leftOperand;
	 Expression rightOperand;
	 public Factorial(Expression left, Expression right) {
		 leftOperand = left;
		 rightOperand = right;
	 }
	 public int interpret(Map<String,Expression> variables) {
		 int k1= leftOperand.interpret(variables);
		 int result=k1;
		 for(int i=1;i<k1;i++) {
			 result*=(k1-i);
		 }
		 return result;
	 }
}