package com.example.demo.service;

import java.util.List;

import com.example.demo.model.User;

public interface UserService {
	
	public List<User> userList();
	
	public User findById(Integer id);
	
	public User addUser(User user);
	
	public String deleteUserById(Integer id);
	
	public void updateUserById(Integer id);
	
	

}
