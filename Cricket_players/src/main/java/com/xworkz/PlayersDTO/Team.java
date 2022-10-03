package com.xworkz.PlayersDTO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Team")
public class Team {
	
	@Id
	@GeneratedValue
	private int t_id;
	private String name;
	public int getId() {
		return t_id;
	}
	public void setId(int id) {
		this.t_id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
