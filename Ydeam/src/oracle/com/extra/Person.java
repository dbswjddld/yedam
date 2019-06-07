package oracle.com.extra;

public class Person {
	final String nation = "Korea";
	final String ssn; // 주민번호
	String name;
	
	public Person (String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
}
