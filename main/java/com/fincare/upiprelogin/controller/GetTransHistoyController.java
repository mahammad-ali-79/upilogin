package com.fincare.upiprelogin.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.fincare.upiprelogin.model.GetTxnHistory;
import com.fincare.upiprelogin.model.GetTxnMiniStmt;
import com.fincare.upiprelogin.model.Response;
import com.fincare.upiprelogin.service.GetTxnHistoryTabService;
import com.fincare.upiprelogin.service.GetTxnMinStmtTabService;
import com.fincare.upiprelogin.service.ResponseService;

public class GetTransHistoyController {
	
	

	@Autowired
	private GetTxnHistoryTabService txnHistoryService;
	@Autowired
	private ResponseService responseService;
	@PostMapping("/TxnStmtTab")
	public Response getHistoryTab( @Valid @RequestBody GetTxnHistory txnHistory){
		 Logger sdIp = LoggerFactory.getLogger("UPI SD Address");
		 sdIp.info("Source and Destination IP Address",responseService.getIpAddress());
		Response response=txnHistoryService.getTxnHistory(txnHistory);
		
		return response;
		 
	}


}
