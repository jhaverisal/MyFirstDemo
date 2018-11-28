package com.example.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;



@Service
public class UserServiceImpl implements UserService {
	
	private UserRepository userRepository;

	
	@Autowired
	public UserServiceImpl(UserRepository userRepository) {
				this.userRepository = userRepository;
	}



	@Override
	public List<User> userList() {
		
		return userRepository.findAll();
	}



	@Override
	public User findById(Integer id) {
		Optional<User> u= userRepository.findById(id);
		if(u.isPresent())
			return u.get();
		else 
			return new User();
	}



	@Override
	public User addUser(User user) {
		return userRepository.save(user);
		
	}



	@Override
	public String deleteUserById(Integer id) {
		 userRepository.deleteById(id);
		 return "{message : User deleted successfully}";
		 
		
	}



	@Override
	public void updateUserById(Integer id) {
		//userRepository.
		
	}



	



	

}
