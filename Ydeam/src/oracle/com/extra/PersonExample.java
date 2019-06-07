package oracle.com.extra;

public class PersonExample {
	public static void main(String[] args) {
		// main 메소드 호출 시 넘겨지는 인자값 확인하기
		// Run > Run configurations > Arguments로 메인에 쓸 인자 입력
		if (args != null) {
			for(int i = 0; i < args.length; i++)
				System.out.println(args[i]);
		}
		Person p1 = new Person ("111111", "길동");
		// p1.ssn = "2222"; -> final 필드의 값 변경 불가!
		p1.name = "김길동"; // 일반 인스턴스변수는 값 변경 가능
		
		System.out.println(p1.nation); // Korea
	}
}
