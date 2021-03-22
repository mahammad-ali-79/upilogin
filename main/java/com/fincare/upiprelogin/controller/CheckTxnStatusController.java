package com.fincare.upiprelogin.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.fincare.upiprelogin.model.CheckTxnStatus;
import com.fincare.upiprelogin.model.Response;
import com.fincare.upiprelogin.model.UPIMerchantPay;
import com.fincare.upiprelogin.service.CheckTxnStatusService;
import com.fincare.upiprelogin.service.ResponseService;
import com.fincare.upiprelogin.service.UPIMerchantPayService;

public class CheckTxnStatusController {
	
	@Autowired
	private CheckTxnStatusService checkTxnStatusService;
	@Autowired
	private ResponseService responseService;
	@PostMapping("/CheckTxnStatus")
	public Response getCheckTxnStatus( @Valid @RequestBody CheckTxnStatus checkTxnStatus){
		 Logger sdIp = LoggerFactory.getLogger("UPI SD Address");
		 sdIp.info("Source and Destination IP Address",responseService.getIpAddress());
		Response response=checkTxnStatusService.getTxnStatus(checkTxnStatus);
		
		return response;
		 
	}

}
