package com.xworkz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Select_Query_Execute {
	
	public static void main(String[] args) {
		
		
		String url = "jdbc:mysql://localhost:3306";
		String username = "root";
		String pwd = "Xworkzodc@123";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("-----Entre Id----");
		int id = sc.nextInt();
		System.out.println("-----Entre name----");
		  String name=sc.next();
			System.out.println("-----Entre address----");
	        String address=sc.next();
			System.out.println("-----Entre rollNO----");
	      int rollNo = sc.nextInt();
	      
	    String insertSQL = String.format("insert into xworkz.student"
	    		+ " values(%d,'%s',%d,'%s')" + "",id,name,rollNo,address); 
	    
	      System.out.println("Successfully Inserted");
	      
	        
//	            Class.forName("com.mysql.jdbc.Driver");
//	            System.out.println("connecting to databse");
	            Connection con;
				try {
					con = DriverManager.getConnection(url,username,pwd);
				    Statement st=con.createStatement();
		            
		              int noOFRowAffected = st.executeUpdate(insertSQL);
		            System.out.println("-----values inserted---"+noOFRowAffected);
	
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}       
	        
	
		
	}
	
	
	
}	

