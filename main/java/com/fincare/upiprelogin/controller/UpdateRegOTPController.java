package com.fincare.upiprelogin.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.fincare.upiprelogin.model.UpdateRegOTP;
import com.fincare.upiprelogin.service.UpdateRegOTPService;

@RestController
@RequestMapping("/upiprelogin")
public class UpdateRegOTPController {
	
	@Autowired
	private UpdateRegOTPService updateRegOTPService;
	
	@PostMapping("/UpdateRegOTP")
	public String getupdateRegOTP( @Valid @RequestBody UpdateRegOTP updateRegOTP){
		
		String response=updateRegOTPService.getUpdateRegOTP(updateRegOTP);
		
		return response;
		
	}
	

}
