package com.fincare.upiprelogin.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.fincare.upiprelogin.model.DeactivateBank;
import com.fincare.upiprelogin.model.LogADispute;
import com.fincare.upiprelogin.service.DeactivateBankService;
import com.fincare.upiprelogin.service.LogADisputeService;

public class DeActivateBankController {
	
	
	@Autowired
	private DeactivateBankService deactivateBankService;
	
	@PostMapping("/DeactivateBank")
	public String getDeactivateBank( @Valid @RequestBody DeactivateBank deActivateBank){
		
		String response=deactivateBankService.getDeactivateBank(deActivateBank);
		
		return response;
	}

}
