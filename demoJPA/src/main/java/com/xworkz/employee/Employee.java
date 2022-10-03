package com.xworkz.employee;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "emp")
public class Employee {
	
	@Id
	@GeneratedValue
	@Column(name = "emp_id")
	private int id;
	private String emp_name;
	private String emp_address;
	private long contact_no;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public String getEmp_address() {
		return emp_address;
	}
	public void setEmp_address(String emp_address) {
		this.emp_address = emp_address;
	}
	public long getContact_no() {
		return contact_no;
	}
	public void setContact_no(long contact_no) {
		this.contact_no = contact_no;
	}
	@Override
	public String toString() {
		return "TestDAO [id=" + id + ", emp_name=" + emp_name + ", emp_address=" + emp_address + ", contact_no="
				+ contact_no + "]";
	}
	
	
	
	
	
	

}
