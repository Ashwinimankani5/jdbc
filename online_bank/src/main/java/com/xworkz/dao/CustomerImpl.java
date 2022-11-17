package com.xworkz.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.servlet.ModelAndView;

import com.xworkz.entity.Customer;
@Repository
public class CustomerImpl implements CustomerDAO {
	
	@Autowired
	EntityManagerFactory factory;
	EntityManager manager = null;

	@Override
	public Customer saveCustomer(Customer customer) {
		boolean isCustomerSaved = false;
		try {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(customer);
		isCustomerSaved = true;
	//	manager.close();
		//factory.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isCustomerSaved? customer:null ;
	}

	@Override
	public List<Customer> findCustomerName(String customerName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer updateCustomer(int customerId) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
