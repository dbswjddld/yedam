package oracle.com;

public class Calc {
	public static double PI = 3.14;
	// static : 정적 필드

	public static int add(int a, int b) {
		return (a + b);
	}

	public static double multi(double a, double b) {
		return (a * b);
	}

	public static double getCircleArea(int r) {
		return (r * r) * PI;
	}

	public static int min(int a, int b) {
		return a < b ? a : b;
	}
}