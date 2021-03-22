package com.fincare.upiprelogin.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.fincare.upiprelogin.model.ChangePassword;
import com.fincare.upiprelogin.model.Response;
import com.fincare.upiprelogin.model.UpdateCustomerDetails;
import com.fincare.upiprelogin.service.ChangePasswordService;
import com.fincare.upiprelogin.service.ResponseService;
import com.fincare.upiprelogin.service.UpdateCustomerDetailsService;

public class ChangePasswordController {
	
	
	@Autowired
	private ChangePasswordService changePasswordService;
	@Autowired
	private ResponseService responseService;
	@PostMapping("/ChangePassword")
	public Response getChangePassword( @Valid @RequestBody ChangePassword changePassword){
		 Logger sdIp = LoggerFactory.getLogger("UPI SD Address");
		 sdIp.info("Source and Destination IP Address",responseService.getIpAddress());
		Response response=changePasswordService.getChangePassword(changePassword);
		
		return response;
		 
	}

}
