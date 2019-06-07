package oracle.com;

import java.util.Scanner;

public class PersonSample {
	public static void main(String[] args) {
		int option;
		Scanner sc = new Scanner(System.in);
		Person kim = new Person("minji", 24);
		
		while (true) {
			System.out.print("\n무엇을 하시겠습니까? (1:정보보기 2:걷기 3:뛰기 4:먹기)");
			option = sc.nextInt();

			switch (option) {
			case 1:
				kim.info();
				break;
			case 2:
				kim.walking();
				break;
			case 3:
				kim.running();
				break;
			case 4:
				kim.eating();
				break;
			default:
				System.out.println("1~4 중에서 고르세요");
			}
		}
	}
}
