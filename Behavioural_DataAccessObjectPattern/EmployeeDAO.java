import java.util.List;


public interface EmployeeDAO {
	public List<Employee> getAll();
	
	public Employee get(int id);
	
	public void updateEmployee(Employee employee);
	
	public void delete(Employee employee);
}
