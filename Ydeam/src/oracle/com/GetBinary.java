package oracle.com;

public class GetBinary {
	// 이진수를 구하는 함수 (재귀)
	public static void Function(int num) {
		if (num / 2 == 0)
			System.out.print("1");
		else {
			Function(num/2);
			System.out.print(num % 2);
		}
	}
	
	// main
	public static void main(String[] args) {
		Function(16);
		System.out.println("");
		Function(325);
		System.out.println("");
		Function(1023);
	}
}
