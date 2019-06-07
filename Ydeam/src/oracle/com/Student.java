package oracle.com;

public class Student {
	private String num;
	private String name;
	private String major;
	private String birth;
	
	// 생성자
	public Student(String str1, String str2, String str3, String str4){
		num = str1;
		name = str2;
		major = str3;
		birth = str4;
	}
	public Student() {
		this("학번","이름","전공","생일");
	}
	
	// 학번 메소드
	public void setNum(String num) {
		this.num = num;
	}
	public String getNum() {
		return num;
	}
	
	// 이름 메소드
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	// 전공 메소드
	public void setMajor(String major) {
		this.major = major;
	}
	public String getMajor() {
		return major;
	}
	
	// 생일 메소드
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getBirth() {
		return birth;
	}
}
