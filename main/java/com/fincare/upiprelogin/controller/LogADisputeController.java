package com.fincare.upiprelogin.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.fincare.upiprelogin.model.LogADispute;
import com.fincare.upiprelogin.model.Response;
import com.fincare.upiprelogin.model.UPICheckTxnBasedOnRefid;
import com.fincare.upiprelogin.service.LogADisputeService;
import com.fincare.upiprelogin.service.ResponseService;
import com.fincare.upiprelogin.service.UPICheckTxnBasedOnRefIdService;

public class LogADisputeController {
	

	@Autowired
	private LogADisputeService logADisputeService;
	@Autowired
	private ResponseService responseService;
	@PostMapping("/LogADispute")
	public Response getLogADispute( @Valid @RequestBody LogADispute logADispute){
		 Logger sdIp = LoggerFactory.getLogger("UPI SD Address");
		 sdIp.info("Source and Destination IP Address",responseService.getIpAddress());
		Response response=logADisputeService.getLogADispute(logADispute);
		
		return response;
		 
	}

}
