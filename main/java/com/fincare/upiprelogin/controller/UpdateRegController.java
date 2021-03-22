package com.fincare.upiprelogin.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fincare.upiprelogin.model.Response;
import com.fincare.upiprelogin.model.UpdateReg;
import com.fincare.upiprelogin.service.ResponseService;
import com.fincare.upiprelogin.service.UpdateRegService;


@RestController
@RequestMapping("/upiprelogin")
public class UpdateRegController {
	
	@Autowired 
	private UpdateRegService updateRegService;
	@Autowired
	private ResponseService responseService;
	@PostMapping("/UpdateReg")
	public Response getupdateReg( @Valid @RequestBody UpdateReg updateReg){
		 Logger sdIp = LoggerFactory.getLogger("UPI SD Address");
		 sdIp.info("Source and Destination IP Address",responseService.getIpAddress());
		Response response=updateRegService.getUpdateReg(updateReg);
		
		return response;
		
	}

}
