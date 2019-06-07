package oracle.com;

public class Person {
	String name;
	int age;
	int height;
	int weight;
	int fatigue = 0;

	public Person(String n, int a) {
		name = n;
		age = a;
	}

	public void info() {
		System.out.println("* 이름 : " + name);
		System.out.println("* 나이 : " + age);
		System.out.println("* 키   : " + height);
		System.out.println("* 체중 : " + weight);
		System.out.println("* 피로도 : " + fatigue);
	}

	public void walking() {
		if (fatigue >= 5)
			System.out.println(name + "은/는 피곤해서 걸을 수 없다!");
		else {
			fatigue++;
			System.out.println("걷는 중... \t피로도 :" + fatigue);
		}
	}

	public void running() {
		if (fatigue >= 5)
			System.out.println(name + "은/는 피곤해서 뛸 수 없다!");
		else {
			fatigue++;
			System.out.println("뛰는 중... \t피로도 :" + fatigue);
		}
	}

	public void eating() {
		fatigue = 0;
		System.out.println("먹는 중... 피로가 회복되었다!");
	}
}
