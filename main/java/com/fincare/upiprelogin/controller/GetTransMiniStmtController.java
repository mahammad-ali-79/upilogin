package com.fincare.upiprelogin.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.fincare.upiprelogin.model.GetTxnMiniStmt;
import com.fincare.upiprelogin.model.Response;
import com.fincare.upiprelogin.model.UPIBal;
import com.fincare.upiprelogin.service.GetTxnMinStmtTabService;
import com.fincare.upiprelogin.service.ResponseService;
import com.fincare.upiprelogin.service.UPIBalService;

public class GetTransMiniStmtController {
	
	
	@Autowired
	private GetTxnMinStmtTabService txnministmtService;
	@Autowired
	private ResponseService responseService;
	@PostMapping("/TxnStmtTab")
	public Response getMiniStmt( @Valid @RequestBody GetTxnMiniStmt txnMiniStmt){
		 Logger sdIp = LoggerFactory.getLogger("UPI SD Address");
		 sdIp.info("Source and Destination IP Address",responseService.getIpAddress());
		Response response=txnministmtService.getTxnMinStmtTab(txnMiniStmt);
		
		return response;
		 
	}

}
