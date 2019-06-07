package oracle.com;

public class AAA {
	int aaa;

	AAA() {
	}
	// public :외부 패키지에서 접근 가능
	// private :해당 클래스 내에서만 접근 가능

	void call() {
		System.out.println(aaa);
	}

	void setAAA(int n) {
		aaa = n;
	}
}
