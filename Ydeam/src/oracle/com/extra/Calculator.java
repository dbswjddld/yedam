package oracle.com.extra;

public class Calculator {
	// 정수 덧셈
	static int add(int a, int b) {
		return a + b;
	}

	// 소수 덧셈
	static double add(double a, double b) {
		return a + b;
	}

	// 정수 뺄셈
	static int minus(int a, int b) {
		return a - b;
	}

	// 소수 뺄셈
	static double minus(double a, double b) {
		return a - b;
	}

	// 정수 곱셈
	static int multi(int a, int b) {
		return a * b;
	}

	// 소수 곱셈
	static double multi(double a, double b) {
		return a * b;
	}

	// 세 번째 인수로 받은 기호 (+ - *)에 따라 해당 연산을 수행
	static double execute(double a, double b, String str) {
		switch(str) {
		case "+":
			return add(a,b);
		case "-":
			return minus(a,b);
		case "*":
			return multi(a,b);
		default:
			System.out.println("+ - * 중 하나를 입력하세요");
			return 0;
		}
	}
}
