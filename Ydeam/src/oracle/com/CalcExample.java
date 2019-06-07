package oracle.com;

public class CalcExample {
	public static void main(String[] args) {
		int num1, num2;
		num1 = 10;
		num2 = 5;
		int result = Calc.add(num1, num2);
		System.out.println(result);
		
		System.out.println(Calc.multi(4.5,2));
		System.out.println(Calc.getCircleArea(3));
		
		System.out.println(Math.PI);
		
		System.out.println(Calc.min(3, 5));
		System.out.println(Calc.min(8, 6));
	}
}
