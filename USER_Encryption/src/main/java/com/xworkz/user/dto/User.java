package com.xworkz.user.dto;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;

@Entity
@Table(name = "user")
@NamedQuery(name = "findByEmail", query = "select s from  User s where s.email =:email " )
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "EMAIL", unique =  true,nullable = false,length=100)
	private String email;
	
	@Column(name = "NAME")
	private String name;
	
	@Column(name = "AGE")
	private int age;
	
	@Column(name = "PASSWORD")
	private String password;
	
	@Column(name = "DOB")
	private Date dateofbirth;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getDateofbirth() {
		return dateofbirth;
	}

	public void setDateofbirth(java.util.Date dob) {
		this.dateofbirth = (Date) dob;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", email=" + email + ", name=" + name + ", age=" + age + ", password=" + password
				+ ", dateofbirth=" + dateofbirth + "]";
	}
	
	
	

}
