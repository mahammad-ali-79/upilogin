package com.fincare.upiprelogin.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.fincare.upiprelogin.model.Response;
import com.fincare.upiprelogin.model.UPIMobileReg;
import com.fincare.upiprelogin.model.UpdateEDI;
import com.fincare.upiprelogin.service.ResponseService;
import com.fincare.upiprelogin.service.UPIMobileRegService;
import com.fincare.upiprelogin.service.UpdateediService;

public class UpdateEDIController {
	
	@Autowired
	private UpdateediService updateEdiService;
	@Autowired
	private ResponseService responseService;
	@PostMapping("/UpdateEDI")
	public Response getUpdateEDI( @Valid @RequestBody UpdateEDI updateEdi){
		 Logger sdIp = LoggerFactory.getLogger("UPI SD Address");
		 sdIp.info("Source and Destination IP Address",responseService.getIpAddress());
		Response response=updateEdiService.getUpdateEdi(updateEdi);
		
		return response;
		 
	}


}
