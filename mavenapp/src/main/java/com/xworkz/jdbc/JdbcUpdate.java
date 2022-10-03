package com.xworkz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcUpdate {

	public static void main(String[] args) {
		
		
		String url = "jdbc:mysql://localhost:3306";
		String userName = "root";
		String pwd = "Xworkzodc@123";
		
		Connection connection = null;
		
		//Step1
		//load and register driver 
		try {
			Class.forName("com.mysql.jdbc.Driver");// itis optional for connection
						// it will load automatically from vendor DB jar (mysql jar)
			
			 connection = DriverManager.getConnection(url, userName, pwd);
			
			Statement st = connection.createStatement();
			
			//st.execute("Update xworkz.employee set name='Harsha Shirur' where id=101 ");
			st.execute("Delete from xworkz.employee  where id=101 ");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// working of jdbc (all below operation done by database engine)
	//	1) divide sql query into chunks(information)
	//	2) compile sql query
	//  3) execute sql query
		
		
		//by using statement interface we can pass only static sql query ,
		//hacker can hack data from static sql query(sql injection will happen) to avoid that
	 //	sql injection in jdbc program we use prepared statement  interface
		
		
		// prepared statement uses dynamic sql query such as  :
		
		//  insert into tablename  values(?,?,?);  where table has 3 columns
		
		// update from tablename set name = ? where id=?
		
		// delete from tablename where id = ?
		
		// 1.prepared statement is a sub-interface  of statement interface
		// 2.prepared statement uses dynamic sql query to communicate with database
		// 3. preparedStatement pst  = connection.preparedStatement(String query);
		
		//   pst.setXXX(); to set value for dynamic sql query;
		
	//	XXX ----> represents different datatypes
		
		
//		example:
//			step 3:
//				PreparedStatement pst = connection.pepareStatement
//				("insert into xworkz.employee values(?,?)");
//		// first parametre  is index of column 
//		//second parametre value 
//		
//		pst.setInt(1, 13);
//		pst.setString(2, "rani");
//		pst.execute();
//		
		
		
		
		
		
		
	//	Assignment: write a program to insert record using preparedStatement
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
	}
}
