package com.saloon.service;

import java.util.UUID;

import com.saloon.entity.ShopSignup;
import com.saloon.entity.UserLogin;
import com.saloon.repository.ShopSignupRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShopsignupService {
	private ShopSignupRepository ssrepo;
	
	@Autowired
	public ShopsignupService(ShopSignupRepository ssrepo) {
		this.ssrepo=ssrepo;
		
	}
	
	public ShopSignup addShopSignup(ShopSignup ss) {
		return ssrepo.save(ss);
	}
	
	public ShopSignup updateShopSignup(ShopSignup ss) { 
		return ssrepo.save(ss);
	}
	

}