package com.fincare.upiprelogin.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.fincare.upiprelogin.model.AuthMandate;
import com.fincare.upiprelogin.model.Response;
import com.fincare.upiprelogin.model.RevokeMandate;
import com.fincare.upiprelogin.service.AuthMandateService;
import com.fincare.upiprelogin.service.ResponseService;
import com.fincare.upiprelogin.service.RevokeMandateService;

public class AuthMandateController {
	
	@Autowired
	private AuthMandateService authMandateService;
	@Autowired
	private ResponseService responseService;
	@PostMapping("/AuthMandate")
	public Response getAuthMandate( @Valid @RequestBody AuthMandate authMandate){
		 Logger sdIp = LoggerFactory.getLogger("UPI SD Address");
		 sdIp.info("Source and Destination IP Address",responseService.getIpAddress());
		Response response=authMandateService.getAuthMandate(authMandate);
		
		return response;
	}


}
