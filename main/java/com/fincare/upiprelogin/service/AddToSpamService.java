package com.fincare.upiprelogin.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fincare.upiprelogin.model.AddToSpam;
import com.fincare.upiprelogin.model.Common;
import com.fincare.upiprelogin.model.Parameters;
import com.fincare.upiprelogin.model.Request;

@Service
public class AddToSpamService {
	
	@Autowired
	private UpiProxy upiProxy;
	@Autowired
	private ResponseService responseService;
	@Autowired
	private HttpServletRequest clientIp;
	
	public String getAddToSpam(AddToSpam addtoSpam) {
		
		Map<String, String> headers = new HashMap<>();
		headers.put("Content-Type", "application/json");
		Parameters paramsCustomerId = new Parameters();
		paramsCustomerId.setKey("CUSTOMERID");
		paramsCustomerId.setValue(addtoSpam.getCustomerid());
		Parameters paramsVPA = new Parameters();
		paramsVPA.setKey("VPA");
		paramsVPA.setValue(addtoSpam.getVpa());
		Parameters paramsReason = new Parameters();
		paramsReason.setKey("REASON");
		paramsReason.setValue(addtoSpam.getReason());
		Parameters paramsIsBlock = new Parameters();
		paramsIsBlock.setKey("ISBLOCK");
		paramsIsBlock.setValue(addtoSpam.getIsblock());
		Parameters paramsBlockPeriod = new Parameters();
		paramsBlockPeriod.setKey("BLOCKPERIOD");
		paramsBlockPeriod.setValue(addtoSpam.getBlockperiod());
		Parameters paramsIp = new Parameters();
		paramsIp.setKey("IP");
		paramsIp.setValue(addtoSpam.getIp());
		Parameters paramsGeoc = new Parameters();
		paramsGeoc.setKey("GEOC");
		paramsGeoc.setValue(addtoSpam.getGeoc());
		Parameters paramsLoc = new Parameters();
		paramsLoc.setKey("LOC");
		paramsLoc.setValue(addtoSpam.getLoc());
		Parameters paramsDeviceId = new Parameters();
		paramsDeviceId.setKey("DEVICEID");
		paramsDeviceId.setValue(addtoSpam.getDeviceid());
		Parameters paramsSessionId = new Parameters();
		paramsSessionId.setKey("SESSIONID");
		paramsSessionId.setValue(addtoSpam.getSessionid());
		Parameters paramsDt = new Parameters();
		paramsDt.setKey("Dt");
		paramsDt.setValue(addtoSpam.getDt());
		
		ArrayList<Parameters> param = new ArrayList<Parameters>();
		param.add(paramsSessionId);
		param.add(paramsDeviceId);
		param.add(paramsGeoc);
		param.add(paramsBlockPeriod);
		param.add(paramsReason);
		param.add(paramsCustomerId);
		param.add(paramsDt);
		param.add(paramsLoc);
		param.add(paramsIp);
		param.add(paramsIsBlock);
		param.add(paramsVPA);
		
		
		
		Common common = new Common();

		Request request = new Request();
		request.setParams(param);
		request.setDeviceId(0);
		request.setInitiatorId("");
		request.setService("AddToSpam");

		
		
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
