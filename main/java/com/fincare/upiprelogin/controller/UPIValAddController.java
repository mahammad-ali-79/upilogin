package com.fincare.upiprelogin.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.fincare.upiprelogin.model.GetTxnHistory;
import com.fincare.upiprelogin.model.UPIValAdd;
import com.fincare.upiprelogin.service.GetTxnHistoryTabService;
import com.fincare.upiprelogin.service.UPIValAddService;

public class UPIValAddController {

	

	@Autowired
	private UPIValAddService upiValAddAddService;
	
	@PostMapping("/UpiValAdd")
	public String getUPIValAdd( @Valid @RequestBody UPIValAdd upiValAdd){
		
		String response=upiValAddAddService.getUpiValAdd(upiValAdd);
		
		return response;
		 
	}

}
