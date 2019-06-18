package employees.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import employees.Employee; // 패키지 위치가 달라 import 해야함
import employees.common.DAO;

public class empDAO {
	// 필요한 필드 선언
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;

	// 삭제
	public void deleteEmp (int empId) {
		conn = DAO.getConnect();
		String sql = "DELETE FROM emp_temp WHERE employee_id=" + empId;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.executeQuery(); // 쿼리문 실행
			System.out.println(empId + "번 사원 정보 삭제완료");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DAO.close(conn);
		}
	}

	// 수정
	public void updateEmp (int empId, int salary) {
		conn = DAO.getConnect();
		String sql = "UPDATE emp_temp SET salary = ? WHERE employee_id=?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, salary);
			pstmt.setInt(2, empId);
			int r = pstmt.executeUpdate();
			System.out.println(r + "건 수정 완료");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DAO.close(conn);
		}
	}
	
	// DB에서 login_temp 테이블의 id, pw 정보를 가져와 map에 저장
	public Map<String, String> memberInfo() {
		conn = DAO.getConnect();
		String sql = "SELECT id, pw FROM login_temp";

		String id, pw;
		Map<String, String> map = new HashMap<>();
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				id = rs.getString("id");
				pw = rs.getString("pw");
				map.put(id, pw);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DAO.close(conn);
		}
		return map;
	}
	
	// 입력
	public void insertEmp(Employee emp) {
		conn = DAO.getConnect();
		String sql = "INSERT INTO emp_temp (employee_id, first_name, last_name, email, salary, job_id, hire_date) " + 
					 "VALUES(?,INITCAP(?),INITCAP(?),UPPER(?),?,?, sysdate)";
					// SQLD에서 실행해보고 되면 복사해오기
					// ? :우리가 입력할 값
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, emp.getEmployeeId()); // 첫 번재 ?에 emp.getEmployeeId값을 넣겠다
			pstmt.setString(2, emp.getFirstName());
			pstmt.setString(3, emp.getLastName());
			pstmt.setString(4, emp.getEmail());
			pstmt.setInt(5, emp.getSalary());
			pstmt.setString(6, emp.getJobId());
			int r = pstmt.executeUpdate();
			System.out.println(r + "건 입력 완료");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DAO.close(conn); // 접속 종료 필수!
		}
	}
	
	// 전체 사원 조회
	public List<Employee> getEmpList() {
		conn = DAO.getConnect();
		String sql = "SELECT employee_id, first_name, last_name, salary, email, job_id FROM emp_temp";
		Employee emp = null;
		List<Employee> list = new ArrayList<>();
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				emp = new Employee();
				emp.setEmployeeId(rs.getInt("employee_id"));
				emp.setFirstName(rs.getString("first_name"));
				emp.setLastName(rs.getString("last_name"));
				emp.setSalary(rs.getInt("salary"));
				emp.setEmail(rs.getString("email"));
				emp.setJobId(rs.getString("job_id"));
				list.add(emp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DAO.close(conn); // 서버와 접속 종료
		}
		
		return list;
	}
	
	// 사원번호로 단건 조회
	public Employee getEmp(int empId) {
		conn = DAO.getConnect();
		String sql = "SELECT employee_id, first_name, last_name, salary, email, job_id FROM emp_temp WHERE employee_id=" + empId;
		
		Employee emp = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				emp = new Employee();
				emp.setEmployeeId(rs.getInt("employee_id"));
				emp.setFirstName(rs.getString("first_name"));
				emp.setLastName(rs.getString("last_name"));
				emp.setSalary(rs.getInt("salary"));
				emp.setEmail(rs.getString("email"));
				emp.setJobId(rs.getString("job_id"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DAO.close(conn);
		}
		return emp;
	}
}
