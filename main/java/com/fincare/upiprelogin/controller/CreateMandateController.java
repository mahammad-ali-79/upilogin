package com.fincare.upiprelogin.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.fincare.upiprelogin.model.CreateMandate;
import com.fincare.upiprelogin.model.GetBlockedVPAList;
import com.fincare.upiprelogin.service.CreateMandateService;
import com.fincare.upiprelogin.service.GetBlockedVPAListService;

public class CreateMandateController {
	
	@Autowired
	private CreateMandateService createMandateService;
	
	@PostMapping("/CreateMandate")
	public String getCreateMandate( @Valid @RequestBody CreateMandate createMandate){
		
		String response=createMandateService.getCreateMandate(createMandate);
		
		return response;
		
	}
}
