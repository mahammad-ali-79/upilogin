package com.fincare.upiprelogin.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.fincare.upiprelogin.model.DeRegister;
import com.fincare.upiprelogin.model.Response;
import com.fincare.upiprelogin.model.UPIRejectCollect;
import com.fincare.upiprelogin.service.DeRegisterService;
import com.fincare.upiprelogin.service.ResponseService;
import com.fincare.upiprelogin.service.UPIRejectCollectService;

public class DeRegisterController {
	
	@Autowired
	private DeRegisterService deRegisterService;
	@Autowired
	private ResponseService responseService;
	@PostMapping("/DeRegister")
	public Response getDeRegister( @Valid @RequestBody DeRegister deRegister){
		 Logger sdIp = LoggerFactory.getLogger("UPI SD Address");
		 sdIp.info("Source and Destination IP Address",responseService.getIpAddress());
		Response response=deRegisterService.getDeregister(deRegister);
		
		return response;
		 
	}

}
