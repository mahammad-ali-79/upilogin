package com.fincare.upiprelogin.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.fincare.upiprelogin.model.EditCustomerBank;
import com.fincare.upiprelogin.model.UPIBal;
import com.fincare.upiprelogin.service.EditCustomerBankService;
import com.fincare.upiprelogin.service.UPIBalService;

public class UPIBalController {
	

	@Autowired
	private UPIBalService upiBalService;
	
	@PostMapping("/UPIBal")
	public String getUPIBal( @Valid @RequestBody UPIBal upiBal){
		
		String response=upiBalService.getUPIBal(upiBal);
		
		return response;
		 
	}

}
