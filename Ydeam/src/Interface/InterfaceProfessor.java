package Interface;

public class InterfaceProfessor implements Man{
	String name;
	String pNo;
	String phone;

	@Override
	public void getInfo() {
		System.out.println("-이름 : " + name);
		System.out.println("-학번 : " + pNo);
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
		pNo = str;
	}

}
