package com.xworkz.PlayersDTO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "State")
public class State {
	
	@Id
	@GeneratedValue
	private int s_id;
	private String name;
	//@Many to ONE
	//Country country
	public int getId() {
		return s_id;
	}
	public void setId(int id) {
		this.s_id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
