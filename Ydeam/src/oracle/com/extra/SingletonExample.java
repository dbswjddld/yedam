package oracle.com.extra;

public class SingletonExample {
	public static void main(String[] args) {
		Singleton sing1 = Singleton.getInstance();
		Singleton sing2 = Singleton.getInstance();
		
		System.out.println(sing1 == sing2);	// true
		// == :참조변수의 '주솟값'이 같은지 체크
		// == :일반 변수(int, double)은 값을 비교한다
		
		sing1.setNum(30);
		System.out.println(sing1.getNum());	// 30
		System.out.println(sing2.getNum());	// 30
		// 둘 다 하나의 객체를 가리키고 있다
		
		args = new String[] {"str1", "str2", "str3"};
		PersonExample.main(args); // PersonExample.main을 실행할 수 있다
	}
}
