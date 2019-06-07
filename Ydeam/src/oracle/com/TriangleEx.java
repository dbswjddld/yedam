package oracle.com;

public class TriangleEx {
	public static void main(String[] args) {
		Triangle t1 = new Triangle(3,5);
		Triangle t2 = new Triangle(3,5);
		Triangle t3 = new Triangle(3,5);
		
		System.out.println("t1의 넓이 :" + t1.getArea());
		System.out.println("t2의 넓이 :" + t2.getArea(4));
		System.out.println("t3의 넓이 :" + t3.getArea(4,8));
	}
}
