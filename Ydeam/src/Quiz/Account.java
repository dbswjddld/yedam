package Quiz;

public class Account {
	int no; // 계좌번호
	String name;
	int balance = 0;
	
	void setName(String name) {
		this.name = name;
	}
	
	void setNo(int no) {
		this.no = no;
	}
	
	// 잔액조회
	void getBalance() {
		System.out.println("- 계좌번호 : " + no);
		System.out.println("- 잔액 : " + balance);
	}
	
	// 입금
	void setDeposit(int amount) {
		balance += amount;
	}
	
	// 출금
	void setWithdraw(int amount) {
		balance -= amount;
	}
}
