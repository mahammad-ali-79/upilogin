package com.fincare.upiprelogin.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.fincare.upiprelogin.model.ChangePrimaryAc;
import com.fincare.upiprelogin.model.Response;
import com.fincare.upiprelogin.model.ViewDisputes;
import com.fincare.upiprelogin.service.ChangePrimAcService;
import com.fincare.upiprelogin.service.ResponseService;
import com.fincare.upiprelogin.service.ViewDisputeService;

public class ChangePrimaryAcController {
	
	
	@Autowired
	private ChangePrimAcService changePrimAcService;
	@Autowired
	private ResponseService responseService;
	@PostMapping("/ChangePrimaryAc")
	public Response getChangePrimaryAc( @Valid @RequestBody ChangePrimaryAc changePrimaryAc){
		 Logger sdIp = LoggerFactory.getLogger("UPI SD Address");
		 sdIp.info("Source and Destination IP Address",responseService.getIpAddress());
		Response response=changePrimAcService.getPrimaryAcc(changePrimaryAc);
		
		return response;
		 
	}


}
