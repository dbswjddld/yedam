package Interface;

import java.util.Scanner;

public class AcStudent{
	Scanner scan = new Scanner(System.in);
	String name;
	String num;
	String phone;
	
//	AcStudent(String name, String num, String phone){
//		this.name = name;
//		this.num = num;
//		this.phone = phone;
//	}
	
	void setName(String str){
		name = str;
	}
	
	void setNum(String str) {
		num = str;
	}
	
	void setPhone(String str) {
		phone = str;
	}
}
