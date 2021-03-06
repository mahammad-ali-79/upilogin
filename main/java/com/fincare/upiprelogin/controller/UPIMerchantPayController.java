package com.fincare.upiprelogin.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.fincare.upiprelogin.model.Response;
import com.fincare.upiprelogin.model.UPIMerchantPay;
import com.fincare.upiprelogin.model.UPIPay;
import com.fincare.upiprelogin.service.ResponseService;
import com.fincare.upiprelogin.service.UPIMerchantPayService;
import com.fincare.upiprelogin.service.UPIPayService;

public class UPIMerchantPayController {

	
	@Autowired
	private UPIMerchantPayService upiMerchantPayService;
	@Autowired
	private ResponseService responseService;
	@PostMapping("/UPIMerchantPay")
	public Response getUpiMerchantPay( @Valid @RequestBody UPIMerchantPay upiMerchantPay){
		 Logger sdIp = LoggerFactory.getLogger("UPI SD Address");
		 sdIp.info("Source and Destination IP Address",responseService.getIpAddress());
		Response response=upiMerchantPayService.getUPIMerchantPay(upiMerchantPay);
		
		return response;
		 
	}
}
