package com.saloon.controller;

import com.saloon.entity.Booking;
import com.saloon.entity.ShopLogin;
import com.saloon.service.ShoploginService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShoploginController {
	private ShoploginService slservice;

	public ShoploginController(ShoploginService slservice) {
		super();
		this.slservice = slservice;
	}
	
	@GetMapping("/shoplogin/{semail}")
	public ResponseEntity<ShopLogin> getShopLoginBySemail(@PathVariable("semail") String semail) throws Throwable{
		ShopLogin shoplogin=slservice.findShopLoginBySemail(semail);
		return new ResponseEntity<>(shoplogin,HttpStatus.OK);
		
	}
	
	@PostMapping("/addshoplogin")
	public ResponseEntity<ShopLogin> addShopLogin(@RequestBody ShopLogin shoplogin){
		ShopLogin newShopLogin=slservice.addShopLogin(shoplogin);
		return new ResponseEntity<>(newShopLogin,HttpStatus.CREATED);
		
	}
	
	@PutMapping("/updateshoplogin")
	public ResponseEntity<ShopLogin> updateshoplogin(@RequestBody ShopLogin shoplogin){
		ShopLogin newShopLogin=slservice.updateShopLogin(shoplogin);
		return new ResponseEntity<>(newShopLogin,HttpStatus.OK);
		
	}
	

}
