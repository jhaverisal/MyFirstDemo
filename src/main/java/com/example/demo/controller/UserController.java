package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	private UserService userService;

	@Autowired
	public UserController(UserService userService) {
		
		this.userService = userService;
	}
	
	@RequestMapping("/list")
	public List<User> listUser(){
		return userService.userList();
	}
	
	
	@RequestMapping("/list/find/{id}")
	public User findUser(@PathVariable Integer id){
		return userService.findById(id);
		
	}	
		
	@PostMapping("/add")
	public User addUser(@RequestBody User user) {
		return userService.addUser(user);
	}
	
	@PostMapping("/delete/{id}")
	public String addUser(@PathVariable Integer id) {
		return userService.deleteUserById(id);
	}
	
	
	
	
	
}
