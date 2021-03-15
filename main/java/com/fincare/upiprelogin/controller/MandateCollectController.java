package com.fincare.upiprelogin.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.fincare.upiprelogin.model.MandateCollect;
import com.fincare.upiprelogin.model.RejectAuthMandate;
import com.fincare.upiprelogin.service.MandateCollectService;
import com.fincare.upiprelogin.service.RejectAuthMandateService;

public class MandateCollectController {
	
	@Autowired
	private MandateCollectService mandateCollectService;
	
	@PostMapping("/MandateCollect")
	public String getMandateCollect( @Valid @RequestBody MandateCollect mandateCollect){
		
		String response=mandateCollectService.getMandateCollect(mandateCollect);
		
		return response;
	}

}
