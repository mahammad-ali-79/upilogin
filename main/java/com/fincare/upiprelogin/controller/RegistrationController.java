package com.fincare.upiprelogin.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fincare.upiprelogin.model.Registration;

import com.fincare.upiprelogin.service.RegistrationService;

@RestController
@RequestMapping("/upiprelogin")
public class RegistrationController {
	
	@Autowired
	private RegistrationService registrationService;
	
	@PostMapping("/Registration")
	public String getRegistration( @Valid @RequestBody Registration registration){
		
		String response=registrationService.getRegistration(registration);
		
		return response;
		
	}

}
