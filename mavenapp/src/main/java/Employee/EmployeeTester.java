package Employee;

public class EmployeeTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeDAO dao = new EmployeeDAO();
		
	
		
		
		EmployeeDTO dto=dao.getEmployeeDataById(10);
		dto.setEmployeeName("Manju");
		dao.updateEmployeeDataById(dto.getSalary(), dto.getId());
		
		//Delete:
		//read hospital by id for deleting the record
		//if you want delete hospital data pass the id(which you want to delete) given in getHospitalDataById below
		EmployeeDTO deleteHospitalDto=dao.getEmployeeDataById(62);
		dao.deleteEmployeeDataById(deleteHospitalDto.getId());
		
		
		//if want to insert new record,then change the setter value
		// UI data
		EmployeeDTO dto1 = new EmployeeDTO();
				dto1.setId(62);
				dto1.setEmployeeName("Manju");
				dto1.setSalary(32000);
				dto1.setDesignation("Quality engineer");
				
	}

}
