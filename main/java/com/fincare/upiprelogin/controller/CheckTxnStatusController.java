package com.fincare.upiprelogin.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.fincare.upiprelogin.model.CheckTxnStatus;
import com.fincare.upiprelogin.model.UPIMerchantPay;
import com.fincare.upiprelogin.service.CheckTxnStatusService;
import com.fincare.upiprelogin.service.UPIMerchantPayService;

public class CheckTxnStatusController {
	
	@Autowired
	private CheckTxnStatusService checkTxnStatusService;
	
	@PostMapping("/CheckTxnStatus")
	public String getCheckTxnStatus( @Valid @RequestBody CheckTxnStatus checkTxnStatus){
		
		String response=checkTxnStatusService.getTxnStatus(checkTxnStatus);
		
		return response;
		 
	}

}
