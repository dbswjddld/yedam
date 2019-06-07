package oracle.com;

public class UnivMan extends Man{
	String name;
//	String major;
	
	UnivMan(){}
	UnivMan(String major){
		this.major = major;
	}
	
	public void tellYourUniv() {
		System.out.println("my major is " + major);
	}
	
	@Override
	public void tellYourName() {
		super.tellYourName();
		System.out.println("my major is " + super.major);
	}
	
}
