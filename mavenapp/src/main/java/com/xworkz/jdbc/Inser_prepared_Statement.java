package com.xworkz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.Instant;
import java.util.Scanner;

public class Inser_prepared_Statement {
	
	public static void main(String[] args) {
		prepareStatement();
		statement();
		      
	}
	
	static void prepareStatement() {
		String url = "jdbc:mysql://localhost:3306";
		String username = "root";
		String pwd = "Xworkzodc@123";
	      
	    String insertSQL = String.format("insert into xworkz.student values(?,?,?,?)" ); 
	    
	      System.out.println("Successfully sql query Inserted");
	      
	        
//	            Class.forName("com.mysql.jdbc.Driver");
//	            System.out.println("connecting to databse");
	            Connection con;
				try {
					con = DriverManager.getConnection(url,username,pwd);
					
				    PreparedStatement pstmst=con.prepareStatement(insertSQL);
				    
		            Instant startTime = Instant.now();
		            System.out.println("starting time of preparedStatement "+ startTime );
		            
		            pstmst.setInt(1, 108);
		            pstmst.setString(2,"laxmi");
		            pstmst.setInt(3, 8777);
		            pstmst.setString(4,"lamani");
		           
		            
		            int noOFRowAffected = pstmst.executeUpdate();
		            System.out.println("-----values inserted---"+noOFRowAffected);
		            
		            Instant endTime = Instant.now();
		            System.out.println("ending time of preparedStatement "+ endTime );
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}       
	        
		
	}
	static void statement() {
		String url = "jdbc:mysql://localhost:3306";
		String username = "root";
		String pwd = "Xworkzodc@123";
		   
	    String insertSQL = String.format("insert into xworkz.student values(18,'satvik',7777,'banglore')" ); 
	    
	      System.out.println("Successfully sql query Inserted");
	      
	        
//	            Class.forName("com.mysql.jdbc.Driver");
//	            System.out.println("connecting to database");
	            Connection con;
				try {
					con = DriverManager.getConnection(url,username,pwd);
					
				    Statement st=con.createStatement();
				    
		            Instant startTime = Instant.now();
		            System.out.println("starting time of Statement "+ startTime );
		            
		            int noOFRowAffected = st.executeUpdate(insertSQL);
		            System.out.println("-----values inserted---"+noOFRowAffected);
		            
		            Instant endTime = Instant.now();
		            System.out.println("ending time of Statement "+ endTime );
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}       
	        

	}
}

