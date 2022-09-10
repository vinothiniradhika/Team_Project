package com.saloon.controller;

import com.saloon.entity.ShopLogin;
import com.saloon.entity.UserLogin;
import com.saloon.service.UserloginService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserloginController {
	private UserloginService ulservice;

	public UserloginController(UserloginService ulservice) {
		super();
		this.ulservice = ulservice;
	}
	
	@GetMapping("/login/{uemail}")
	public ResponseEntity<UserLogin> getUserLoginByUemail(@PathVariable("uemail") String uemail) throws Throwable {
		UserLogin userlogin=ulservice.findUserLoginByUemail(uemail);
		return new ResponseEntity<>(userlogin,HttpStatus.OK);
		
	}
	
	@PostMapping("/adduserlogin")
	public ResponseEntity<UserLogin> addUserLogin(@RequestBody UserLogin userlogin){
		UserLogin newUserLogin=ulservice.addUserLogin(userlogin);
		return new ResponseEntity<>(newUserLogin,HttpStatus.CREATED);
		
	}
	
	@PutMapping("/updateuserlogin")
	public ResponseEntity<UserLogin> updateUserLogin(@RequestBody UserLogin userlogin){
		UserLogin newUserLogin=ulservice.updateUserLogin(userlogin);
		return new ResponseEntity<>(newUserLogin,HttpStatus.OK);
		
	}

}
