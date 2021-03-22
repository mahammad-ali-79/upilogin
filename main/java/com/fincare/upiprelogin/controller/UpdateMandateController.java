package com.fincare.upiprelogin.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.fincare.upiprelogin.model.CreateMandate;
import com.fincare.upiprelogin.model.Response;
import com.fincare.upiprelogin.model.UpdateMandate;
import com.fincare.upiprelogin.service.CreateMandateService;
import com.fincare.upiprelogin.service.ResponseService;
import com.fincare.upiprelogin.service.UpdateMandateService;

public class UpdateMandateController {
	
	@Autowired
	private UpdateMandateService updateMandateService;
	@Autowired
	private ResponseService responseService;
	@PostMapping("/UpdateMandate")
	public Response getUpdateMandate( @Valid @RequestBody UpdateMandate updateMandate){
		 Logger sdIp = LoggerFactory.getLogger("UPI SD Address");
		 sdIp.info("Source and Destination IP Address",responseService.getIpAddress());
		Response response=updateMandateService.getUpdateMandate(updateMandate);
		
		return response;
	}

}
