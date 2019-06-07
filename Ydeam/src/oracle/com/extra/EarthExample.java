package oracle.com.extra;

class Earth {
	static final double EARTH_RADIUS = 6400; // 지구의 반지름 static final
	static final double EARTH_SURFACE_AREA; //지구의 표면적 -계산을 통해 초기화하자
	static {
		EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
	}
	// 계산을 통해 변수를 초기화해야할때, static {} 중괄호 안에 초기화 한다
}

public class EarthExample {
	public static void main(String[] args) {
		System.out.println("지구의 반지름 : " + Earth.EARTH_RADIUS);
		System.out.println("지구의 표면적 : " + Earth.EARTH_SURFACE_AREA);
	}
}
