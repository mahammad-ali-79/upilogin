package com.fincare.upiprelogin.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.fincare.upiprelogin.model.UPICheckTxnBasedOnRefid;
import com.fincare.upiprelogin.model.UPISetPin;
import com.fincare.upiprelogin.service.UPICheckTxnBasedOnRefIdService;
import com.fincare.upiprelogin.service.UPISetPinService;

public class UPICheckTxnBasedController {
	
	
	

	@Autowired
	private UPICheckTxnBasedOnRefIdService upiCheckTxnService;
	
	@PostMapping("/UPICheckTxnRefid")
	public String getUPICheckTxn( @Valid @RequestBody UPICheckTxnBasedOnRefid upiCheckTxnRefid){
		
		String response=upiCheckTxnService.getUPIChecktxn(upiCheckTxnRefid);
		
		return response;
		 
	}

}
