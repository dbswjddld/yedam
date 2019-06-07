package oracle.com;

import java.util.Scanner;

public class ManExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Man[] manArr = new Man[5];
		int option;
		int n = 0;	// 배열의 몇번째인지
		
		while(true) {
			System.out.print("* 1) 대학친구 입력, 2) 거래처 입력, 3) 조회  : ");
			option = sc.nextInt();
			
			
			switch(option) {
			case 1:
				if(n == 5) {
					System.out.println("* 입력불가! 연락처가 꽉 찼습니다");
					break;
				}
				manArr[n] = new UnivMan();
				System.out.println("이름 입력 :");
				manArr[n].name = sc.next();
				System.out.println("전공 입력 :");
				manArr[n].major = sc.next();
				n++;
				break;
			case 2:
				if(n == 5) {
					System.out.println("* 입력불가! 연락처가 꽉 찼습니다");
					break;
				}
				manArr[n] = new BusineseMan();
				System.out.println("이름 입력 :");
				manArr[n].name = sc.next();
				System.out.println("회사 입력 :");
				manArr[n].company = sc.next();
				n++;
				break;
			case 3:
				System.out.println("* 목록");
				for (int i = 0; i < n; i++) {
					System.out.println(i + 1);
					manArr[i].tellYourName();
				}
				break;
			}
		}
	}
}
