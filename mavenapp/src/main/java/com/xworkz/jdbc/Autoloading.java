package com.xworkz.jdbc;

import java.io.ObjectInputStream.GetField;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Autoloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String url = "jdbc:mysql://localhost:3306";
		String username = "root";
		String pwd = "Xworkzodc@123";
		//step 1 : jvm looks for a file called java.sql.Driver inside META-INF in mysql jar.
		//step 2 
		try {
			Connection con= DriverManager.getConnection(url, username, pwd);
			//metadata means information of information 
			//to get additional information of database then we use con.getMetadta() method
	System.out.println("--------Db------"+con.getMetaData().getDatabaseProductName());		
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
	}

}
