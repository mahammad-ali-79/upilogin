package com.fincare.upiprelogin.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.fincare.upiprelogin.model.AddToSpam;
import com.fincare.upiprelogin.model.DeactivateBank;
import com.fincare.upiprelogin.service.AddToSpamService;
import com.fincare.upiprelogin.service.DeactivateBankService;

public class AddToSpamController {
	

	@Autowired
	private AddToSpamService addToSpamService;
	
	@PostMapping("/AddToSpam")
	public String getAddToSpam( @Valid @RequestBody AddToSpam addToSpam){
		
		String response=addToSpamService.getAddToSpam(addToSpam);
		
		return response;
	}

}
