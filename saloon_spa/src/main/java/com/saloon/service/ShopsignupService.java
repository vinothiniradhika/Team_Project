package com.saloon.service;

import java.util.List;

import com.saloon.entity.ShopSignup;
import com.saloon.entity.UserSignup;
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
	
	public List<ShopSignup> findAllShopSignups(){
        return ssrepo.findAll();
    }
	
	public ShopSignup addShopSignup(ShopSignup ss) {
		return ssrepo.save(ss);
	}
	
	public ShopSignup updateShopSignup(ShopSignup ss) { 
		return ssrepo.save(ss);
	} 

	/*public ShopSignup findByShopUsernameAndPassword(String sremail, String srpassword) {
		return ssrepo.findByshopUsernameAndPassword(sremail,srpassword);
	}
	*/

	public ShopSignup findBySremailAndSrpassword(String sremail, String srpassword) {
		// TODO Auto-generated method stub
		return ssrepo.findBySremailAndSrpassword(sremail,srpassword);
	}
	
	
	

}