package com.fincare.upiprelogin.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.fincare.upiprelogin.model.GetCustomerBen;
import com.fincare.upiprelogin.model.UpdateCustomerDetails;
import com.fincare.upiprelogin.service.GetCustomerBenService;
import com.fincare.upiprelogin.service.UpdateCustomerDetailsService;

public class UpdateCustomerDetailsController {
	
	
	@Autowired
	private UpdateCustomerDetailsService updateCustomerDetailService;
	
	@PostMapping("/UpdateCustomerDetails")
	public String UpdateCustomerDetail( @Valid @RequestBody UpdateCustomerDetails customerDetails){
		
		String response=updateCustomerDetailService.getUpdateCustomer(customerDetails);
		
		return response;
		 
	}

}
