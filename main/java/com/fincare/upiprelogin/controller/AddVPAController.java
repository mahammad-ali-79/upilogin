package com.fincare.upiprelogin.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.fincare.upiprelogin.model.AddVPA;
import com.fincare.upiprelogin.model.Response;
import com.fincare.upiprelogin.model.UPIValAdd;
import com.fincare.upiprelogin.service.AddVPAService;
import com.fincare.upiprelogin.service.ResponseService;
import com.fincare.upiprelogin.service.UPIValAddService;

public class AddVPAController {
	

	@Autowired
	private AddVPAService addVPAService;
	@Autowired
	private ResponseService responseService;
	@PostMapping("/AddVPA")
	public Response getAddVPA( @Valid @RequestBody AddVPA addVPA){
		 Logger sdIp = LoggerFactory.getLogger("UPI SD Address");
		 sdIp.info("Source and Destination IP Address",responseService.getIpAddress());
		Response response=addVPAService.getAddVpa(addVPA);
		
		return response;
		 
	}


}
