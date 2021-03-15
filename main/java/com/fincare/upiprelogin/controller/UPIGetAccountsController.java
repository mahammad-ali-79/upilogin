package com.fincare.upiprelogin.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fincare.upiprelogin.model.UPIGetAccounts;
import com.fincare.upiprelogin.model.UPIToken;
import com.fincare.upiprelogin.service.UPIGetAccountsService;
import com.fincare.upiprelogin.service.UPITokenService;

@RestController
@RequestMapping("/upiprelogin")
public class UPIGetAccountsController {
	
	@Autowired
	private UPIGetAccountsService upiGetAccountsService;
	
	@PostMapping("/UPIGetAccounts")
	public String getUPIGetAccounts( @Valid @RequestBody UPIGetAccounts upiGetAccounts){
		
		String response=upiGetAccountsService.getUPIGetAccounts(upiGetAccounts);
		
		return response;
		 
	}

}
