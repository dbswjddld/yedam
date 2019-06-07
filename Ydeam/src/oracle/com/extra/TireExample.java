package oracle.com.extra;

import oracle.com.extra.hankook.SnowTire;
import oracle.com.extra.kumho.WideTire;

public class TireExample {
	public static void main(String[] args) {
		SnowTire snow = new SnowTire(); 
		//다른 패키지이므로 import 해야한다
		snow.showHankook();
		
		WideTire wide = new WideTire();
		wide.showKumho();
		
		// 패키지는 다르고 클래스의 이름이 같을 때
		// 패키지명.클래스명 같이 적어야한다
		oracle.com.extra.hankook.Tire tire_h = new oracle.com.extra.hankook.Tire();
		oracle.com.extra.kumho.Tire tire_k = new oracle.com.extra.kumho.Tire();

		tire_h.getTire();
		tire_k.getTire();
	}
}
