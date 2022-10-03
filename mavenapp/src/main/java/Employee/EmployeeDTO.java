package Employee;

public class EmployeeDTO {
	
	private  int id;
	private  String employeeName;
	private int salary;
	private String designation;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public  String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	@Override
	public String toString() {
		return "EmployeeDTO [id=" + id + ", employeeName=" + employeeName + ", salary=" + salary + ", designation="
				+ designation + "]";
	}

	
	
	
	

}
