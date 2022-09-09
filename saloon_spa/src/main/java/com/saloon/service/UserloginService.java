package com.saloon.service;

import java.util.UUID;

import com.saloon.entity.Booking;
import com.saloon.entity.UserLogin;
import com.saloon.exception.BookingNotFoundException;
import com.saloon.exception.UserLoginNotFoundException;
import com.saloon.repository.UserLoginRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserloginService {
	private UserLoginRepository ulrepo;
	@Autowired
	public  UserloginService(UserLoginRepository ulrepo) {
		this.ulrepo=ulrepo;

	}
	
	public UserLogin addUserLogin(UserLogin ul) {
		return ulrepo.save(ul);
	}
	public UserLogin updateUserLogin(UserLogin ul) { 
		return ulrepo.save(ul);
	}
	
	public UserLogin findUserLoginByUemail(String uemail) throws Throwable { 
		return (UserLogin) ulrepo.findUserLoginByUemail(uemail).orElseThrow(()-> new UserLoginNotFoundException("Incorrect username "));
	}
}
