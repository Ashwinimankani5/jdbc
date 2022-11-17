package com.xworkz.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class User {
	@Id
	@GeneratedValue
	private int id;
	private String firstName;
	private String lastName;
	private String address;
	@Column(unique = true)
	private String email;
	@Column(unique = true)
	private String userName;
	@Column(unique = true)
	private String password;
	private String mobileNumber;
	private String gender;
	private int bank_Id;
	private int account_no;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
		
	}
	public int getBank_Id() {
		return bank_Id;
	}
	public void setBank_Id(int bank_Id) {
		this.bank_Id = bank_Id;
	}
	public int getAccount_no() {
		return account_no;
	}
	public void setAccount_no(int account_no) {
		this.account_no = account_no;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", address=" + address
				+ ", email=" + email + ", userName=" + userName + ", password=" + password + ", mobileNumber="
				+ mobileNumber + ", gender=" + gender + ", bank_Id=" + bank_Id + ", account_no=" + account_no + "]";
	}
	
	
	
	
	

}
