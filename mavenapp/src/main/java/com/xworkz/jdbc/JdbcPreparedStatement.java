package com.xworkz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcPreparedStatement {
	
	public static void main(String[] args) throws Exception {
		
		String url = "jdbc:mysql://localhost:3306";
		String username = "root";
		String pwd = "Xworkzodc@123";
		
		Connection con = null;
		
		
			Class.forName("com.mysql.jdbc.Driver");
			
			 try {
				con = DriverManager.getConnection(url, username, pwd);
				
				//PreparedStatement pst = con.prepareStatement("insert into xworkz.employee values(?,?)");
				
				String query ="delete from employee where ID=10";
				PreparedStatement pst =con.prepareStatement(query);     
						
						pst.setInt(1, 4);
						pst.setString(2,"TCS");
						pst.execute();
//						
//						int updateCount=pst.executeUpdate();
//						System.out.println("The number of rows deleted :"+updateCount);
						
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				
		
		finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
	}

}
