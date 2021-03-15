package com.fincare.upiprelogin.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.fincare.upiprelogin.model.UPIToken;

import com.fincare.upiprelogin.service.UPITokenService;

@RestController
@RequestMapping("/upiprelogin")
public class UPITokenController {

	
	@Autowired
	private UPITokenService upiTokenService;
	
	@PostMapping("/UPIToken")
	public String getUPIToken( @Valid @RequestBody UPIToken upiToken){
		
		String response=upiTokenService.getUpiToken(upiToken);
		
		return response;
		
	}
}
