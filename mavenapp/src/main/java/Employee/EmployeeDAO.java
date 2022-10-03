package Employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeDAO {
	
public void insertEmployeeData(EmployeeDTO dto) {
		
		Connection connection = JdbcConnectionUtil.getConnection();
		//step3:
		PreparedStatement pst;
		try {
			pst = connection.prepareStatement("insert into Employee values(?,?,?,?)");

			pst.setInt(1, dto.getId());
			pst.setString(2, dto.getEmployeeName());
			pst.setInt(3, dto.getSalary());
			pst.setString(4, dto.getDesignation());
			
			// step4
			int count = pst.executeUpdate();
			System.out.println("--------Inserted one record-------------" + count);
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void getAllHospitalData() {

		
		String selectQry = "select * from Employee";
		Connection connection = JdbcConnectionUtil.getConnection();

		try {
			PreparedStatement pstmt = connection.prepareStatement(selectQry);

			ResultSet resultSet = pstmt.executeQuery();
			while (resultSet.next()) {

				EmployeeDTO dto = new EmployeeDTO();
				dto.setId(resultSet.getInt(1));
				dto.setEmployeeName(resultSet.getString(2));
				dto.setSalary(resultSet.getInt(3));
				dto.setDesignation(resultSet.getString(4));
				
				System.out.println("-------------all data--------------"+dto.toString());

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void updateEmployeeDataById(int salary, int id) {
		String updateQry = "update Employee set salary=?  where id=?";
		Connection connection = JdbcConnectionUtil.getConnection();

		try {
			PreparedStatement pstmt = connection.prepareStatement(updateQry);
			pstmt.setInt(1, salary);
			pstmt.setInt(2, id);
			int countofrows = pstmt.executeUpdate();
			System.out.println("---------record updated------------------"+countofrows);

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void deleteEmployeeDataById(int deleteId) {
		String deleteQry = "delete from Employee where id=?";
		Connection connection = JdbcConnectionUtil.getConnection();

		try {
			PreparedStatement pstmt = connection.prepareStatement(deleteQry);
			pstmt.setInt(1, deleteId);

			int countofrows = pstmt.executeUpdate();
			System.out.println("---------record deleted------------------"+countofrows);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

public EmployeeDTO getEmployeeDataById(int id) {
		
	EmployeeDTO dto=new EmployeeDTO();
		String selectQry="select * from Employee where id=?";
		Connection connection=JdbcConnectionUtil.getConnection();
		
		try {
			PreparedStatement pstmt =connection.prepareStatement(selectQry);
			pstmt.setInt(1, id);
		ResultSet resultSet=pstmt.executeQuery();
		while(resultSet.next())
		{
			dto.setId(resultSet.getInt(1));
			dto.setEmployeeName(resultSet.getString(2));
			dto.setSalary(resultSet.getInt(3));
			dto.setDesignation(resultSet.getString(4));
							
		}
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return dto;
}




}
