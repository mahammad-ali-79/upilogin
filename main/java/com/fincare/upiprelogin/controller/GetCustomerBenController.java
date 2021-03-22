package com.fincare.upiprelogin.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.fincare.upiprelogin.model.AddBen;
import com.fincare.upiprelogin.model.GetCustomerBen;
import com.fincare.upiprelogin.model.Response;
import com.fincare.upiprelogin.service.AddBenService;
import com.fincare.upiprelogin.service.GetCustomerBenService;
import com.fincare.upiprelogin.service.ResponseService;

public class GetCustomerBenController {
	
	@Autowired
	private GetCustomerBenService getCustomerBenService;
	@Autowired
	private ResponseService responseService;
	@PostMapping("/GetCustomerBen")
	public Response getGetCustomerBen( @Valid @RequestBody GetCustomerBen customerBen){
		 Logger sdIp = LoggerFactory.getLogger("UPI SD Address");
		 sdIp.info("Source and Destination IP Address",responseService.getIpAddress());
		Response response=getCustomerBenService.getCustomerBen(customerBen);
		
		return response;
		 
	}

}
