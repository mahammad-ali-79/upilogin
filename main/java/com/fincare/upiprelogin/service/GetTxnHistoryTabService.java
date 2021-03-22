package com.fincare.upiprelogin.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.fincare.upiprelogin.model.Common;
import com.fincare.upiprelogin.model.GetTxnHistory;
import com.fincare.upiprelogin.model.Parameters;
import com.fincare.upiprelogin.model.Request;
import com.fincare.upiprelogin.model.Response;

@Service
public class GetTxnHistoryTabService {
	
	@Autowired
	private UpiProxy upiProxy;
	@Value("${upi.logType:Error}")
	private String errorLog;
	 private  final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	
	public Response getTxnHistory(GetTxnHistory txnHistory) {
		
		Map<String, String> headers = new HashMap<>();
		headers.put("Content-Type", "application/json");
		Parameters paramsCustomerId = new Parameters();
		paramsCustomerId.setKey("CUSTOMERID");
		paramsCustomerId.setValue(txnHistory.getCustomerid());
		Parameters paramsFromDate = new Parameters();
		paramsFromDate.setKey("FROMDATE");
		paramsFromDate.setValue(txnHistory.getFromdate());
		Parameters paramsToDate = new Parameters();
		paramsToDate.setKey("TODATE");
		paramsToDate.setValue(txnHistory.getTodate());
		
		Parameters paramsSessionId= new Parameters();
		paramsSessionId.setKey("SESSIONID");
		paramsSessionId.setValue(txnHistory.getSessionid());
		Parameters paramsDt= new Parameters();
		paramsDt.setKey("DT");
		paramsDt.setValue(txnHistory.getDt());
		
		
		ArrayList<Parameters> param = new ArrayList<Parameters>();
		
		param.add(paramsSessionId);
		param.add(paramsToDate);
		param.add(paramsFromDate);
		param.add(paramsCustomerId);
		param.add(paramsDt);
		
		Request request = new Request();
		request.setParams(param);
		request.setDeviceId(0);
		request.setInitiatorId("");
		request.setService("GetTxnHistoryTabs");

		
		Common common = new Common();

		common.setRequest(request);
		System.out.println(common.toString());
		Response response = upiProxy.getResponse(headers, common);
		// System.out.println(response);
    	if(errorLog.equals("Error")) {
 		//logger.info("OutPut Response:",response);
 		logger.error("OutPut Response:",response);
    	}
    	 return response;
	
		
	}

}
