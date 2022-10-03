package com.adam.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestMain {
public static void main(String[] args) {
	
	
	 
User user=new User();
user.setUserName("shashira sir");


Address address=new Address();
address.setArea("btm");
address.setCity("btm");

//setting address to user object(which map onetoone)
user.setAddress(address);	
	
	Configuration configuration=new Configuration();
	configuration.configure();
	SessionFactory factory	=configuration.buildSessionFactory();
	Session session=factory.openSession();
	Transaction transaction=session.beginTransaction();
	session.save(user);
	session.save(address);
	
	
	
	transaction.commit();
	session.close();
	
	
	
	
	
	

	
	
	
	
	
}
}
