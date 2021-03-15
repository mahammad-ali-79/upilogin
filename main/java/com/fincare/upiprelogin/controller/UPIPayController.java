package com.fincare.upiprelogin.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.fincare.upiprelogin.model.PendingCollect;
import com.fincare.upiprelogin.model.UPIPay;
import com.fincare.upiprelogin.service.PendingCollectService;
import com.fincare.upiprelogin.service.UPIPayService;

public class UPIPayController {

	
	@Autowired
	private UPIPayService upiPayService;
	
	@PostMapping("/UPIPay")
	public String getUpiPay( @Valid @RequestBody UPIPay upiPay){
		
		String response=upiPayService.getUPIPay(upiPay);
		
		return response;
		 
	}
}
