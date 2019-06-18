package employees.impl;

import java.util.List;
import java.util.Map;

import employees.EmpService;
import employees.Employee;

public class EmpServiceImpl implements EmpService{
	private static EmpServiceImpl singleton = new EmpServiceImpl();
	private EmpServiceImpl() {}; // 생성자 -private (생성자를 통해 생성 불가)
	public static EmpServiceImpl getInstance() { // 메소드를 통해 singleton 생성
		return singleton;
	}

	empDAO dao = new empDAO();
	
	@Override
	public Employee getEmp(int empId) {
		return dao.getEmp(empId);
	}

	@Override
	public List<Employee> getEmpList() {
		return dao.getEmpList();
	}

	@Override
	public void insertEmp(Employee emp) {
		dao.insertEmp(emp);
	}

	@Override
	public void updateEmp(int empId, int salary) {
		dao.updateEmp(empId, salary);
	}

	@Override
	public void deleteEmp(int empId) {
		dao.deleteEmp(empId);
	}
	
	@Override
	public Map<String, String> memberInfo() {
		return dao.memberInfo();
	}
	
}
