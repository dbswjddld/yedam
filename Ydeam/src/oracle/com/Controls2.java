package oracle.com;

public class Controls2 {
	public static void main(String[] args) {
		int num = 1;

		// while loop
		// while(조건) {실행문} -조건이 참인 동안 실행
		while (num < 6) {
			System.out.println("number is " + num++);
		}

		// do while loop
		// do {실행문} while (조건)
		num = 1;
		do {
			System.out.println("number is " + num++);
		} while (num <= 5);

		// 구구단
		num = 1;
		do {
			System.out.println("2 * " + num + " = " + 2 * num);
			num++;
		} while (num <= 9);

		// while문으로 1부터 10까지 출력하기
		num = 1;
		while (num < 11)
			System.out.println(num++);

		// for loop
		// for (초기값;조건;증감값) {실행문}
		for (num = 1; num < 10; num++)
			System.out.println("5 * " + num + " = " + (num * 5));

		// 반복문 중첩
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("i, j => " + i + ", " + j +"\t");
			}
			System.out.println("");
		}
		
		// 위의 반복문을 while문으로 바꾸기
		int i = 0;
		int j = 0;
		while(i < 5) {
			while (j < 5) {
				System.out.print("i, j => " + i + ", " + j +"\t");
				j++;
			}
			i++;
		}
		System.out.println("\n\n");

		// 구구단 2단 ~ 9단 세로출력
		int m = 1;
		for (int temp = 1; temp <= 9; temp++) {
			for(int n = 2; n <= 9; n++) {
				System.out.print(n + "*" + m + "=" + n*m + "\t");
			}
		m++;
		System.out.println("");
		}
		System.out.println("\n\n");
		
		// 구구단 2단은 2까지, 3단은 3까지
		for (int p = 2; p <=9; p++) {
			for (int q = 1; q <=p; q++) {
				System.out.print(p + "*" + q + "=" + p*q + "\t");
			}
			System.out.println("");
		}
		
		// 2,4,6,8단 세로
		for (int m = 1; m <= 9; m++) {
			for(int n = 2; n <= 9; n+=2) {
				if (m>n) System.out.print("\t");
				else System.out.print(n + "*" + m + "=" + n*m + "\t");
			}
		System.out.println("");
		}
		
		//
		for (int m = 2; m <= 8; m+=2) {
			for(int n = 2; n <= 9; n+=2) {
				if (m>n) System.out.print("\t");
				else System.out.print(n + "*" + m + "=" + n*m + "\t");
			}
		System.out.println("");
		}
	}
}
