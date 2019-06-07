package oracle.com;

public class ManStudent extends Man{
	
	ManStudent(String name){
		this.name=name;
	}

	@Override
	public void tellYourName() {
		super.tellYourName();
		System.out.println("my student number is " + super.sNo);
	}
	
	
}
