package Interface;

public class InterfaceStudent implements Man{
	String name;
	String phone;
	String sNo;

	
	
	@Override
	public void getInfo() {
		System.out.println("-이름 : " + name);
		System.out.println("-학번 : " + sNo);
		System.out.println("-연락처 : " + phone);
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String str) {
		name = str;
	}

	@Override
	public void setPhone(String str) {
		phone = str;
	}

	@Override
	public void setNo(String str) {
		sNo = str;
	}

}
