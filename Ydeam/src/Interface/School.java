package Interface;

public class School {
	String name; // 반
	String professor; // 교수
	String[] student = new String[10]; // 학생
	int count = 0; // 학생 수 세기

	// 생성자
	School(String name, String professor) {
		this.name = name;
		this.professor = professor;
	}

	School() {
		this(null, null);
	}
	
	// 교수 바꾸기
	void setProf(String str) {
		System.out.println("교수 이름 입력");
		professor = str;
	}

	// 정보 입력
	void setSchool(String str) {
		if (count > student.length)
			System.out.println("정원 초과");
		else {
			System.out.println("학생 이름 입력");
			student[count] = str;
			count++;
		}
	}

	// 정보 출력
	void getSchool() {
		System.out.println("- " + name);
		System.out.println("- 담당 교사 :" + professor);
		for (int i = 0; i < count; i++)
			System.out.println("- " + student[i]);
	}
}
