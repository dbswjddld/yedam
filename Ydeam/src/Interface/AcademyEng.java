package Interface;

public class AcademyEng implements Academy{
	String prof;
	String stu[] = new String[20];
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
		System.out.println("영어반 : " + num + " / 20 명");
		for (int i = 0; i < num; i++)
			System.out.println(stu[i]);
		
	}

}
