package com.xworkz.app;

import java.sql.Connection;
import java.sql.DriverManager;
 


public class JdbcApp {
	
	public static void main(String[] args) {
	
	}
	static final String USERNAME = "root";
	static final String PASSWORD = "root";
	static final String URL = "jdbc:mysql://localhost:3306";
	public  void createJDBC() {
		
		//step1 :load mySQL driver(vender)
		try {
			Class.forName("com.mysql.jdbc.Driver"); // to excecute this line it need add mysql driver jar
			
			// step 2 : create connction
			Connection con  = (Connection) DriverManager.getConnection(URL, USERNAME,PASSWORD);	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
