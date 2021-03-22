package com.fincare.upiprelogin.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.fincare.upiprelogin.model.MandateCollect;
import com.fincare.upiprelogin.model.RejectAuthMandate;
import com.fincare.upiprelogin.model.Response;
import com.fincare.upiprelogin.service.MandateCollectService;
import com.fincare.upiprelogin.service.RejectAuthMandateService;
import com.fincare.upiprelogin.service.ResponseService;

public class MandateCollectController {
	
	@Autowired
	private MandateCollectService mandateCollectService;
	@Autowired
	private ResponseService responseService;
	@PostMapping("/MandateCollect")
	public Response getMandateCollect( @Valid @RequestBody MandateCollect mandateCollect){
		 Logger sdIp = LoggerFactory.getLogger("UPI SD Address");
		 sdIp.info("Source and Destination IP Address",responseService.getIpAddress());
		Response response=mandateCollectService.getMandateCollect(mandateCollect);
		
		return response;
	}

}
