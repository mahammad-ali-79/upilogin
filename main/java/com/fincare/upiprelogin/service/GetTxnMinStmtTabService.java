package com.fincare.upiprelogin.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fincare.upiprelogin.model.Common;
import com.fincare.upiprelogin.model.GetTxnMiniStmt;
import com.fincare.upiprelogin.model.Parameters;
import com.fincare.upiprelogin.model.Request;

@Service
public class GetTxnMinStmtTabService {
	
	@Autowired
	private UpiProxy upiProxy;
	@Autowired
	private ResponseService responseService;
	@Autowired
	private HttpServletRequest clientIp;
	
	
	public String getTxnMinStmtTab(GetTxnMiniStmt txnMiniStmt) {
		
		
		Map<String, String> headers = new HashMap<>();
		headers.put("Content-Type", "application/json");
		
		Parameters paramsCustomerId = new Parameters();
		paramsCustomerId.setKey("CUSTOMERID");
		paramsCustomerId.setValue(txnMiniStmt.getCustomerid());
		Parameters paramsRec= new Parameters();
		paramsRec.setKey("REC");
		paramsRec.setValue(txnMiniStmt.getRec());
		Parameters paramsSessionId= new Parameters();
		paramsSessionId.setKey("SESSIONID");
		paramsSessionId.setValue(txnMiniStmt.getSessionid());
		Parameters paramsDt= new Parameters();
		paramsDt.setKey("DT");
		paramsDt.setValue(txnMiniStmt.getDt());
		
		ArrayList<Parameters> param = new ArrayList<Parameters>();
		
		param.add(paramsSessionId);
		param.add(paramsRec);
		param.add(paramsCustomerId);
		param.add(paramsDt);
		
		Request request = new Request();
		request.setParams(param);
		request.setDeviceId(0);
		request.setInitiatorId("");
		request.setService("GetTxnMiniStatementTabs");

		
		Common common = new Common();

		common.setRequest(request);
		System.out.println(common.toString());
		String response = upiProxy.getResponse(headers, common);
		 String finalResponse=responseService.getResponse(response);
		 String xForwardedForHeader = clientIp.getHeader("X-Forwarded-For");
		    if (xForwardedForHeader == null) {
		    	System.out.println(clientIp.getRemoteAddr().toString());
		    	 System.out.println(clientIp.getRemoteAddr().toString());
		    	 
		        return clientIp.getRemoteAddr();
		        
		    } else { 
		       System.out.println("IPADDRESS");
		        return new StringTokenizer(xForwardedForHeader, ",").nextToken().trim();
		    }
	
		
		
	}

}
