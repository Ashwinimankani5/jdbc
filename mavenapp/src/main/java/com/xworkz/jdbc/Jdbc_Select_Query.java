package com.xworkz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc_Select_Query {
	
	public static void main(String[] args) {
		
		String selectSQL  = "SELECT * FROM xworkz.employee";
		String url = "jdbc:mysql://localhost:3306";
		String username = "root";
		String pwd = "Xworkzodc@123";
		
		
		//step 2 
		Connection con =  null;
		
		try {
			 con = DriverManager.getConnection(url, username, pwd);
			 
				//step3 
				Statement st = con.createStatement();
				
				//step 4 : always better to use executequery for non-DML query
				//(i.e select query).
				//execute quey will return resultSet interface
				//resultSet interface holds table data.
				//to check whether table has records are not
				//then resultSet.next() will return true or false.
				//to get column data then we shouls use resultSet.getX(index number);
				// X indicates  datatype
				
				ResultSet resultSet = st.executeQuery(selectSQL); 
			 while (resultSet.next()) {
				//System.out.println("id :" +resultSet.getInt("id"));
				System.out.println("id :" +resultSet.getInt(1));// index of table
				System.out.println("name :" +resultSet.getString("name"));
				System.out.println();
			}
			 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		
	}

}
