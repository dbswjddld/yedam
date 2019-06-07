package Quiz;
// 교재 216페이지
class Point{
	int xPos, yPos;	// x좌표, y좌표
	
	//생성자
	Point(int x, int y){
		xPos = x;
		yPos = y;
	}
	
	// 메소드 - 좌표 출력
	void showPointInfo() {
		System.out.println("[" + xPos + "," + yPos + "]");
	}
}