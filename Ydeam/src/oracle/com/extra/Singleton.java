package oracle.com.extra;

public class Singleton {
	// Singleton : 전체 프로그램에서 단 하나의 객체만을 만들도록 보장해야 할때
	// private static 객체를 생성
	private static Singleton singleton = new Singleton();
	private static int num;
	
	// private 생성자:이 생성자를 외부에서는 new를 통해 만들지 못 하도록
	// -> getInstance 메소드를 통해서만 생성자에 접근 가능하게
	private Singleton() {
		
	}
	static Singleton getInstance() {
		return singleton;
	}
	
	void setNum(int a) {
		num = a;
	}
	
	int getNum() {
		return num;
	}
}
