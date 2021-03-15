package com.fincare.upiprelogin.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.fincare.upiprelogin.model.AuthMandate;
import com.fincare.upiprelogin.model.RevokeMandate;
import com.fincare.upiprelogin.service.AuthMandateService;
import com.fincare.upiprelogin.service.RevokeMandateService;

public class AuthMandateController {
	
	@Autowired
	private AuthMandateService authMandateService;
	
	@PostMapping("/AuthMandate")
	public String getAuthMandate( @Valid @RequestBody AuthMandate authMandate){
		
		String response=authMandateService.getAuthMandate(authMandate);
		
		return response;
	}


}
