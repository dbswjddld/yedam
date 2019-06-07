package oracle.com;

public class Rectangle {
	double height;
	double width;
	
	// 생성자
	public Rectangle() {
		
	}
	public Rectangle(double n) {
//		height = width = n;
		this(n,n);
		// this :오버로딩된 다른 생성자를 의미함
		// Rectangle(double n1, double n2) 생성자에 인수 n,n을 전달한 것
	}
	public Rectangle(double n1, double n2) {
		height = n1;
		width = n2;
	}
	
	// 넓이 구학기
	public void getArea() {
		System.out.println("넓이는 " + (height * width) + "입니다.");
	}
	
	public double getArea(double num1) {
		height = width = num1;
		System.out.println("넓이는 " + (height * width) + "입니다.");
		return (height * width);
	}
	
	public double getArea(double num1, double num2) {
		height = num1;
		width = num2;
		System.out.println("넓이는 " + (height * width) + "입니다.");
		return (height * width);
	}
	
	public static void main(String[] args) {
		// 생성자도 오버로딩 가능하다
		System.out.println("* 생성자의 인수 0개");
		Rectangle rec1 = new Rectangle();
		rec1.getArea();	// 클래스 int의 default값 == 0 
		rec1.getArea(4);
		rec1.getArea(3,5);
		
		System.out.println("* 생성자의 인수 1개");
		Rectangle rec2 = new Rectangle(7);
		rec2.getArea();
		rec2.getArea(5);
		rec2.getArea(8,9);
		
		System.out.println("* 생성자의 인수 2개");
		Rectangle rec3 = new Rectangle(6,6);
		rec3.getArea();
		rec3.getArea(2);
		rec3.getArea(1,5);
	}
}
