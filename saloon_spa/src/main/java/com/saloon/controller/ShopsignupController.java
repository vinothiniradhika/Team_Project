package com.saloon.controller;

import java.util.List;

import javax.persistence.GeneratedValue;

import com.saloon.entity.Register;
import com.saloon.entity.ShopSignup;
import com.saloon.entity.UserSignup;
import com.saloon.request.ShopRequest;
import com.saloon.request.UserRequest;
import com.saloon.service.ShopsignupService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
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
	
	@GetMapping("/allshopsignup")
	public ResponseEntity<List<ShopSignup>> getAllShopSignups(){
		List<ShopSignup> signups=ssservice.findAllShopSignups();
		return new ResponseEntity<>(signups,HttpStatus.OK);
	}

	@PostMapping("/addshopsignup")
	public ResponseEntity<ShopSignup> addShopSignup(@RequestBody ShopSignup shopsignup){
		ShopSignup newShopSignup=ssservice.addShopSignup(shopsignup);
		return new ResponseEntity<>(newShopSignup,HttpStatus.CREATED);
		
	}
	
	@PutMapping("/updateshopsignup")
	public ResponseEntity<ShopSignup> updateShopSignup(@RequestBody ShopSignup shopsignup){
		ShopSignup newShopSignup=ssservice.updateShopSignup(shopsignup);
		return new ResponseEntity<>(newShopSignup,HttpStatus.OK);
		
	}
	
	@PostMapping("/shoplogin")
    public ShopSignup shoplogin(@RequestBody ShopRequest a) throws Exception {
                ShopSignup shop=a.toShop();
         String sremail = shop.getSremail();
         String srpassword = shop.getSrpassword();
         ShopSignup shopObj=null;
         if(sremail!=null && srpassword!=null)
         {
             shopObj=ssservice.findBySremailAndSrpassword(sremail, srpassword);
         }
         if(shopObj == null) {
             throw new Exception("Wrong credentials");
         }
         return shopObj;
     }
	
	

}
