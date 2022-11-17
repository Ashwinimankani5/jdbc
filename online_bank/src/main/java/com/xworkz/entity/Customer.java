package com.xworkz.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Columns;
@Entity
//@MappedSuperclass
public class Customer extends User {
	
	
	private int id;
	private String govt_id;
	private String account_no;
	private String customer_id;
	private double balance;
	@OneToOne
	private Bank bank;
	private String bankName;
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGovt_id() {
		return govt_id;
	}
	public void setGovt_id(String govt_id) {
		this.govt_id = govt_id;
	}
	
	public Bank getBank() {
		return bank;
	}
	public void setBank(Bank bank) {
		this.bank = bank;
	}
	public String getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
		

}
