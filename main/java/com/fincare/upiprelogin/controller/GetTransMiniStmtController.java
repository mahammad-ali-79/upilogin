package com.fincare.upiprelogin.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.fincare.upiprelogin.model.GetTxnMiniStmt;
import com.fincare.upiprelogin.model.UPIBal;
import com.fincare.upiprelogin.service.GetTxnMinStmtTabService;
import com.fincare.upiprelogin.service.UPIBalService;

public class GetTransMiniStmtController {
	
	
	@Autowired
	private GetTxnMinStmtTabService txnministmtService;
	
	@PostMapping("/TxnStmtTab")
	public String getMiniStmt( @Valid @RequestBody GetTxnMiniStmt txnMiniStmt){
		
		String response=txnministmtService.getTxnMinStmtTab(txnMiniStmt);
		
		return response;
		 
	}

}
