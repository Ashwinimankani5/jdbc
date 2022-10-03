package com.xworkz.user.service;

import java.util.List;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.xworkz.user.dto.User;
import com.xworkz.user.util.EntityManagerUtil;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class UserService implements UserINF{
	
	//EntityManager manager = (EntityManager) Persistence.getPersistenceUtil();
	EntityManagerUtil entitymanagerutil= new EntityManagerUtil();
	
	public void saveUser(User user) {
		
	entitymanagerutil.getEntityManager().getTransaction().begin();
	
	entitymanagerutil.getEntityManager().persist(user);
	
	entitymanagerutil.getEntityManager().getTransaction().commit();;
	entitymanagerutil.getEntityManager().close();

	}

	public void findUserById(int userId) {
		// TODO Auto-generated method stub
		
	}

	public void deleteUserById(int userId) {
		// TODO Auto-generated method stub
		
	}

	public void loginUser(String email, String password) {
		// TODO Auto-generated method stub
		
	}

	public void updateUser(User user) {
		// TODO Auto-generated method stub
		
	}
	
	public User findByUserEmail(String email,String password) {
		
	Query query =entitymanagerutil.getEntityManager().createNamedQuery("findByEmail");
	query.setParameter("email", email);//set parameter for JPQL query
	//forencryption password
	//BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
//	query.setParameter("password", encoder.encode("ritika123"));

	List<User> li = query.getResultList();
	System.out.println("--------count of list-----"+li.size());
	User returnUser = null;
	for (User user : li) {
		returnUser= user;
	}
	return returnUser;
	}

}
