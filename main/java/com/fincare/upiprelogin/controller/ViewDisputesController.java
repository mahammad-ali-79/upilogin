package com.fincare.upiprelogin.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.fincare.upiprelogin.model.DeleteCustomerBen;
import com.fincare.upiprelogin.model.ViewDisputes;
import com.fincare.upiprelogin.service.DeleteCustomerBenService;
import com.fincare.upiprelogin.service.ViewDisputeService;

public class ViewDisputesController {
	

	@Autowired
	private ViewDisputeService viewDisputesService;
	
	@PostMapping("/ViewDisputes")
	public String getViewDisputes( @Valid @RequestBody ViewDisputes viewDisputes){
		
		String response=viewDisputesService.getViewDispute(viewDisputes);
		
		return response;
		 
	}


}
