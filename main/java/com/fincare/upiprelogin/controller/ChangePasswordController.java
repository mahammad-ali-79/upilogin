package com.fincare.upiprelogin.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.fincare.upiprelogin.model.ChangePassword;
import com.fincare.upiprelogin.model.UpdateCustomerDetails;
import com.fincare.upiprelogin.service.ChangePasswordService;
import com.fincare.upiprelogin.service.UpdateCustomerDetailsService;

public class ChangePasswordController {
	
	
	@Autowired
	private ChangePasswordService changePasswordService;
	
	@PostMapping("/ChangePassword")
	public String getChangePassword( @Valid @RequestBody ChangePassword changePassword){
		
		String response=changePasswordService.getChangePassword(changePassword);
		
		return response;
		 
	}

}
