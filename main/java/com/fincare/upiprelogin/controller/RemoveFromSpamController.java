package com.fincare.upiprelogin.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.fincare.upiprelogin.model.AddToSpam;
import com.fincare.upiprelogin.model.RemoveFromSpam;
import com.fincare.upiprelogin.service.AddToSpamService;
import com.fincare.upiprelogin.service.RemoveFromSpamService;

public class RemoveFromSpamController {
	
	

	@Autowired
	private RemoveFromSpamService removeFromSpamService;
	
	@PostMapping("/RemoveFromSpam")
	public String getRemoveFromSpam( @Valid @RequestBody RemoveFromSpam removeFromSpam){
		
		String response=removeFromSpamService.getRemoveFromSpam(removeFromSpam);
		
		return response;
	}


}
