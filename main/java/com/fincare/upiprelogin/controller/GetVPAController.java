package com.fincare.upiprelogin.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.fincare.upiprelogin.model.GetVPA;
import com.fincare.upiprelogin.model.UPIRequestOTP;
import com.fincare.upiprelogin.service.GetVPAService;
import com.fincare.upiprelogin.service.UPIRequestOtpService;

public class GetVPAController {
	
	@Autowired
	private GetVPAService getVPAService;
	
	@PostMapping("/getVPA")
	public String getVPA( @Valid @RequestBody GetVPA getVPA){
		
		String response=getVPAService.getVPA(getVPA);
		
		return response;
		 
	}

}
