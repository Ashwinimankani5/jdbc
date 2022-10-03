package com.xworkz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectQuery {
public static void main(String[] args) {
		
		String selectSQL  = "select name,roll_no,address from xworkz.student";
		String url = "jdbc:mysql://localhost:3306";
		String username = "root";
		String pwd = "Xworkzodc@123";
		
		
		//step 2 
		Connection con =  null;
		
		try {
			 con = DriverManager.getConnection(url, username, pwd);
			 
				//step3 
				Statement st = con.createStatement();
				
				boolean res = st.execute(selectSQL); 
				System.out.println("boolean value");
				if(res == true) {
					
				ResultSet	resultSet = st.executeQuery(selectSQL);
			 while (resultSet.next()) {
			
				System.out.println("roll_no:" +resultSet.getInt("roll_no"));// index of table
				System.out.println("name :" +resultSet.getString("name"));
				System.out.println("address :" +resultSet.getString("address"));
				System.out.println();
			}
				}
			 else {
				 System.out.println("DML query");
			 }
			 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		

	}
}
