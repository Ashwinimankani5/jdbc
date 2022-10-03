package Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.xworkz.jdbc.Hospital1.JdbcConnectionUtil;

public class StudentDAO {
	
public void insertStudentData(StudentDTO dto) {
		
		Connection connection = Student.JdbcConnectionUtil.getConnection();
		//step3:
		PreparedStatement pst;
		try {
			pst = connection.prepareStatement("insert into hospital values(?,?,?,?,?)");

			pst.setInt(1, dto.getId());
			pst.setString(2, dto.getName());
			pst.setInt(3, dto.getRollNo());
			pst.setInt(4, dto.getAge());
			pst.setInt(4, dto.getMarks());
			
			// step4
			int count = pst.executeUpdate();
			System.out.println("--------Inserted one record-------------" + count);
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void getAllHospitalData() {

		
		String selectQry = "select * from hospital";
		Connection connection = Student.JdbcConnectionUtil.getConnection();

		try {
			PreparedStatement pstmt = connection.prepareStatement(selectQry);

			ResultSet resultSet = pstmt.executeQuery();
			while (resultSet.next()) {

				StudentDTO dto = new StudentDTO();
				dto.setId(resultSet.getInt(1));
				dto.setName(resultSet.getString(2));
				dto.setRollNo(resultSet.getInt(3));
				dto.setAge(resultSet.getInt(4));
				dto.setMarks(resultSet.getInt(3));
			
				System.out.println("-------------all data--------------"+dto.toString());

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void updateHospitalDataById(int roomNo, int id) {
		String updateQry = "update hospital set roomno=?  where id=?";
		Connection connection = Student.JdbcConnectionUtil.getConnection();

		try {
			PreparedStatement pstmt = connection.prepareStatement(updateQry);
			pstmt.setInt(1, roomNo);
			pstmt.setInt(2, id);
			int countofrows = pstmt.executeUpdate();
			System.out.println("---------record updated------------------"+countofrows);

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void getAllStudentData() {
		// TODO Auto-generated method stub
		
	}

	public void insertHospitalData(StudentDTO dto) {
		// TODO Auto-generated method stub
		
	}
}
