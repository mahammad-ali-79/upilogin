package com.fincare.upiprelogin.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.fincare.upiprelogin.model.AuthMandate;
import com.fincare.upiprelogin.model.RejectAuthMandate;
import com.fincare.upiprelogin.model.Response;
import com.fincare.upiprelogin.service.AuthMandateService;
import com.fincare.upiprelogin.service.RejectAuthMandateService;
import com.fincare.upiprelogin.service.ResponseService;

public class RejectAuthMandateController {
	
	@Autowired
	private RejectAuthMandateService rejectauthMandateService;
	@Autowired
	private ResponseService responseService;
	@PostMapping("/RejectAuthMandate")
	public Response getRejectAuthMandate( @Valid @RequestBody RejectAuthMandate rejectauthMandate){
		 Logger sdIp = LoggerFactory.getLogger("UPI SD Address");
		 sdIp.info("Source and Destination IP Address",responseService.getIpAddress());
		Response response=rejectauthMandateService.getRejectAuthMandate(rejectauthMandate);
		
		return response;
	}

}
