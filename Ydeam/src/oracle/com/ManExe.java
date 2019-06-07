package oracle.com;

import java.util.Scanner;

public class ManExe {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Man[] mArr = new Man[5];
		int option; // 사용자의 명령을 입력받음
		int num = 0; // mArr 배열 내 순서
		boolean flag = true;

		while (flag) {
			System.out.print("1)학생정보입력 2)교수정보입력 3)전체조회 4)종료 :");
			option = sc.nextInt();

			switch (option) {
			case 1:
				if (num > 4) {
					System.out.println("!! 최대 5명까지 입력할 수 있습니다");
					break;
				}
				System.out.println("- 학생 이름 입력:");
				mArr[num] = new ManStudent(sc.next());
				System.out.println("- 학생 학번 입력:");
				mArr[num].sNo = sc.next();
				num++;
				break;
			case 2:
				if (num > 4) {
					System.out.println("!! 최대 5명까지 입력할 수 있습니다");
					break;
				}
				System.out.println("- 교수 이름 입력:");
				mArr[num] = new ManProfessor(sc.next());
				System.out.println("- 교수 번호 입력:");
				mArr[num].pNo = sc.next();
				num++;
				break;
			case 3:
				for (int i = 0; i < num; i++) {
					mArr[i].tellYourName();
				}
				break;
			case 4:
				System.out.println("종료합니다");
				flag = false;
				break;
			}
		}
	}
}
