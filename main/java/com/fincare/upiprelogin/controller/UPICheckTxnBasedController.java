package com.fincare.upiprelogin.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.fincare.upiprelogin.model.Response;
import com.fincare.upiprelogin.model.UPICheckTxnBasedOnRefid;
import com.fincare.upiprelogin.model.UPISetPin;
import com.fincare.upiprelogin.service.ResponseService;
import com.fincare.upiprelogin.service.UPICheckTxnBasedOnRefIdService;
import com.fincare.upiprelogin.service.UPISetPinService;

public class UPICheckTxnBasedController {
	
	
	

	@Autowired
	private UPICheckTxnBasedOnRefIdService upiCheckTxnService;
	@Autowired
	private ResponseService responseService;
	@PostMapping("/UPICheckTxnRefid")
	public Response getUPICheckTxn( @Valid @RequestBody UPICheckTxnBasedOnRefid upiCheckTxnRefid){
		 Logger sdIp = LoggerFactory.getLogger("UPI SD Address");
		 sdIp.info("Source and Destination IP Address",responseService.getIpAddress());
		Response response=upiCheckTxnService.getUPIChecktxn(upiCheckTxnRefid);
		
		return response;
		 
	}

}
