package com.fincare.upiprelogin.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.fincare.upiprelogin.model.AddBank;
import com.fincare.upiprelogin.model.UPIGetAccounts;
import com.fincare.upiprelogin.service.AddBankService;
import com.fincare.upiprelogin.service.UPIGetAccountsService;

public class AddBankController {
	
	@Autowired
	private AddBankService addBankService;
	
	@PostMapping("/AddBank")
	public String getAddbank( @Valid @RequestBody AddBank addBank){
		
		String response=addBankService.getAddBank(addBank);
		
		return response;
		 
	}

}
