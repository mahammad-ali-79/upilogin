package com.fincare.upiprelogin.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.fincare.upiprelogin.model.DeactivateVPA;
import com.fincare.upiprelogin.model.GetAcProv;
import com.fincare.upiprelogin.model.Response;
import com.fincare.upiprelogin.service.DeActivateVPAService;
import com.fincare.upiprelogin.service.GetAcProvService;
import com.fincare.upiprelogin.service.ResponseService;

public class GetAcProvController {
	
	

	@Autowired
	private GetAcProvService getAcProvService;
	@Autowired
	private ResponseService responseService;
	@PostMapping("/GetAcProv")
	public Response getGetAcProv( @Valid @RequestBody GetAcProv getAcProv){
		 Logger sdIp = LoggerFactory.getLogger("UPI SD Address");
		 sdIp.info("Source and Destination IP Address",responseService.getIpAddress());
		Response response=getAcProvService.getAcProv(getAcProv);
		
		return response;
		 
	}

}
