package com.saloon.controller;

import java.util.List;

import com.saloon.entity.Booking;
import com.saloon.entity.Register;
import com.saloon.service.RegisterService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegisterController {
	private RegisterService registerservice;

	public RegisterController(RegisterService registerservice) {
		super();
		this.registerservice = registerservice;
	}
	
	@GetMapping("/allregistrations")
	public ResponseEntity<List<Register>> getAllRegisters(){
		List<Register> regs=registerservice.findAllRegisters();
		return new ResponseEntity<>(regs,HttpStatus.OK);
		
	}
	@PostMapping("/addregistration")
	public ResponseEntity<Register> addRegister(@RequestBody Register register){
		Register newRegister=registerservice.addRegister(register);
		return new ResponseEntity<>(newRegister,HttpStatus.CREATED);
		
	}
	@PutMapping("/updateregistration")
	public ResponseEntity<Register> updateRegister(@RequestBody Register register){
		Register newRegister=registerservice.updateRegister();
		return new ResponseEntity<>(newRegister,HttpStatus.OK);
		
	}

}
