package oracle.com;

public class NewJavaProgram {
	public static void main(String[] args) {
		int result, num1, num2;
		num1 = 10;
		num2 = 20;
		result = num1 + num2 * 3 + 30 / num1 - 10;
		System.out.println(result);
		// 연산에는 우선순위와 순서가 존재한다.

		result += 20; // result = result + 20;
		System.out.println(result);

		boolean bool1;
		bool1 = (1 < num1); // 1 < num1이 맞으므로 bool1 == true
		System.out.println(bool1);

		bool1 = (1 < num1) && (10 < num2); // && :AND

		bool1 = !bool1;
		System.out.println(bool1);

		// 비트연산 :& | ^ ~
		// ^ :같으면 0, 다르면 1

		int a = 5;
		int b = 2;
		result = a & b;
		System.out.println(a + "&" + b + "=" + result);
		
	}
}
