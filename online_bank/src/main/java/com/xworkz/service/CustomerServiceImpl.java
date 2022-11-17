package com.xworkz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.dao.CustomerDAO;
import com.xworkz.entity.Customer;
@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	CustomerDAO customerdao;
	
	@Override
	public Customer saveCustomer(Customer customer) {
		return customerdao.saveCustomer(customer);
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
