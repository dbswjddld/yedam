package Interface;

public class AcademyMath implements Academy {
	String prof;
	String stu[] = new String[10];
	int num = 0;

	@Override
	public void enroll(String str) {
		if (num >= stu.length)
			System.out.println("정원 초과");
		else {
			stu[num] = str;
			num++;
		}
	}

	@Override
	public void info() {
		System.out.println("수학반 : " + num + " / 10 명");
		for (int i = 0; i < num; i++)
			System.out.println(stu[i]);
	}

}
