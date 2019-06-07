package Interface;

import java.util.Scanner;

public class Ac{
	Scanner scan = new Scanner(System.in);
	String prof; // 담당교수
	String sub; // 과목
	int count = 0; // 학생 수
	AcStudent[] stu = new AcStudent[5]; // 학생

	// 생성자 - 담당 교수 이름, 과목
	Ac(String prof, String sub) {
		this.prof = prof;
		this.sub = sub;
	}

	Ac() {
		this(null, null);
	}

	// 교수 정보 입력
	void setProf(String str) {
		prof = str;
	}

	// 학생 정보 입력
	void setStu() {
		if (count >= 5)
			System.out.println("정원 초과");
		else {
			stu[count] = new AcStudent();
			System.out.print(" 학생 이름 : ");
			stu[count].name = scan.next();
//			stu[count].setName(scan.next());
			System.out.print(" 학생 번호 : ");
			stu[count].setNum(scan.next());
			System.out.print(" 학생 연락처 : ");
			stu[count].setPhone(scan.next());
			count++;
		}
	}


	// 정보 조회
	void getInfo() {
		System.out.println("- 과목 : " + sub);
		System.out.println("- 담당교수 : " + prof);
		if (count >= 1) { // 학생 수가 한 명 이상일 때 학생 정보 출력
			for (int i = 0; i < count; i++) {
				System.out.println("- 학생" + (i + 1) + ". " + stu[i].name + " / " + stu[i].num + " / " + stu[i].phone);
			}
		}
	}
}
