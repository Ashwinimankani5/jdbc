package com.xworkz.user.dto;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.xworkz.user.service.UserService;

public class UserDAO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		User user  =  new User();
		user.setAge(29);
		user.setEmail("manoj@gmail.com");
		user.setName("manoj");
		//date of birth from mysql jar with try catch block by creating object(simpleDateFormatObject)
	
		SimpleDateFormat date =  new SimpleDateFormat("yyyy-MM-dd"); 
		//date.parse("1992-02-28");
		
		java.util.Date dob;
		try {
			dob =  date.parse("1992-10-15");
			
			user.setDateofbirth(dob);
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	//password encoding
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		user.setPassword(encoder.encode("ritika123"));
		
		UserService userService = new UserService();
		//passing user object or service to save
		//userService.saveUser(user);
		
		System.out.println("------before entering email and password");
		System.out.println("");
	User user1 =	userService.findByUserEmail("manoj@gmail.com" ,"ritika123");
		System.out.println("------after entering email and password" +user1.toString());

	}

}
