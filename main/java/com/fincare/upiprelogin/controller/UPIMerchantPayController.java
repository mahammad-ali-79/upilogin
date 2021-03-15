package com.fincare.upiprelogin.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.fincare.upiprelogin.model.UPIMerchantPay;
import com.fincare.upiprelogin.model.UPIPay;
import com.fincare.upiprelogin.service.UPIMerchantPayService;
import com.fincare.upiprelogin.service.UPIPayService;

public class UPIMerchantPayController {

	
	@Autowired
	private UPIMerchantPayService upiMerchantPayService;
	
	@PostMapping("/UPIMerchantPay")
	public String getUpiMerchantPay( @Valid @RequestBody UPIMerchantPay upiMerchantPay){
		
		String response=upiMerchantPayService.getUPIMerchantPay(upiMerchantPay);
		
		return response;
		 
	}
}
