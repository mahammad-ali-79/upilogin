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
import com.fincare.upiprelogin.model.GetBlockedVPAList;
import com.fincare.upiprelogin.model.Parameters;
import com.fincare.upiprelogin.model.Request;
import com.fincare.upiprelogin.model.Response;

@Service
public class GetBlockedVPAListService {
	
	@Autowired
	private UpiProxy upiProxy;
	@Value("${upi.logType:Error}")
	private String errorLog;
	 private  final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	
	public Response getBlockedVPA(GetBlockedVPAList getBlockedVPA) {
		
		Map<String, String> headers = new HashMap<>();
		headers.put("Content-Type", "application/json");
		Parameters paramsCustomerId = new Parameters();
		paramsCustomerId.setKey("CUSTOMERID");
		paramsCustomerId.setValue(getBlockedVPA.getCustomerid());
		Parameters paramsSessionId = new Parameters();
		paramsSessionId.setKey("SESSIONID");
		paramsSessionId.setValue(getBlockedVPA.getSessionid());
		Parameters paramsDt = new Parameters();
		paramsDt.setKey("DT");
		paramsDt.setValue(getBlockedVPA.getDt());
		
		
		
		ArrayList<Parameters> param = new ArrayList<Parameters>();
		
		param.add(paramsSessionId);
		param.add(paramsCustomerId);
		param.add(paramsDt);
		
		Common common = new Common();

		Request request = new Request();
		request.setParams(param);
		request.setDeviceId(0); 
		request.setInitiatorId("");
		request.setService("GetBlockedVPAList");

		
		
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
