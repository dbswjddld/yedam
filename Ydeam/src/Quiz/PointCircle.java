package Quiz;

class PointCircle extends Point{
	int radius; // 반지름
	
	// 생성자
	PointCircle(int x, int y, int radius){
		super(x,y); // 부모의 생성자로 인수 전달
		this.radius = radius;
	}
	
	// 메소드 - 원의 정보 출력
	void showCircleInfo() {
		System.out.println("[" + xPos + "," + yPos + "]");
		System.out.println("반지름 : " + radius);
	}
}
