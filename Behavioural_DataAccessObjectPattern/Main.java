public class Main {
	public static void main(String[] args) {
		EmployeeDAO empDao = new EmployeeDAOImpl();
		
		for(Employee emp : empDao.getAll()){
			System.out.println("Emp: [No : " + emp.getId() + ", Name : " + emp.getName() + " ]");
		}
		
		Employee emp = empDao.getAll().get(0);
		emp.setName("Jane");
		empDao.updateEmployee(emp);
		
		empDao.get(0);
		System.out.println("Emp: [No : " + emp.getId() + ", Name : " + emp.getName() + " ]");
	}
}
