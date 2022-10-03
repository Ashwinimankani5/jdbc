package com.xworkz.PlayersDTO;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Players")
public class Players {
	
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private long salary;
	@OneToOne(cascade = CascadeType.ALL)
	private Country country;
	@OneToOne(cascade = CascadeType.ALL)
	private Team team;
	
	public int getCid() {
		return id;
	}
	public void setCid(int cid) {
		this.id = cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
	public Team getTeam() {
		return team;
	}
	public void setTeam(Team team) {
		this.team = team;
	}
	

}
