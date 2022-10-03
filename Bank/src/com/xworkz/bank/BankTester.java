package com.xworkz.bank;

public class BankTester {
  public static void main(String[] args) {
	  VijayaBank	bank = new VijayaBank ();
	bank.name="Sbi";
	bank.location="Basaveshwar nagar";
	bank.getBalance();
	bank.getAmount();
	bank.getMoney();
	System.out.println(bank.name+"  " +bank.location );
}
}
