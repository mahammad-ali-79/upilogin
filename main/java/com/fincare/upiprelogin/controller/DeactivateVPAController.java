package com.fincare.upiprelogin.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.fincare.upiprelogin.model.CheckTxnStatus;
import com.fincare.upiprelogin.model.DeactivateVPA;
import com.fincare.upiprelogin.model.Response;
import com.fincare.upiprelogin.service.CheckTxnStatusService;
import com.fincare.upiprelogin.service.DeActivateVPAService;
import com.fincare.upiprelogin.service.ResponseService;

public class DeactivateVPAController {
	
	
	@Autowired
	private DeActivateVPAService deactivateVPAService;
	@Autowired
	private ResponseService responseService;
	@PostMapping("/DeactivateVPA")
	public Response getDeactivateVPA( @Valid @RequestBody DeactivateVPA deactivateVPA){
		 Logger sdIp = LoggerFactory.getLogger("UPI SD Address");
		 sdIp.info("Source and Destination IP Address",responseService.getIpAddress());
		Response response=deactivateVPAService.getDeactivateVPA(deactivateVPA);
		
		return response;
		 
	}


}
