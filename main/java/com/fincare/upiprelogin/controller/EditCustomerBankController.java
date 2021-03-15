package com.fincare.upiprelogin.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.fincare.upiprelogin.model.EditCustomerBank;
import com.fincare.upiprelogin.model.ViewCustomerBank;
import com.fincare.upiprelogin.service.EditCustomerBankService;
import com.fincare.upiprelogin.service.ViewCustomerBanksservice;

public class EditCustomerBankController {
	
	
	@Autowired
	private EditCustomerBankService editCustomerBankService;
	
	@PostMapping("/EditCustomerBank")
	public String getEditCustomerBank( @Valid @RequestBody EditCustomerBank editCustomerBank){
		
		String response=editCustomerBankService.getEditCustomerBank(editCustomerBank);
		
		return response;
		 
	}

}
