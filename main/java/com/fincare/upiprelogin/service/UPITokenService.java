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
import com.fincare.upiprelogin.model.UPIToken;

@Service
public class UPITokenService {
	
	@Autowired
	private UpiProxy upiProxy;
	@Autowired
	private ResponseService responseService;
	@Autowired
	private HttpServletRequest clientIp;
	
	public String getUpiToken(UPIToken upiToken) {
		
		Map<String, String> headers = new HashMap<>();
		headers.put("Content-Type", "application/json");
		Parameters paramsChallenge = new Parameters();
		paramsChallenge.setKey("CHALLENGE");
		paramsChallenge.setValue(upiToken.getChallenge());
		Parameters paramsCType = new Parameters();
		paramsCType.setKey("CTYPE");
		paramsCType.setValue(upiToken.getCtype());
		Parameters paramsRefId = new Parameters();
		paramsRefId.setKey("REFID");
		paramsRefId.setValue(upiToken.getRefid());
		Parameters paramsDeviceId = new Parameters();
		paramsDeviceId.setKey("DEVICEID");
		paramsDeviceId.setValue(upiToken.getDeviceid());
		Parameters paramsDt = new Parameters();
		paramsDt.setKey("DT");
		paramsDt.setValue(upiToken.getDt());
		Parameters paramsIP = new Parameters();
		paramsIP.setKey("IP");
		paramsIP.setValue(upiToken.getIp());
		Parameters paramsGEOC = new Parameters();
		paramsGEOC.setKey("GEOC");
		paramsGEOC.setValue(upiToken.getGeoc());
		Parameters paramsLOC = new Parameters();
		paramsLOC.setKey("LOC");
		paramsLOC.setValue(upiToken.getLoc());
		
		
		ArrayList<Parameters> param = new ArrayList<Parameters>();
		
		param.add(paramsGEOC);
		param.add(paramsDeviceId);
		param.add(paramsRefId);
		param.add(paramsCType);
		param.add(paramsChallenge);
		param.add(paramsLOC);
		param.add(paramsIP);
		param.add(paramsDt);
		
		Request request = new Request();
		request.setParams(param);
		request.setDeviceId(0);
		request.setInitiatorId("");
		request.setService("UPI_Token");

		
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
