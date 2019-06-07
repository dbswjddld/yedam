package oracle.com;

public class InterfaceStudent implements InterfaceMan{
	String name;

	@Override
	public void getInfo() {
		System.out.println("name :" + name);
	}

	@Override
	public String getName() {
		return name;
	}

}
