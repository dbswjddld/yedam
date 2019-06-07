package oracle.com;

import java.util.Scanner;

public class MethodSample {
	public static void main(String[] args) {
		int res = multi(3, 5);
		println(res);
		println(Integer.toString(res));
		// 형 변환해서 출력하기
		// Integer.toString() :int형을 string형으로 변환
		println("안녕" + res); // String형을 입력
		
		System.out.println("두 수의 절댓값의 차이는 " + absMinus(-3,-5));
		System.out.println("두 수의 나눗셈은 " + devide(3,5));
		
		Scanner sc = new Scanner(System.in);
		System.out.print("input int first value :");
		int num1 = sc.nextInt();
		System.out.print("input int second value :");
		int num2 = sc.nextInt();
		System.out.println("두 수의 곱은 " + (num1 * num2) );
	}

	public static int multi(int n1, int n2) { // 입력받은 두 수의 곱을 계산하는 메소드
		return n1 * n2;
	}

	public static void println(String msg) { // 입력받은 String변수를 화면에 보여주는 메소드
		System.out.println(msg + "\t(String)");
	}

	public static void println(int msg) {
		System.out.println("입력한 수는 " + msg + "입니다 (int)");
	}

	
	
	public static int absMinus(int a, int b) {
		return a > b ? a-b : b-a;
		// 조건식?참일때:거짓일때;
	}

	public static double devide(int a, int b) {
		if (a*b == 0) {	// a,b 둘 중 하나라도 0일때
			System.out.println("0 입력 금지");
			return 0;
		}
		else return (double)a / (double) b;
	}
}
