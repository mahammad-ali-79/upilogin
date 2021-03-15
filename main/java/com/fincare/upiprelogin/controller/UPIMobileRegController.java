package com.fincare.upiprelogin.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.fincare.upiprelogin.model.AddBank;
import com.fincare.upiprelogin.model.UPIMobileReg;
import com.fincare.upiprelogin.service.AddBankService;
import com.fincare.upiprelogin.service.UPIMobileRegService;

public class UPIMobileRegController {
	
	@Autowired
	private UPIMobileRegService upiMobileRegService;
	
	@PostMapping("/UPIMobileReg")
	public String getUPIMobileReg( @Valid @RequestBody UPIMobileReg upiMobileReg){
		
		String response=upiMobileRegService.getUPIMobileReg(upiMobileReg);
		
		return response;
		 
	}

}
