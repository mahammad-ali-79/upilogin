package com.fincare.upiprelogin.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.fincare.upiprelogin.model.ChangePrimaryAc;
import com.fincare.upiprelogin.model.ViewDisputes;
import com.fincare.upiprelogin.service.ChangePrimAcService;
import com.fincare.upiprelogin.service.ViewDisputeService;

public class ChangePrimaryAcController {
	
	
	@Autowired
	private ChangePrimAcService changePrimAcService;
	
	@PostMapping("/ChangePrimaryAc")
	public String getChangePrimaryAc( @Valid @RequestBody ChangePrimaryAc changePrimaryAc){
		
		String response=changePrimAcService.getPrimaryAcc(changePrimaryAc);
		
		return response;
		 
	}


}
