package Quiz;

public class Sample {
	public static void main(String[] args) {
		String str1 = "This is sample";
		String str2 = "This is sample";
		String str3 = new String("This is sample");
		String str4 = new String("This is sample");
		String str5 = str3;
		String str6 = str1;
		
		if (str1 == str2) System.out.println("str1 == str2");
		if (str3 == str4) System.out.println("str3 == str4"); // 같지않다
		if (str3 == str5) System.out.println("str3 == str5");
		if (str1 == str6) System.out.println("str1 == str6");
		
		if(str3.equals(str4)) System.out.println("str3.equals(str4)");
		if(str1.equals(str2)) System.out.println("str1.equals(str2)");
		if(str1.equals(str3)) System.out.println("str1.equals(str3)");
	}
}
