package com.fincare.upiprelogin.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.fincare.upiprelogin.model.ChangePrimaryAc;
import com.fincare.upiprelogin.model.UPISetPin;
import com.fincare.upiprelogin.service.ChangePrimAcService;
import com.fincare.upiprelogin.service.UPISetPinService;

public class UPISetPinController {
	

	@Autowired
	private UPISetPinService upiSetPinService;
	
	@PostMapping("/UPISetPin")
	public String getUPISetPin( @Valid @RequestBody UPISetPin upiSetPin){
		
		String response=upiSetPinService.getUPIPin(upiSetPin);
		
		return response;
		 
	}

}
