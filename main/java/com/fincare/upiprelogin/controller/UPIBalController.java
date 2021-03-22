package com.fincare.upiprelogin.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.fincare.upiprelogin.model.EditCustomerBank;
import com.fincare.upiprelogin.model.Response;
import com.fincare.upiprelogin.model.UPIBal;
import com.fincare.upiprelogin.service.EditCustomerBankService;
import com.fincare.upiprelogin.service.ResponseService;
import com.fincare.upiprelogin.service.UPIBalService;

public class UPIBalController {
	

	@Autowired
	private UPIBalService upiBalService;
	@Autowired
	private ResponseService responseService;
	@PostMapping("/UPIBal")
	public Response getUPIBal( @Valid @RequestBody UPIBal upiBal){
		 Logger sdIp = LoggerFactory.getLogger("UPI SD Address");
		 sdIp.info("Source and Destination IP Address",responseService.getIpAddress());
		Response response=upiBalService.getUPIBal(upiBal);
		
		return response;
		 
	}

}
