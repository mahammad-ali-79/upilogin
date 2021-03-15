package com.fincare.upiprelogin.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.fincare.upiprelogin.model.GetTxnHistory;
import com.fincare.upiprelogin.model.GetTxnMiniStmt;
import com.fincare.upiprelogin.service.GetTxnHistoryTabService;
import com.fincare.upiprelogin.service.GetTxnMinStmtTabService;

public class GetTransHistoyController {
	
	

	@Autowired
	private GetTxnHistoryTabService txnHistoryService;
	
	@PostMapping("/TxnStmtTab")
	public String getHistoryTab( @Valid @RequestBody GetTxnHistory txnHistory){
		
		String response=txnHistoryService.getTxnHistory(txnHistory);
		
		return response;
		 
	}


}
