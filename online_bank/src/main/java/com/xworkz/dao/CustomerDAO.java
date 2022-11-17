package com.xworkz.dao;

import java.util.List;

import com.xworkz.entity.Customer;

public interface CustomerDAO {

	public Customer saveCustomer(Customer customer);
	public List<Customer> findCustomerName(String customerName);
	public Customer updateCustomer(int customerId);

}
