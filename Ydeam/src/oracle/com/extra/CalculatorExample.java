package oracle.com.extra;
//
public class CalculatorExample {
	public static void main(String[] args) {
		int result = Calculator.minus(5, 3);
		System.out.println(result);
		
		double result2 = Calculator.minus(3.5, 1.4);
		System.out.println(result2);
		
		double result3 = Calculator.execute(2.5, 5.0, "*");
		System.out.println(result3);

		double result4 = Calculator.execute(5.0, 1.7, "-");
		System.out.println(result4);
		
		double result5 = Calculator.execute(3.5, 1.3, "+");
		System.out.println(result5);
	}
}
