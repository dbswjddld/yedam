package oracle.com.extra;

class Cellphone{
	String model;
	String color;
	
	Cellphone(String model, String color){
		this.model = model;
		this.color = color;
	}
	
	void powerOn() {
		System.out.println("전원을 켭니다");
	}
	void powerOff() {
		System.out.println("전원을 끕니다");
	}
	void bell() {
		System.out.println("벨이 울립니다");
	}
	void sendVoice(String message) {
		System.out.println("자신: " + message);
	}
	void receiveVoice(String message) {
		System.out.println("상대: " + message);
	}
	void hangUp() {
		System.out.println("전화를 끊습니다");
	}
}

class DmbCellphone extends Cellphone {
	// extends Cellphone :Cellphone 클래스를 상속한다. Cellphone의 기능을 쓸 수 있음
	int channel;
	
	DmbCellphone(String model, String color, int channel){
		super(model, color); // super :부모
		this.channel = channel;
	}
	
	void turnOnDmb() {
		System.out.println("채널 :" + channel);
	}
	void changeChannelDmb(int channel) {
		this.channel = channel;
	}

	// 오버라이드
	@Override
	void hangUp() {
		System.out.println("DMB 방송을 종료합니다");
	}
	
}

public class DmbCellPhone {
	public static void main(String[] args) {
		DmbCellphone dcp = new DmbCellphone("Note5", "white", 7);
		dcp.bell();
	}
}
