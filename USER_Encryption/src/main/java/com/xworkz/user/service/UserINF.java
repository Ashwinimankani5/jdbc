package com.xworkz.user.service;

import com.xworkz.user.dto.User;

public interface UserINF {
	
	public void saveUser(User user);
	public void findUserById(int userId);
	public void deleteUserById(int userId);
	public void loginUser(String email,String password);
	public void updateUser(User user);
}
