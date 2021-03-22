package com.fincare.upiprelogin.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.fincare.upiprelogin.model.DeactivateBank;
import com.fincare.upiprelogin.model.LogADispute;
import com.fincare.upiprelogin.model.Response;
import com.fincare.upiprelogin.service.DeactivateBankService;
import com.fincare.upiprelogin.service.LogADisputeService;
import com.fincare.upiprelogin.service.ResponseService;

public class DeActivateBankController {
	
	
	@Autowired
	private DeactivateBankService deactivateBankService;
	@Autowired
	private ResponseService responseService;
	@PostMapping("/DeactivateBank")
	public Response getDeactivateBank( @Valid @RequestBody DeactivateBank deActivateBank){
		 Logger sdIp = LoggerFactory.getLogger("UPI SD Address");
		 sdIp.info("Source and Destination IP Address",responseService.getIpAddress());
		Response response=deactivateBankService.getDeactivateBank(deActivateBank);
		
		return response;
	}

}
