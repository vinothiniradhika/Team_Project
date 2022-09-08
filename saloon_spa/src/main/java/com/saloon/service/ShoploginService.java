package com.saloon.service;

import java.util.UUID;

import com.saloon.entity.ShopLogin;
import com.saloon.exception.ShopLoginNotFoundException;
import com.saloon.repository.ShopLoginRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShoploginService {
	private ShopLoginRepository slrepo;
	@Autowired
	public  ShoploginService(ShopLoginRepository slrepo) {
		this.slrepo=slrepo;

	}
	
	public ShopLogin addShopLogin(ShopLogin sl) {
		sl.setShopLoginCode(UUID.randomUUID().toString());
		return slrepo.save(sl);
	}
	public ShopLogin updateshopLogin(ShopLogin sl) { 
		return slrepo.save(sl);
	}
	
	public ShopLogin findShopLoginBySemail(String semail) { 
		return (ShopLogin) slrepo.findShopLoginBySemail(semail).orElseThrow(()-> new ShopLoginNotFoundException("Incorrect username "));
	}
}
