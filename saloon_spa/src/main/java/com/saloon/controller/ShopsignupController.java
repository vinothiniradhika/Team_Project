package com.saloon.controller;

import com.saloon.entity.ShopSignup;
import com.saloon.service.ShopsignupService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ShopsignupController {
	private ShopsignupService ssservice;
	
	public ShopsignupController(ShopsignupService ssservice) {
		super();
		this.ssservice = ssservice;
	}

	@PostMapping("/addshopsignup")
	public ResponseEntity<ShopSignup> addShopSignup(@RequestBody ShopSignup shopsignup){
		ShopSignup newShopSignup=ssservice.addShopSignup(shopsignup);
		return new ResponseEntity<>(newShopSignup,HttpStatus.CREATED);
		
	}
	
	@PutMapping("/update")
	public ResponseEntity<ShopSignup> updateShopSignup(@RequestBody ShopSignup shopsignup){
		ShopSignup newShopSignup=ssservice.updateShopSignup(shopsignup);
		return new ResponseEntity<>(newShopSignup,HttpStatus.OK);
		
	}

}
