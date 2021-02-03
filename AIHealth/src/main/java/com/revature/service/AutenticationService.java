package com.revature.service;

import com.revature.model.User;
import com.revature.repository.UserRepository;

public class AutenticationService {
	
	private UserRepository userRepo;
	
	public Boolean autenticate(String username, String password) {
		User user = userRepo.findByUsername(username);
		return user.getPassword().equals(password);
		
	}

}
