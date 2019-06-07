package oracle.com;

import java.util.Scanner;

public class ScannerQuiz {
	public static void main(String[] args) {
		// 1 사칙연산 계산기 만들기
		System.out.println("사칙연산");
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 수를 입력하세요 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 수를 입력하세요 : ");
		int num2 = sc.nextInt();

		System.out.println("두 수의 합 :" + plus(num1, num2));
		System.out.println("두 수의 차 :" + minus(num1, num2));
		System.out.println("두 수의 곱 :" + mul(num1, num2));
		System.out.println("두 수의 나눗셈 :" + div(num1, num2));

		// 2 숫자를 입력하면 n단 구구단 출력
		System.out.println("\n구구단 숫자 입력 :");
		int num3 = sc.nextInt();
		gugudan(num3);

		// 3 숫자 두 개를 입력받아 구구단 2개 출력
		System.out.print("\n구구단 첫번째 수 입력 :");
		int num4 = sc.nextInt();
		System.out.print("구구단 두번째 수 입력 :");
		int num5 = sc.nextInt();
		gugudan(num4,num5);
		
	}

	// 1 사칙연산 덧셈, 뺄셈, 곱셈, 나눗셈
	public static int plus(int n1, int n2) {
		return n1 + n2;
	}

	public static int minus(int n1, int n2) {
		return n1 - n2;
	}

	public static int mul(int n1, int n2) {
		return n1 * n2;
	}

	public static double div(int n1, int n2) {
		return (double) n1 / (double) n2;
	}

	// 2 구구단 출력
	public static void gugudan(int n) {
		for (int temp = 1; temp <= 9; temp++)
			System.out.println(n + " * " + temp + " = " + (n * temp));
	}

	// 3 구구단 두개 나란히 출력
	public static void gugudan(int n1, int n2) {
		for (int temp = 1; temp <= 9; temp++)
			System.out.println(n1 + " * " + temp + " = " + (n1 * temp) + "\t" + 
							   n2 + " * " + temp + " = " + (n2 * temp));
	}
}
