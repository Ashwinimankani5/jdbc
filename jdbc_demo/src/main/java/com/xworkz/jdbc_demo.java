package com.xworkz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class jdbc_demo {
	
	public static void main(String[] args) {
		
		//url conect to my database
		//jdbc  ----> main protocol
		//mysql ----> sub protocol
		//://localhost ----> system name
		//(if we are connecting remote system then in place 
	    //	of //localhost we need to give ip address of remote system)
		
		//port  ----> mysql port number
		String url = "jdbc:mysql://localhost:3306";
		String username = "root";
		String password = "Xworkzodc@123";
		
		
		//jdbc steps 
		
		// step1:  load vendor or drive and drive register
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			//step 2: create connection
			// connection is an interface(present in java.sql)
			//driverManager factory class(or helper class)
			//getConnection overloaded method(it's an factory method) which create connection type object
			//
			
			// we have 3 overloaded method
			//1. getConnection(String full url);
			//2. getConnection(String url , String name ,String password);
			//3. getConnection(String url, poperty props);
			Connection con = DriverManager.getConnection(url, username, password);
			
			System.out.println(" ----con objet--"+con.getClass().getName() );
	
			//step 3: create statement
			//statement is an interface (java.sql package)
			//it is used to create platform to communicate with datbase using sql query
			Statement st =  con.createStatement();
			
			//step4  : excecute the statement
			//execute the sqlquery
			//excecute only DML query
			
			
		//	st.execute("insert into " + " xworkz.employee values(101,'Harsha')");
			//st.execute("insert into " + " xworkz.employee values(102,'Harshita')");
		//	st.execute("insert into " + " xworkz.employee values(103,'Dev')");
			st.execute("insert into " + " xworkz.employee values(10,'Devi')");
			//step5  : close connection
		con.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("");
		}
		 
		 
		
	}

}
