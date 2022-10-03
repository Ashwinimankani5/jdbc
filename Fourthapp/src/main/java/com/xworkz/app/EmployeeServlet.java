package com.xworkz.app;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EmployeeServlet extends  HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
		
		String id = req.getParameter("id");
		Integer idint = Integer.parseInt(id);
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		
		//write JDBC logic 
		String url = "jdbc:mysql://localhost:3306/xworkz";
		String username = "root";
		String pwd = "Xworkzodc@123";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection  con = DriverManager.getConnection(url, username, pwd);
			PreparedStatement pstmt =  con.prepareStatement("insert into employee1 values(?,?,?,?)");
			
			pstmt.setInt(1, idint);
			pstmt.setString(2, name);
			pstmt.setString(3, email);
			pstmt.setString(4, password);
			
			int result = pstmt.executeUpdate();
			//write response to send back to server
			resp.getWriter().print("-----employee1 data inserted-----");
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
	}
}
