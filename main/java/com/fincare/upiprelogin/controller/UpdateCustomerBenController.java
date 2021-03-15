package com.fincare.upiprelogin.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.fincare.upiprelogin.model.DeRegister;
import com.fincare.upiprelogin.model.UpdateCustomerBen;
import com.fincare.upiprelogin.service.DeRegisterService;
import com.fincare.upiprelogin.service.UpdateCustomerBenService;

public class UpdateCustomerBenController {
	
	
	@Autowired
	private UpdateCustomerBenService updateCustomerBenService;
	
	@PostMapping("/UpdateCustomerBen")
	public String getUpdateCustomerBen( @Valid @RequestBody UpdateCustomerBen updateCustomerBen){
		
		String response=updateCustomerBenService.getUpdatecustomerBen(updateCustomerBen);
		
		return response;
		 
	}

}
