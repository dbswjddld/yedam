package oracle.com;

public class Triangle {
	double width;  // 밑변의 길이
	double height; // 높이
	
	// 생성자
	public Triangle(double num1, double num2) {
		width = num1;
		height = num2;
	}
	
	// 인수 0개
	public double getArea() {
		return width * height / 2;
	}
	
	// 인수 1개
	public double getArea(double n) {
		return n * n / 2;
	}
	
	// 인수 2개
	public double getArea(double n1, double n2) {
		return n1 * n2 / 2;
	}
}
