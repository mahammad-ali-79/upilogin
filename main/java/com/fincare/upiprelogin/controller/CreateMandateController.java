package com.fincare.upiprelogin.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.fincare.upiprelogin.model.CreateMandate;
import com.fincare.upiprelogin.model.GetBlockedVPAList;
import com.fincare.upiprelogin.model.Response;
import com.fincare.upiprelogin.service.CreateMandateService;
import com.fincare.upiprelogin.service.GetBlockedVPAListService;
import com.fincare.upiprelogin.service.ResponseService;

public class CreateMandateController {
	
	@Autowired
	private CreateMandateService createMandateService;
	@Autowired
	private ResponseService responseService;
	@PostMapping("/CreateMandate")
	public Response getCreateMandate( @Valid @RequestBody CreateMandate createMandate){
		 Logger sdIp = LoggerFactory.getLogger("UPI SD Address");
		 sdIp.info("Source and Destination IP Address",responseService.getIpAddress());
		Response response=createMandateService.getCreateMandate(createMandate);
		
		return response;
		
	}
}
