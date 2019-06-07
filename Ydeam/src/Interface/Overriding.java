package Interface;

class cake {
	void yummy() {
		System.out.println("cake1");
	}
}

class cake2 extends cake {

	@Override
	void yummy() {
		System.out.println("cake2");
	}

}

class cake3 extends cake2{
 	@Override
	void yummy() {
		System.out.println("cake3");
	}
}

public class Overriding {
	public static void main(String[] args) {

		cake c1 = new cake();
		cake c2 = new cake2();
		cake2 c3 = new cake2();
		cake3 c4 = new cake3();
		cake2 c5 = new cake3();
		
		c1.yummy();
		c2.yummy();
		c3.yummy();
		c4.yummy();
		c5.yummy();
	}
}
