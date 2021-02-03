package com.revature.controller;

import com.revature.model.User;
import com.revature.service.AutenticationService;

public class LoginController {
	
	public AutenticationService service;
	
	public String service(String username, String password) {
		return service.autenticate(username, password)? "/home" : "/login";
		
	}
		


}
