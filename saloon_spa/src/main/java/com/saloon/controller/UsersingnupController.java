package com.saloon.controller;



import com.saloon.entity.UserSignup;
import com.saloon.service.UsersignupService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersingnupController {
	private UsersignupService usservice;
	
	public UsersingnupController(UsersignupService usservice) {
		super();
		this.usservice = usservice;
	}

	@PostMapping("/addusersignup")
	public ResponseEntity<UserSignup> addUserSignup(@RequestBody UserSignup usersignup){
		UserSignup newUserSignup=usservice.addUserSignup(usersignup);
		return new ResponseEntity<>(newUserSignup,HttpStatus.CREATED);
		
	}
}
