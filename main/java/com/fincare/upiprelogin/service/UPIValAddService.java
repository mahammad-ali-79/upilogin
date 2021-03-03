package com.fincare.upiprelogin.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fincare.upiprelogin.model.Common;
import com.fincare.upiprelogin.model.Parameters;
import com.fincare.upiprelogin.model.Request;
import com.fincare.upiprelogin.model.UPIValAdd;

@Service
public class UPIValAddService {
	
	
	@Autowired
	private UpiProxy upiProxy;
	@Autowired
	private ResponseService responseService;
	@Autowired
	private HttpServletRequest clientIp;
	
	
	public String getUpiValAdd(UPIValAdd upiValAdd) {
		
		Map<String, String> headers = new HashMap<>();
		headers.put("Content-Type", "application/json");
		
		Parameters paramsCustomerId = new Parameters();
		paramsCustomerId.setKey("CUSTID");
		paramsCustomerId.setValue(upiValAdd.getCustid());
		Parameters paramsVPAId = new Parameters();
		paramsVPAId.setKey("VPAID");
		paramsVPAId.setValue(upiValAdd.getVpaid());
		Parameters paramsVPA = new Parameters();
		paramsVPA.setKey("VPA");
		paramsVPA.setValue(upiValAdd.getVpa());
		Parameters paramsRefId = new Parameters();
		paramsRefId.setKey("REFID");
		paramsRefId.setValue(upiValAdd.getRefid());
		Parameters paramsDeviceId = new Parameters();
		paramsDeviceId.setKey("DEVICEID");
		paramsDeviceId.setValue(upiValAdd.getDeviceid());
		Parameters paramsIp = new Parameters();
		paramsIp.setKey("IP");
		paramsIp.setValue(upiValAdd.getIp());
		Parameters paramsGeoc = new Parameters();
		paramsGeoc.setKey("GEOC");
		paramsGeoc.setValue(upiValAdd.getGeoc());
		Parameters paramsLoc = new Parameters();
		paramsLoc.setKey("LOC");
		paramsLoc.setValue(upiValAdd.getLoc());
		Parameters paramsSessionId = new Parameters();
		paramsSessionId.setKey("SESSIONID");
		paramsSessionId.setValue(upiValAdd.getSessionid());
		Parameters paramsDt = new Parameters();
		paramsDt.setKey("DT");
		paramsDt.setValue(upiValAdd.getDt());
		
		ArrayList<Parameters> param = new ArrayList<Parameters>();
		
		param.add(paramsSessionId);
		param.add(paramsGeoc);
		param.add(paramsDeviceId);
		param.add(paramsRefId);
		param.add(paramsCustomerId);
		param.add(paramsDt);
		param.add(paramsLoc);
		param.add(paramsIp);
		param.add(paramsVPA);
		param.add(paramsVPAId);
		
		Request request = new Request();
		request.setParams(param);
		request.setDeviceId(0);
		request.setInitiatorId("");
		request.setService("GetTxnHistoryTabs");

		
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
