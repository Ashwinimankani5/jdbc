package com.xworkz.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import com.xworkz.entity.Bank;
import com.xworkz.service.BankService;

@Controller
@RequestMapping("bank")
public class BankController {

		
		public BankController() {
			System.out.println("Bank controller constructor");
		// TODO Auto-generated constructor stub
	}
		@Autowired
		BankService service ;
		
		@PostMapping("/save")
		public ModelAndView saveBank(@ModelAttribute Bank bank) {
			System.out.println("save bank" +this.getClass());
			Bank emp2 = service.saveBank(bank);
			System.out.println("saved" +emp2.getBankName());

			return new ModelAndView("welcome","bname",emp2);
 
		}			
//		@Autowired
//		BankService service ;
//		
		@RequestMapping(value = "/search", method = RequestMethod.GET )
		public ModelAndView findByBranchName(@RequestParam String branchName) {
			System.out.println("search BranchName----- "+this.getClass());
			Bank search =  service.findByBranchName(branchName);
			
			System.out.println("search branch name  "+search.toString());
			return new ModelAndView("customer");
		}
		
		@RequestMapping(value ="/updating", method = RequestMethod.POST)
		public ModelAndView updateBankAddressByBankName(@ModelAttribute String bankName ,String address) {
			System.out.println(" Updating Bank Address--@controller ----- ");
			Bank update =service.updateBankAddressByBankName(bankName,address);
			System.out.println(" Updated Bank Address----- ");
			return new ModelAndView("show", "bank_id", update);
		
		}
		
}
