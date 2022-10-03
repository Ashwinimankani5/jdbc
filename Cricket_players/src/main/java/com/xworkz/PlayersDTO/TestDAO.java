package com.xworkz.PlayersDTO;

import java.util.ArrayList;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class TestDAO {
	

	public static void main(String[] args) {
		
		EntityManagerFactory entityMagaerFactory = Persistence.createEntityManagerFactory("teamunit");
		EntityManager entityManager = entityMagaerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		entityTransaction.begin();
		//create state object
		State karnataka =  new State();
		karnataka.setName("Karnataka");
		
		State maharastra =  new State();
		maharastra.setName("maharastra");
		
		State tamilNadu =  new State();
		tamilNadu.setName("tamilNadu");
		
		State kerala =  new State();
		kerala.setName("kerala");
		
		//add all the states toone arrayList
		ArrayList<State> states =new  ArrayList();
		states.add(kerala);
		states.add(karnataka);
		states.add(maharastra);
		states.add(tamilNadu);
		
		
		//country
		Country country= new Country();
		country.setName("India");
		country.setCode("+91");
		country.setListOfStates(states);  //adding ArrayList states
	
		//Team
		Team team = new Team();
		team.setName("TeamIndia");
		
		//players
		Players dhoni = new Players();
		dhoni.setName("dhoni");
		dhoni.setTeam(team);
		dhoni.setCountry(country);
		dhoni.setSalary(787545984);
		
		entityManager.persist(dhoni);
		entityManager.persist(karnataka);
		entityManager.persist(kerala);
		entityManager.persist(tamilNadu);
		entityManager.persist(maharastra);

		
		
		entityTransaction.commit();
		entityManager.close();
		entityMagaerFactory.close();
		
	}

}
