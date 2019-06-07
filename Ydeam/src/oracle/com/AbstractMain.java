package oracle.com;

public class AbstractMain {
	public static void main(String[] args) {
		AbstractMan man1 = new AbstractStudent("student1", "1111");
		AbstractMan man2 = new AbstractProfessor("professor1", "1234");
		
		man1.getInfo();
		man2.getInfo();
		
		man2.getName();
	}
}
