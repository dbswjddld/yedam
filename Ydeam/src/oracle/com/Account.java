package oracle.com;

public class Account {
	// 필드 (속성)
	private int balance;
	private String acNumber; // 계좌번호 234-567-890
	private String ssNumber; // 주민번호 "student"
	// private :접근제어자 / 해당 클래스 내에서만 공유 가능
	// public은 다른 패키지의 클래스가 자유롭게 접근해서 쓸 수 있게 한다
	
	// 생성자 (Constructor)
	// 생성자를 만들지 않으면 컴파일러에 의해 '디폴트 생성자'가 자동으로 생긴다.
	Account (String ac, String ss){
		acNumber = ac;
		ssNumber = ss;
	}
	
	// 메소드 (기능)
	void withdraw(int amt) { // 인출 기능
		balance = balance - amt;
	};
	void input(int amt) { // 입금 기능
		balance = balance + amt;
	};
	void checkBalance() { // 잔액조회 기능
		System.out.println("계좌번호는 " + acNumber);
		System.out.println("잔액은 " + balance + "원 입니다.");
	}
	void initAccount(int amt) {
		balance = amt;
	}
}
