package com.xworkz.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.metrics.ApplicationStartup;

public class TestApp {
	
	public static void main(String[] args) {
	
	
		
	//	ApplicationContext a  = new ClasPathXmlApplicationContext("demo.xml");
			/*ApplicationContext  is  a sub interface of beanfactory 
			 * it creates the objects by reading spring bean xml file (ex: demo.xml file 
			 * ApplicationContext loads the xml file and will perfom pre-instantiation)
			 * spring always create a singletone objects*/	
		
		ApplicationContext ap =  new  ClassPathXmlApplicationContext("demo.xml");
		
		System.out.println("-------------before------resource-----");
		
		/*getBean method will take argument as bean id  and return object created by applicationContext
		 * always getBean will return object class 
		 * we need downcast as per  pojo class*/
			Demo demo=	(Demo) ap.getBean("d"); // pass id from xml file
			//	System.out.println("-----------message : " +d.getMsg());	
				
	}

}
