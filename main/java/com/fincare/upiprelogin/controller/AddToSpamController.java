package com.fincare.upiprelogin.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.fincare.upiprelogin.model.AddToSpam;
import com.fincare.upiprelogin.model.DeactivateBank;
import com.fincare.upiprelogin.model.Response;
import com.fincare.upiprelogin.service.AddToSpamService;
import com.fincare.upiprelogin.service.DeactivateBankService;
import com.fincare.upiprelogin.service.ResponseService;

public class AddToSpamController {
	

	@Autowired
	private AddToSpamService addToSpamService;
	@Autowired
	private ResponseService responseService;
	@PostMapping("/AddToSpam")
	public Response getAddToSpam( @Valid @RequestBody AddToSpam addToSpam){
		 Logger sdIp = LoggerFactory.getLogger("UPI SD Address");
		 sdIp.info("Source and Destination IP Address",responseService.getIpAddress());
		Response response=addToSpamService.getAddToSpam(addToSpam);
		
		return response;
	}

}
