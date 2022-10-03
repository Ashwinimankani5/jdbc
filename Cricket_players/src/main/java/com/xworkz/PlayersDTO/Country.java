package com.xworkz.PlayersDTO;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "country")
public class Country {
	
	@Id
	@GeneratedValue
	private int c_id;
	private String name;
	private String code;
	@OneToMany(cascade = CascadeType.ALL)
	private List<State>listOfStates;
	
	
	public int getId() {
		return c_id;
	}
	public void setId(int id) {
		this.c_id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public List<State> getListOfStates() {
		return listOfStates;
	}
	public void setListOfStates(List<State> listOfStates) {
		this.listOfStates = listOfStates;
	}
	
	


}
