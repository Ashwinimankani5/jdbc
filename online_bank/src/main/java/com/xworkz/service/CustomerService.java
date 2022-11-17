package com.xworkz.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.xworkz.entity.Bank;
import com.xworkz.entity.Customer;

public interface CustomerService {
	
	public Customer saveCustomer(Customer customer);
	public List<Customer> findCustomerName(String customerName);
	public Customer updateCustomer(int customerId);

}
