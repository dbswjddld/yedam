package employees.control;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

import employees.Employee;
import employees.impl.EmpServiceImpl;

// 데이터 처리
public class EmpProc {
	Scanner sc = new Scanner(System.in);
	EmpServiceImpl service = EmpServiceImpl.getInstance(); 
	// 더 좋은 기능이 생기명 NewEmpServiceImpl로 수정하면 된다
	
	// 메뉴 선택
	public void execute() {
		loginCheck();
		int menu = 0;
		while (true) {
			System.out.println("메뉴를 선택하세요");
			System.out.println("1)단건조회 2)전체조회 3)입력 4)수정 5)삭제 9)종료");
			menu = sc.nextInt();

			if (menu == 1)
				getEmpProc();
			else if (menu == 2)
				getEmpListProc();
			else if (menu == 3)
				insertEmp();
			else if (menu == 4)
				updateEmp();
			else if (menu == 5)
				deleteEmp();
			else if (menu == 9) {
				System.out.println("프로그램을 종료합니다");
				System.exit(0); // 프로그램 종료
			}
		} // end of while
	}
	
	// 로그인 체크
	public void loginCheck() {
		// id, pw 정보 저장되있는 map
		Map<String, String> map = service.memberInfo();
		// 사용자로부터 로그인할 id, pw 입력받기
		while(true) {
			System.out.print("id : ");
			String id = sc.nextLine();
			System.out.print("pw : ");
			String pw = sc.nextLine();
			// id, pw 정보 일치하는지 확인
			if(map.containsKey(id)) {
				if(map.containsValue(pw)) {
					System.out.println("--- login ---");
					break; // while 빠져나가기
				} else {
					System.out.println("pw가 일치하지 않습니다");
				}
			} else {
				System.out.println("해당 id 존재하지 않음");
			}
		} // end of while
	}
	
	// 삭제
	public void deleteEmp() {
		System.out.println("삭제할 사원의 번호를 입력하세요 :");
		int empId = sc.nextInt(); sc.nextLine();
		service.deleteEmp(empId);
	}
	
	// 수정
	public void updateEmp() {
		System.out.print("salary를 수정할 사원의 번호를 입력하세요 : ");
		int empId = sc.nextInt();	sc.nextLine();
		System.out.println("수정할 salary를 입력하세요 :");
		int salary = sc.nextInt();	sc.nextLine();
		
		service.updateEmp(empId, salary);
	}
	
	// 입력
	public void insertEmp() {
		System.out.println(" 아이디를 입력하세요 :");
		int empId = sc.nextInt();	sc.nextLine();
		// nextInt하면 숫자만 받고 enter 남아있다. -> 다음 nextLine이 넘어가버림. enter 빼줘야됨
		System.out.println(" 이름을 입력하세요 :");
		String firstName = sc.nextLine();
		System.out.println(" 성을 입력하세요 :");
		String lastName = sc.nextLine();
		System.out.println(" Salary 입력 :");
		int salary = sc.nextInt();	sc.nextLine();
		System.out.println(" email 입력 :");
		String email = sc.nextLine();
		System.out.println(" job id입력 :");
		String jobId = sc.nextLine();
		
		Employee emp = new Employee(empId, firstName, lastName, salary);
		emp.setEmail(email);
		emp.setJobId(jobId);
		
		service.insertEmp(emp);
	}

	// 단건조회
	public void getEmpProc() {
		System.out.println("조회할 ID를 입력하세요");
		int empId = sc.nextInt();
		Employee emp = service.getEmp(empId);
		System.out.println(emp);
	}

	// 전체 리스트 가져오기
	public void getEmpListProc() {
		List<Employee> list = service.getEmpList();
		for (Employee emp : list) {
			System.out.println(emp);
		}
	}
}
