package com.xworkz.employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;


public class TestDAO {
	
	public static void main(String[] args) {
		
		Employee em = new Employee();
		//em.setId(1);
		em.setEmp_name("Roop");
		em.setEmp_address("shitu");
		em.setContact_no(874787777L);
		
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("xworkz");
		EntityManager manager =factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
//		transaction.begin(); // start of persistence area
		manager.persist(em);
		
		//Employee  employee2 =manager.find(Employee.class, 2);
		//find method will get the record fromDB where id = 2
		//internally JPA will generate select Query(select * from emp where id =2)
		
//		
//		//update the value in table
//		employee2.setEmp_name("gita");
//		
//		//for deleting record
//		Employee  removeEmp =manager.find(Employee.class, 2);
//		manager.remove(removeEmp);
//
//		
		
	//	transaction.commit();  // end of persistance area.within this persistence area the mentioned values are updated
	//	manager.close();
	//	factory.close();
		getAllEmployee();
		System.out.println("toget name of all employees");
		getEmployeeName();
	}
	
	public static void getAllEmployee() {
		// will below EntityManagerFactory will read all DB  and hibernates properties into EntityManger object
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("emp");
		EntityManager manager = factory.createEntityManager();
//		EntityTransaction transaction = manager.getTransaction();
		
//		transaction.begin();
		// Query is an interface  jakatra.persistence
		//Query object holds the information which was return by JPA query
		//Query oobject is like Resultset in JDBC 
		//Query will willreturn class object whi=ch was passed  in query
		
		Query query = manager.createQuery("from Employee"); // use ClassName
		query.getResultList().forEach(e->{
			System.out.println("emp:" + e.toString());
		});
		
		
//		transaction.commit();
		manager.close();
		factory.close();
		
		
		
	}
	
	public static void getEmployeeName() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("emp");
		EntityManager manager = factory.createEntityManager();
//		EntityTransaction transaction = manager.getTransaction();
		
//		transaction.begin();
		// Query is an interface  jakatra.persistence
		//Query object holds the information which was return by JPA query
		//Query oobject is like Resultset in JDBC 
		//Query will willreturn class object whi=ch was passed  in query
		
//		Query query = manager.createQuery("select b.emp_name from Employee b");  // b -> it is aliyas name. for aliyas name use anyletterit will work
//		query.getResultList().forEach(e->{											// b.emp_name--> its employee String emp_name
//			System.out.println("emp:" + e.toString());
//		});
		
		
		
		
//		transaction.commit();
		manager.close();
		factory.close();
		
		
	}


}
