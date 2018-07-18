package demo;

public class Calculator {

	public int evaluate(String expression) {
		int sum = 0;
		for (String summand: expression.split("\\+")) {
			sum += Integer.valueOf(summand); //Success
			//sum -= Integer.valueOf(summand); //FAIL
		}
		return sum;
	}
}
