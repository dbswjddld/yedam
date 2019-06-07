package Interface;

import java.util.Scanner;

public class InterfaceExe {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Man arr[] = new Man[5];

		int option; // 사용자의 명령을 입력받음
		int num = 0; // mArr 배열 내 순서
		int find; // 연락처 검색
		boolean flag = true;

		while (flag) {
			System.out.print("1)학생정보입력 2)교수정보입력 3)연락처 조회 4)연락처 검색 5)종료 :");
			option = sc.nextInt();

			switch (option) {
			case 1:
				if (num > 4) {
					System.out.println("!! 최대 5명까지 입력할 수 있습니다");
					break;
				}
				arr[num] = new InterfaceStudent();
				System.out.println("- 학생 이름 입력:");
				arr[num].setName(sc.next());
				System.out.println("- 학생 연락처 입력:");
				arr[num].setPhone(sc.next());
				System.out.println("- 학생 학번 입력:");
				arr[num].setNo(sc.next());
				num++;
				break;
			case 2:
				if (num > 4) {
					System.out.println("!! 최대 5명까지 입력할 수 있습니다");
					break;
				}
				arr[num] = new InterfaceProfessor();
				System.out.println("- 교수 이름 입력:");
				arr[num].setName(sc.next());
				System.out.println("- 교수 번호 입력:");
				arr[num].setNo(sc.next());
				System.out.println("- 교수 연락처 입력:");
				arr[num].setPhone(sc.next());
				num++;
				break;
			case 3:
				if (num == 0) {
					System.out.println("연락처가 비었습니다");
					break;
				}
				for (int i = 0; i < num; i++) {
					System.out.println("  " + i + ". " + arr[i].getName());
				}
				break;
			case 4:
				System.out.println("몇 번째 사람을 검색하시겠습니까? (0~4)");
				find = sc.nextInt();
				if (find >= num) {
					System.out.println("해당 없음");
					break;
				}
				arr[find].getInfo();
				break;
			case 5:
				System.out.println("종료합니다...");
				flag = false;
				break;
			}
		}
	}
}
