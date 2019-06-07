package oracle.com;

public class MethodDef {
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		hiEveryOne(3);
		hiEveryOne(24, 16.32);	// 인수의 개수가맞는 함수를 호출한다
		System.out.println("평균 : " + avg(30,33));
		goodBye();
		System.out.println("프로그램 종료");
	}
	public static void hiEveryOne(int age) {
		System.out.println("hello everyone");
		System.out.println("I am " + age + " old");
	}
	public static void hiEveryOne(int age, double height) {
		System.out.println("hello everyone");
		System.out.println("I am " + age + " old");
		System.out.println("I am " + height + " cm");
	}
	public static void goodBye() {
		System.out.println("bye bye~~");
	}
	public static double avg(int n1, int n2) {
		return ((double)n1 + (double)n2) / 2;	// (double) :형변환
	}
}
