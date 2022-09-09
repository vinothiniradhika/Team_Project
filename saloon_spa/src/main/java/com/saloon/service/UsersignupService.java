package com.saloon.service;

import java.util.UUID;

import com.saloon.entity.UserSignup;
import com.saloon.repository.UserSignupRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersignupService {
	private UserSignupRepository usrepo;
	
	@Autowired
	public UsersignupService(UserSignupRepository usrepo) {
		this.usrepo=usrepo;
	}
	
	public UserSignup addUserSignup(UserSignup us) {
		return  usrepo.save(us);
		
	}
	
	

}
