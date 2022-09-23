package com.saloon.service;

import java.util.List;
import java.util.UUID;

import com.saloon.entity.Booking;
import com.saloon.entity.Register;
import com.saloon.repository.RegisterRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterService {
	private RegisterRepository regrepo;

	@Autowired
	public RegisterService(RegisterRepository regrepo) {
		this.regrepo = regrepo;
	}
	public Register addRegister(Register register) {
		return regrepo.save(register);
		
	}
	public List<Register> findAllRegisters(){ 
		return regrepo.findAll();
	}
	public Register updateRegister() { 
		return regrepo.save(updateRegister());
	}

	
	

}
