package com.fincare.upiprelogin.controller;


import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.fincare.upiprelogin.model.AddBank;
import com.fincare.upiprelogin.model.Response;

import com.fincare.upiprelogin.service.AddBankService;
import com.fincare.upiprelogin.service.ResponseService;


public class AddBankController {
	
	@Autowired
	private AddBankService addBankService;
	@Autowired
	private ResponseService responseService;
	@PostMapping("/AddBank")
	public Response getAddbank( @Valid @RequestBody AddBank addBank){

		 Logger sdIp = LoggerFactory.getLogger("UPI SD Address");
		 sdIp.info("Source and Destination IP Address",responseService.getIpAddress());
		Response response=addBankService.getAddBank(addBank);
		
		return response;
		 
	}
 
}
