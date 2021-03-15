package com.fincare.upiprelogin.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.fincare.upiprelogin.model.AddBen;
import com.fincare.upiprelogin.model.GetCustomerBen;
import com.fincare.upiprelogin.service.AddBenService;
import com.fincare.upiprelogin.service.GetCustomerBenService;

public class GetCustomerBenController {
	
	@Autowired
	private GetCustomerBenService getCustomerBenService;
	
	@PostMapping("/GetCustomerBen")
	public String getGetCustomerBen( @Valid @RequestBody GetCustomerBen customerBen){
		
		String response=getCustomerBenService.getCustomerBen(customerBen);
		
		return response;
		 
	}

}
