package com.fincare.upiprelogin.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.fincare.upiprelogin.model.DeactivateVPA;
import com.fincare.upiprelogin.model.GetAcProv;
import com.fincare.upiprelogin.service.DeActivateVPAService;
import com.fincare.upiprelogin.service.GetAcProvService;

public class GetAcProvController {
	
	

	@Autowired
	private GetAcProvService getAcProvService;
	
	@PostMapping("/GetAcProv")
	public String getGetAcProv( @Valid @RequestBody GetAcProv getAcProv){
		
		String response=getAcProvService.getAcProv(getAcProv);
		
		return response;
		 
	}

}
