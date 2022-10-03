package com.xworkz.user.util;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class EntityManagerUtil {
	
	
	EntityManager factory;

	public EntityManagerUtil() {
		
factory = Persistence.createEntityManagerFactory("userUnit").createEntityManager();

	}
	public EntityManager getEntityManager() {
		return factory;
		
	}
	

}
