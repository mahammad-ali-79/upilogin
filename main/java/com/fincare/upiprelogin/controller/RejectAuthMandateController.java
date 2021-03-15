package com.fincare.upiprelogin.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.fincare.upiprelogin.model.AuthMandate;
import com.fincare.upiprelogin.model.RejectAuthMandate;
import com.fincare.upiprelogin.service.AuthMandateService;
import com.fincare.upiprelogin.service.RejectAuthMandateService;

public class RejectAuthMandateController {
	
	@Autowired
	private RejectAuthMandateService rejectauthMandateService;
	
	@PostMapping("/RejectAuthMandate")
	public String getRejectAuthMandate( @Valid @RequestBody RejectAuthMandate rejectauthMandate){
		
		String response=rejectauthMandateService.getRejectAuthMandate(rejectauthMandate);
		
		return response;
	}

}
