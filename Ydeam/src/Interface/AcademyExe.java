package Interface;

import java.util.Scanner;

public class AcademyExe {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menu; // 등록,조회
		int num; // 영어반,수학반

		Academy classes[] = new Academy[2]; // 반 배열 만들기
		classes[0] = new AcademyMath();
		classes[1] = new AcademyEng();

		while (true) {
			System.out.println("1)등록  2)조회");
			menu = sc.nextInt();
			System.out.println("0)수학반 1)영어반");
			num = sc.nextInt();

			switch (menu) {
			case 1:
				System.out.println("등록할 학생 이름 입력");
				classes[num].enroll(sc.next());
				break;
			case 2:
				classes[num].info();
				break;
			}
		}
	}
}
