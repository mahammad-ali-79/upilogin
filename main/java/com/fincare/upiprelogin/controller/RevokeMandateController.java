package com.fincare.upiprelogin.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.fincare.upiprelogin.model.RevokeMandate;
import com.fincare.upiprelogin.model.UpdateMandate;
import com.fincare.upiprelogin.service.RevokeMandateService;
import com.fincare.upiprelogin.service.UpdateMandateService;

public class RevokeMandateController {
	
	@Autowired
	private RevokeMandateService revokeMandateService;
	
	@PostMapping("/RevokeMandate")
	public String getUpdateMandate( @Valid @RequestBody RevokeMandate revokeMandate){
		
		String response=revokeMandateService.getRevokeMandate(revokeMandate);
		
		return response;
	}

}
