package com.xworkz.app;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/*<dependency>
<!-- https://mvnrepository.com/artifact/org.hibernate.orm/hibernate-core -->

  <groupId>org.hibernate.orm</groupId>
  <artifactId>hibernate-core</artifactId>
  <version>6.1.1.Final</version>

</dependency>
*/
//clas level annotation
@Entity  // @Entity:class will be consider  for JPA crud operation
@Table(name = "Student_table") //@Table: it will  be the table name and schema name in database
public class Student {
	/*hibernate-core depedency/jar file*/
	
	 // @Id: property/method level annotation
		// column for the primary key
		// note : id should be integer only
	@Id 
	private int id;
	private String name;
	private String address;
	private long contactNo;

	//annotation is an interface
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getContactNo() {
		return contactNo;
	}
	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + ", contactNo=" + contactNo + "]";
	}
	
}
