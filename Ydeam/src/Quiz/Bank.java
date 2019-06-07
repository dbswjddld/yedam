package Quiz;

import java.util.Scanner;

public class Bank {
	private static Account[] accountArr = new Account[100];
	private static Scanner s = new Scanner(System.in);
	static int num = 0;

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("----------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("----------------------------------------");
			System.out.print("선택 >");
			int select = s.nextInt();

			switch (select) {
			case 1:
				createAccount();
				break;
			case 2:
				accountList();
				break;
			case 3:
				deposit();
				break;
			case 4:
				withdraw();
				break;
			case 5:
				run = false;
			}
		}
	}

// 계좌 생성
	private static void createAccount() {
		System.out.println("--------");
		System.out.println("계좌 생성");
		System.out.println("--------");
		accountArr[num] = new Account();
		System.out.println("  이름 : ");
		accountArr[num].setName(s.next());
		do {
			System.out.println("  계좌번호");
			int temp = s.nextInt();
			if (findAccount(temp) == null) { // 해당 계좌번호와 번호가 같은 계좌가 없을 때
				accountArr[num].setNo(temp);
				num++;
				break;
			}
			else
				System.out.println("해당 계좌번호가 이미 존재합니다. 다시 입력하세요.");
		} while (true);
	}

// 계좌 목록 보기
	private static void accountList() {
		if (num == 0)
			System.out.println("생성된 계좌가 없습니다.");
		else {
			System.out.println("--------");
			System.out.println("계좌 목록");
			System.out.println("--------");
			for (int i = 0; i < num; i++) {
				System.out.println(accountArr[i].no + "\t" + accountArr[i].name + "\t" + accountArr[i].balance);
			}
		}
	}

// 예금
	private static void deposit() {
		System.out.println("--------");
		System.out.println("입금 하기");
		System.out.println("--------");
		System.out.println("입금할 계좌번호를 입력하세요");
		int find = s.nextInt();
		if (findAccount(find) == null) {
			System.out.println("해당 계좌가 존재하지 않습니다.");
		} else {
			System.out.println("입금할 금액을 입력하세요");
			int amount = s.nextInt();
			findAccount(find).setDeposit(amount);
		}
	}

// 출금
	private static void withdraw() {
		System.out.println("--------");
		System.out.println("출금 하기");
		System.out.println("--------");
		System.out.println("출금할 계좌번호를 입력하세요");
		int find = s.nextInt();
		if (findAccount(find) == null) {
			System.out.println("해당 계좌가 존재하지 않습니다.");
		} else {
			System.out.println("출금할 금액을 입력하세요");
			int amount = s.nextInt();
			findAccount(find).setWithdraw(amount);
		}

	}

// Account 배열에서 no와 동일한 Account 객체 찾기
	private static Account findAccount(int ano) {
		for (int i = 0; i < num; i++) {
			if (ano == accountArr[i].no)
				return accountArr[i];
		}
		return null;
	}
}
