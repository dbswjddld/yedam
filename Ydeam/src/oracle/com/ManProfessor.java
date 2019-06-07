package oracle.com;

public class ManProfessor extends Man{
	ManProfessor(String name){
		super.name = name;
	}

	@Override
	public void tellYourName() {
		super.tellYourName();
		System.out.println("my professor number is " + super.pNo);
	}
}
