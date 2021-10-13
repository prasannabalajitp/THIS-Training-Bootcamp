package pack1;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDAO implements EmployeeCRUD {
	
	private JdbcTemplate jdbcTemplate;

	public EmployeeDAO(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	
	

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}



	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}



	@Override
	public void insert(Employee emp) {
		// TODO Auto-generated method stub
		if(emp != null) {
			jdbcTemplate.update("insert into employee values(?,?,?)",
					new Object[] {emp.getEmpid(),emp.getEmpname(),emp.getSalary()});
		}
	}

	@Override
	public List<Employee> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee selectAEmployee(int empid) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
