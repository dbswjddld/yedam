package oracle.com;

public class AccountSample {
	public static void main(String[] args) {
		Account acct = new Account("1111-1111","01101-123-4");	// Account 클래스의 객체를 만듦. 참조변수 acct에 담겠다.
//		acct.acNumber = "123-123";	// acNumber이 private이므로 안됨
//		acct.balance = 10000;
		acct.initAccount(30000);
		acct.checkBalance();
		acct.input(5000);
		acct.checkBalance();
		
//		Account acct2 = new Account();
//		acct2.checkBalance();
//		System.out.println(acct2.acNumber);
		// class의 int 디폴트값 0 / String 디폴트 null
	}
}
