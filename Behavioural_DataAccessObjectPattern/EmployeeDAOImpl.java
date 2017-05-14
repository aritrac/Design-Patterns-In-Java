import java.util.ArrayList;
import java.util.List;


public class EmployeeDAOImpl implements EmployeeDAO{
	List<Employee> employeeList;
	
	public EmployeeDAOImpl(){
		employeeList = new ArrayList<Employee>();
		Employee emp1 = new Employee("Jack", 0);
		Employee emp2 = new Employee("Tom",1);
		employeeList.add(emp1);
		employeeList.add(emp2);
	}
	
	@Override
	public List<Employee> getAll() {
		return employeeList;
	}

	@Override
	public Employee get(int id) {
		return employeeList.get(id);
	}

	@Override
	public void updateEmployee(Employee employee) {
		employeeList.get(employee.getId()).setName(employee.getName());
		System.out.println("Emp: No " + employee.getId() + ", updated in the database");
	}

	@Override
	public void delete(Employee employee) {
		employeeList.remove(employee.getId());
		System.out.println("Employee: No " + employee.getId() + ", deleted from database");
	}
	
}
