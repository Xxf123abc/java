package com.xxl.service;

import com.xxl.model.UserT;

public interface UserService {

	public UserT getUserById(int userId);
	
	public UserT selectUserById(int userId); 
	
	public void addUser(UserT u);
	
	public void inset(UserT u);
	
	public String getPassWd(int id);
	
}
