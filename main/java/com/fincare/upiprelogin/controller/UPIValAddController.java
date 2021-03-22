package com.fincare.upiprelogin.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.fincare.upiprelogin.model.GetTxnHistory;
import com.fincare.upiprelogin.model.Response;
import com.fincare.upiprelogin.model.UPIValAdd;
import com.fincare.upiprelogin.service.GetTxnHistoryTabService;
import com.fincare.upiprelogin.service.ResponseService;
import com.fincare.upiprelogin.service.UPIValAddService;

public class UPIValAddController {

	

	@Autowired
	private UPIValAddService upiValAddAddService;
	@Autowired
	private ResponseService responseService;
	@PostMapping("/UpiValAdd")
	public Response getUPIValAdd( @Valid @RequestBody UPIValAdd upiValAdd){
		 Logger sdIp = LoggerFactory.getLogger("UPI SD Address");
		 sdIp.info("Source and Destination IP Address",responseService.getIpAddress());
		Response response=upiValAddAddService.getUpiValAdd(upiValAdd);
		
		return response;
		 
	}

}
