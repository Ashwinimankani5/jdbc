package com.xworkz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Company {
	
	public static void main(String[] args) {
		
	
	
	String url = "jdbc:mysql://localhost:3306";
	String username = "root";
	String password = "Xworkzodc@123";
	
	//Class.forName("com.mysql.jdbc.Driver");
	try {
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con = DriverManager.getConnection(url, username, password);
		
		//System.out.println(" ----con objet--"+con.getClass().getName() );
		Statement st =  con.createStatement();
		
		st.execute("insert into " + " xworkz.company values(1,'Apple','America'7988,)");
	//	st.execute("insert into " + " xworkz.company values(2,'Facebook','Swiden',878414141L)");
//		st.execute("insert into " + " xworkz.company values(3,'Twitter','Landon'144325256,)");
		//st.execute("insert into " + " xworkz.company values(4,'Google','Bankak'223287898,)");
		
		con.close();
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
