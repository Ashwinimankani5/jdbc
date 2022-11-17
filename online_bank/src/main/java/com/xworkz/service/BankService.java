package com.xworkz.service;

import java.util.List;

import com.xworkz.entity.Bank;

public interface BankService {
	
	public Bank saveBank(Bank bank);
	public Bank findByBranchName(String branchName);
	public Bank updateBankAddressByBankName(String BankName , String Address);
	public Bank  deleteBankDetailsByBankName(String BankName);

}
