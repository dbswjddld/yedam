package oracle.com;

import java.util.Scanner;

public class StudentEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Student stuArr[] = new Student[3]; // 클래스 배열 만들기 !!배열만 생성하고 인스턴스화는 하지 않음!!
				
		stuArr[0] = new Student();
		stuArr[1] = new Student();
		stuArr[2] = new Student();
		
		int option; // 입력, 조회, 종료 입력받음
		int n; // 학생번호

		String temp;
		boolean flag = true;

		while (flag) {
			System.out.print("1)입력 2)조회 3)종료 :");
			option = sc.nextInt();

			switch (option) {
			case 1:
				System.out.print("몇 번째 학생을 입력하시겠습니까? (1~3)");
				n = sc.nextInt();
				if ( n < 1 || n > 3) break;
				System.out.println("  이름 입력 : ");
				stuArr[n - 1].setName(sc.next());
				System.out.println("  학번 입력 : ");
				stuArr[n - 1].setNum(sc.next());
				System.out.println("  전공 입력 : ");
				stuArr[n - 1].setMajor(sc.next());
				System.out.println("  생일 입력 : ");
				stuArr[n - 1].setBirth(sc.next());
				System.out.println("입력완료");
				break;
			case 2:
				System.out.print("몇 번째 학생의 정보를 조회 하시겠습니까? (1~3)");
				n = sc.nextInt();
				System.out.println(" 이름 : " + stuArr[n-1].getName());
				System.out.println(" 학번 : " + stuArr[n-1].getNum());
				System.out.println(" 전공 : " + stuArr[n-1].getMajor());
				System.out.println(" 생일 : " + stuArr[n-1].getBirth());
				break;
			case 3:
				System.out.println("종료합니다");
				flag = false;
				break;
			default:
				System.out.println("1~3 입력");
			}
		}
	}
}
