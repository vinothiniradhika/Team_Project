package com.saloon.controller;



import com.saloon.entity.UserSignup;
import com.saloon.request.UserRequest;
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
	@PostMapping("/userlogin")
    public UserSignup userlogin(@RequestBody UserRequest a) throws Exception {
                UserSignup user=a.toUser();
         String usemail = user.getUsemail();
         String uspassword = user.getUspassword();
         UserSignup userObj=null;
         if(usemail!=null && uspassword!=null)
         {
             userObj=usservice.findByUsemailAndUspassword(usemail, uspassword);
         }
         if(userObj == null) {
             throw new Exception("Wrong credentials");
         }
         return userObj;
     }
}
