package oracle.com;

class Friend{
	String name;
	String phone;
	int age;
	
	Friend (String name){
		this.name = name;
		// 인스턴스 변수(this.) name = 인수로 받은 name
	}
	String getName() {
		return name;
	}
	// 번호 메소드
	void setPhone(String phone) {
		this.phone = phone;
	}
	String getPhone() {
		return phone;
	}
	// 나이 메소드
	void setAge(int age) {
		this.age = age;
	}
	int getAge() {
		return age;
	}
}

public class ArraySample2 {
	public static void main(String[] args) {
		Friend fr1 = new Friend("홍길동");
		Friend fr2 = new Friend("김춘배");
		Friend fr3 = new Friend("김덕배");
		
		fr1.setPhone("1234");
		fr2.setPhone("5678");
		fr3.setPhone("9999");
		
		fr1.setAge(16);
		fr2.setAge(37);
		fr3.setAge(25);
		
		Friend[] frArr = {fr1, fr2, fr3};
		
		for(int i = 0; i < frArr.length; i++) {
			System.out.println(frArr[i].getName() + "의 전화번호는 " + 
		frArr[i].getPhone() + "이고 나이는 " + frArr[i].getAge() + "살이다");
		}
		
	}
}
