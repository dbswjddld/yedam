package Interface;

import java.util.Scanner;

public class AcEx {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Ac yedam = new Ac("yj", "java");
		int option = 0;
		boolean flag = true;

		while (flag) {
			System.out.println("1) 교수 정보 입력 2) 학생 정보 입력 3) 반 정보 조회 4) 종료");
			option = scan.nextInt();

			switch (option) {
			case 1:
				System.out.println("교수 이름 입력 :");
				yedam.setProf(scan.next());
				break;
			case 2:
				yedam.setStu();
				break;
			case 3:
				yedam.getInfo();
				break;
			case 4:
				System.out.println("종료합니다...");
				flag = false;
				break;
			}
		}
	}
}
