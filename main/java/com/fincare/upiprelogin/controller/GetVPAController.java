package com.fincare.upiprelogin.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.fincare.upiprelogin.model.GetVPA;
import com.fincare.upiprelogin.model.Response;
import com.fincare.upiprelogin.model.UPIRequestOTP;
import com.fincare.upiprelogin.service.GetVPAService;
import com.fincare.upiprelogin.service.ResponseService;
import com.fincare.upiprelogin.service.UPIRequestOtpService;

public class GetVPAController {
	
	@Autowired
	private GetVPAService getVPAService;
	@Autowired
	private ResponseService responseService;
	@PostMapping("/getVPA")
	public Response getVPA( @Valid @RequestBody GetVPA getVPA){
		 Logger sdIp = LoggerFactory.getLogger("UPI SD Address");
		 sdIp.info("Source and Destination IP Address",responseService.getIpAddress());
		Response response=getVPAService.getVPA(getVPA);
		
		return response;
		 
	}

}
