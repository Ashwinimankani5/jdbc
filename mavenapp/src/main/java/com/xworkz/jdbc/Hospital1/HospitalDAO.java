package com.xworkz.jdbc.Hospital1;

import java.sql.*;
import java.util.Scanner;

public class HospitalDAO{
	
	public void savePatientInfo()
	{
		String insertQuery="insert into hospital.patient1 values(?,?,?,?,?,?,?,?,?,?)";
		Connection con =JdbcConnectionUtil.getConnection();
		Scanner sc = new Scanner(System.in);
		try {
			PreparedStatement pst=con.prepareStatement(insertQuery);
			System.out.print("Enter ID : ");
			int id=sc.nextInt();
			System.out.print("Enter name : ");
			String name =sc.next();
			System.out.print("Enter gender : ");
			String gender =sc.next();
			System.out.print("Enter roomno : ");
			int roomno =sc.nextInt();
			System.out.print("Enter contactNo : ");
			String contactNo =sc.next();
			System.out.print("Enter address : ");
			String address =sc.next();
			System.out.print("Enter doctorName : ");
			String doctorname =sc.next();
			System.out.print("Enter age : ");
			int age =sc.nextInt();
			System.out.print("Enter hospitalname : ");
			String hospitalname =sc.next();
			System.out.print("Enter hospitalAddress : ");
			String hospitalAddress =sc.next();
			
			 pst.setInt(1,id); 
			 pst.setString(2, name); 
			 pst.setString(3, gender);																																																																																																																																			
			 pst.setInt(4,roomno); 
			 pst.setString(5,contactNo);
			 pst.setString(6,address); 
			 pst.setString(7,doctorname); 
			 pst.setInt(8,age); 
			 pst.setString(9,hospitalname); 
			 pst.setString(10,hospitalAddress);
			 
			PatientDTO dto=new PatientDTO();
			//dto.setId(id);
			int count = pst.executeUpdate();
			System.out.println("inserted");
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void getPatientInfo()
	{
		System.out.println();
	}
	
	public void updatePatientInfo()
	{
		
	}
	
	public void deletePatientInfo()
	{
		
	}
	
	
	
	
}

	