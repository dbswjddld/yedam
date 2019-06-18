package employees;

public class Employee {
	private int employeeId;
	private String firstName;
	private String lastName;
	private int salary;
	private String email;
	private String jobId;
	
	// 생성자
	public Employee() {
		super();
	}
	public Employee(int employeeId, String first_name, String last_name, int salary) {
		super();
		this.employeeId = employeeId;
		this.firstName = first_name;
		this.lastName = last_name;
		this.salary = salary;
	}
	
	// get set
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String first_name) {
		this.firstName = first_name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String last_name) {
		this.lastName = last_name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getJobId() {
		return jobId;
	}
	public void setJobId(String jobId) {
		this.jobId = jobId;
	}
	
	@Override // 우클릭 > Source > Generate toString
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", salary=" + salary + ", email=" + email + ", jobId=" + jobId + "]";
	}
	
	
	
	
	
}
