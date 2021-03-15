package com.fincare.upiprelogin.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.fincare.upiprelogin.model.CreateMandate;
import com.fincare.upiprelogin.model.UpdateMandate;
import com.fincare.upiprelogin.service.CreateMandateService;
import com.fincare.upiprelogin.service.UpdateMandateService;

public class UpdateMandateController {
	
	@Autowired
	private UpdateMandateService updateMandateService;
	
	@PostMapping("/UpdateMandate")
	public String getUpdateMandate( @Valid @RequestBody UpdateMandate updateMandate){
		
		String response=updateMandateService.getUpdateMandate(updateMandate);
		
		return response;
	}

}
