package com.xworkz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.xworkz.entity.Customer;
import com.xworkz.service.CustomerService;

public class CustomerController {

	public CustomerController() {
		System.out.println("customer controller constructor is created");
	}
	@Autowired
	CustomerService serviice;
	@RequestMapping(value ="save", method = RequestMethod.POST)
	public ModelAndView saveCustomer(@ModelAttribute Customer customer) {
		System.out.println("save customer" +this.getClass());
		Customer customer1 = serviice.saveCustomer(customer);
		System.out.println("saved "+customer1.getId());
		return new ModelAndView("customer");
		
	}
		
	
}
