package com.xworkz.jdbc.Hospital1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConnectionUtil {
	
	private static Connection con;
	private JdbcConnectionUtil() {}
	
	static {
		try {
			con=DriverManager.getConnection(JdbcUtil.URL, JdbcUtil.USERNAME, JdbcUtil.PASSWORD);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection()
	{
		return con;
	}
	

}
