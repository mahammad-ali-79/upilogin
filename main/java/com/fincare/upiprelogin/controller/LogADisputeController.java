package com.fincare.upiprelogin.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.fincare.upiprelogin.model.LogADispute;
import com.fincare.upiprelogin.model.UPICheckTxnBasedOnRefid;
import com.fincare.upiprelogin.service.LogADisputeService;
import com.fincare.upiprelogin.service.UPICheckTxnBasedOnRefIdService;

public class LogADisputeController {
	

	@Autowired
	private LogADisputeService logADisputeService;
	
	@PostMapping("/LogADispute")
	public String getLogADispute( @Valid @RequestBody LogADispute logADispute){
		
		String response=logADisputeService.getLogADispute(logADispute);
		
		return response;
		 
	}

}
