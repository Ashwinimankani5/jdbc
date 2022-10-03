package Student;

public class StudentTester {

	
	
	
	public static void main(String[] args) {
		StudentDAO dao = new StudentDAO();
		//Read:
		//read all hospital 
		dao.getAllStudentData();
	/*	
		//Update:
		//read hospital by id for updating the record
		//if you want update hospital data, pass  id(which you want to update)  in getHospitalDataById shown below
		HospitalDto hospitalDto=dao.getHospitalDataById(8765);
		hospitalDto.setRoomno("112");//change roomno which want to update
		dao.updateHospitalDataById(Integer.parseInt(hospitalDto.getRoomno()), hospitalDto.getId());
		
		//Delete:
		//read hospital by id for deleting the record
		//if you want delete hospital data pass the id(which you want to delete) given in getHospitalDataById below
		HospitalDto deleteHospitalDto=dao.getHospitalDataById(666);
		dao.deleteHospitalDataById(deleteHospitalDto.getId());
		
	*/
		
		//if want to insert new record,then change the setter value
		// UI data
				StudentDTO dto = new StudentDTO();
				dto.setId(662);
				dto.setName("Manju");
				dto.setRollNo(1);
				dto.setAge(20);
				dto.setMarks(85);
				
				
				//passing the dto value  to insert
				dao.insertStudentData(dto);
	}
}
