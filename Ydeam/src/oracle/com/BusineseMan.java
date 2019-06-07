package oracle.com;

public class BusineseMan extends Man{
	String name;
	String company;
	
	BusineseMan(){}
	BusineseMan(String company){
		super();	// super : 부모
		this.company = company;
	}
	
	public void tellYourInfo() {
		System.out.println("My company is " + company);
	}
	
	@Override
	public void tellYourName() {
		super.tellYourName();
		System.out.println("My company is " + super.company);
	}
}
