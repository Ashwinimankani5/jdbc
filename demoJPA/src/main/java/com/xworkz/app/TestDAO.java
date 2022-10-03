package com.xworkz.app;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class TestDAO {

	public static void main(String[] args) {
		//step 1 : create the entity value and set the value using setter
	
//		Student student = new Student();
//		student.setId(415);
//		student.setName("sanvi");
//		student.setAddress("bagalkot");
//		student.setContactNo(787744454L);
//		
		
		
		//step 2: create entity manager factory.it is used create entityManager
		//by reading persistance.XML and it will loadall the database  and hibernate 
		//properties to entityManager object
		
		// EntityMaagerFactory is an interface,for each DB only one EntityManagerFactory
		
		EntityManagerFactory factorymanager =		
				Persistence.createEntityManagerFactory("xworkz");
		//step 3: EntityManager is an interface  used to perform crud operation 
		EntityManager entityManager = factorymanager.createEntityManager();
		
		//step 4:EntityTransaction used to perform transaction management for save /update
		//EntityTransaction should be used only when  we are saving or updating object
		EntityTransaction transaction = entityManager.getTransaction();	
		
		transaction.begin();
		// persist method will insert record in table 
		//entityManager.persist(student);
	
//		
		 Student getStudent =  entityManager.find(Student.class, 415);
//		 entityManager.remove(getStudent);
		 
		 Student updateStudent =  entityManager.find(Student.class, 415);
		 updateStudent.setName("ritika");
//		 
		 entityManager.merge(updateStudent);
		
	//	commit method will flush out all the data into database
		transaction.commit();
		entityManager.close();
		factorymanager.close();
	}

}
