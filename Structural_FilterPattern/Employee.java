
public class Employee {
	private String name;
	private String gender;
	private String retireStatus;
	
	public Employee(String name,String gender,String r){
		this.name = name;
		this.gender = gender;
		this.retireStatus = r;
	}
	
	public String getName(){
		return this.name;
	}
	
	public String getGender(){
		return this.gender;
	}
	
	public String getRetireStatus(){
		return this.retireStatus;
	}
	
	@Override
	public String toString(){
		return "Employee [name=" + name + ", gender=" + gender + ", retireStatus=" + retireStatus + "]";
	}
}
