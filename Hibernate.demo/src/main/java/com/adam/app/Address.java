package com.adam.app;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@jakarta.persistence.Entity
@jakarta.persistence.Table(name="address_table")
public class Address {
	@Id
	@GeneratedValue
	@Column(name="address_ID")// to give user defined column name
	private int addressId;
	@Column(name="area_NAME")
	private String area;
	@Column(name="city_NAME")
	private String city;
	
	 
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	
	
}
