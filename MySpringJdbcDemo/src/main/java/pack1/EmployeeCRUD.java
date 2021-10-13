package pack1;

import java.util.List;

public interface EmployeeCRUD {
	void insert(Employee emp);
	List<Employee> selectAll();
	Employee selectAEmployee(int empid);
}
