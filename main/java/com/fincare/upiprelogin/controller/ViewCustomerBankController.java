package com.fincare.upiprelogin.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.fincare.upiprelogin.model.GetVPA;
import com.fincare.upiprelogin.model.ViewCustomerBank;
import com.fincare.upiprelogin.service.GetVPAService;
import com.fincare.upiprelogin.service.ViewCustomerBanksservice;

public class ViewCustomerBankController {
	

	@Autowired
	private ViewCustomerBanksservice viewCustomerBankService;
	
	@PostMapping("/ViewCustomerBank")
	public String getUPIMobileReg( @Valid @RequestBody ViewCustomerBank viewCustomerBank){
		
		String response=viewCustomerBankService.getViewCustomerBank(viewCustomerBank);
		
		return response;
		 
	}

}
