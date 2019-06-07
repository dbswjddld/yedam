package oracle.com;

public class Controls {
	public static void main(String[] args) {
		boolean bool = false;
		int num1 = 10;
		int num2 = 20;
		bool = (num1 > num2);
		System.out.println(bool);

		if (bool)
			System.out.println("true!!");
		else
			System.out.println("false!!");

		// 처음 true인 경우에만 실행
		if (num1 > 0)
			System.out.println("0 초과");
		else if (num1 > 5)
			System.out.println("5 초과");
		else if (num1 > 10)
			System.out.println("10 초과");
		else
			System.out.println("else");

		if (num1 > 0) {	// num1 > 0일때 다음 구문 실행
			if(num1%2==0)
				System.out.println("num1은 2의 배수이다");
			else
				System.out.println("num1은 2의 배수가 아니다");
		}
		else	// num <= 0일때 다음 구문 실행
			System.out.println("num1은 양수가 아니다");
	}
}
