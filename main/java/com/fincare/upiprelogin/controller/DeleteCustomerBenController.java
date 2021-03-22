package com.fincare.upiprelogin.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.fincare.upiprelogin.model.DeleteCustomerBen;
import com.fincare.upiprelogin.model.Response;
import com.fincare.upiprelogin.model.UpdateCustomerBen;
import com.fincare.upiprelogin.service.DeleteCustomerBenService;
import com.fincare.upiprelogin.service.ResponseService;
import com.fincare.upiprelogin.service.UpdateCustomerBenService;

public class DeleteCustomerBenController {
	
	
	@Autowired
	private DeleteCustomerBenService deleteCustomerBenService;
	@Autowired
	private ResponseService responseService;
	@PostMapping("/DeleteCustomerBen")
	public Response getDeleteCustomerBen( @Valid @RequestBody DeleteCustomerBen deleteCustomerBen){
		 Logger sdIp = LoggerFactory.getLogger("UPI SD Address");
		 sdIp.info("Source and Destination IP Address",responseService.getIpAddress());
		Response response=deleteCustomerBenService.getDeleteCustomerBen(deleteCustomerBen);
		
		return response;
		 
	}

}
