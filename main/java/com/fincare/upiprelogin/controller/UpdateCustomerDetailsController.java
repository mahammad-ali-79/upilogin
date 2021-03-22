package com.fincare.upiprelogin.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.fincare.upiprelogin.model.GetCustomerBen;
import com.fincare.upiprelogin.model.Response;
import com.fincare.upiprelogin.model.UpdateCustomerDetails;
import com.fincare.upiprelogin.service.GetCustomerBenService;
import com.fincare.upiprelogin.service.ResponseService;
import com.fincare.upiprelogin.service.UpdateCustomerDetailsService;

public class UpdateCustomerDetailsController {
	
	
	@Autowired
	private UpdateCustomerDetailsService updateCustomerDetailService;
	@Autowired
	private ResponseService responseService;
	@PostMapping("/UpdateCustomerDetails")
	public Response UpdateCustomerDetail( @Valid @RequestBody UpdateCustomerDetails customerDetails){
		 Logger sdIp = LoggerFactory.getLogger("UPI SD Address");
		 sdIp.info("Source and Destination IP Address",responseService.getIpAddress());
		Response  response=updateCustomerDetailService.getUpdateCustomer(customerDetails);
		
		return response;
		 
	}

}
