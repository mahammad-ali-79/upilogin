package com.fincare.upiprelogin.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.fincare.upiprelogin.model.DeleteCustomerBen;
import com.fincare.upiprelogin.model.UpdateCustomerBen;
import com.fincare.upiprelogin.service.DeleteCustomerBenService;
import com.fincare.upiprelogin.service.UpdateCustomerBenService;

public class DeleteCustomerBenController {
	
	
	@Autowired
	private DeleteCustomerBenService deleteCustomerBenService;
	
	@PostMapping("/DeleteCustomerBen")
	public String getDeleteCustomerBen( @Valid @RequestBody DeleteCustomerBen deleteCustomerBen){
		
		String response=deleteCustomerBenService.getDeleteCustomerBen(deleteCustomerBen);
		
		return response;
		 
	}

}
