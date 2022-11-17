 package com.xworkz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.dao.BankDAO;
import com.xworkz.entity.Bank;

@Service
public class BankServiceImpl implements BankService{
	@Autowired
	 BankDAO bankdao;
	
	@Override
	public Bank saveBank(Bank bank) {
		// TODO Auto-generated method stub
		return bankdao.saveBank(bank);
	}
	//@Autowired
	public  Bank findByBranchName(String branchName) {
		// TODO Auto-generated method stub
		return bankdao.findByBranchName(branchName);
	}

	@Override
	public Bank updateBankAddressByBankName(String bankName, String address) {
		
			System.out.println("updated bank address --@Service---");		
		return bankdao.updateBankAddressByBankName(bankName, address);
	}
	@Override
	public Bank deleteBankDetailsByBankName(String BankName) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
