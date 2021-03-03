package com.fincare.upiprelogin.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fincare.upiprelogin.model.AddVPA;
import com.fincare.upiprelogin.model.Common;
import com.fincare.upiprelogin.model.Parameters;
import com.fincare.upiprelogin.model.Request;

@Service
public class AddVPAService {
	
	@Autowired
	private UpiProxy upiProxy;
	@Autowired
	private ResponseService responseService;
	@Autowired
	private HttpServletRequest clientIp;
	
	
	public String getAddVpa(AddVPA addVPA) {
		
		Map<String, String> headers = new HashMap<>();
		headers.put("Content-Type", "application/json");
		
		Parameters paramsVpa= new Parameters();
		paramsVpa.setKey("VPA");
		paramsVpa.setValue(addVPA.getVpa());
		Parameters paramsVpaType= new Parameters();
		paramsVpaType.setKey("VPATYPE");
		paramsVpaType.setValue(addVPA.getVpatype());
		Parameters paramsValiFrom= new Parameters();
		paramsValiFrom.setKey("VALIDFROM");
		paramsValiFrom.setValue(addVPA.getValidfrom());
		Parameters paramsValito= new Parameters();
		paramsValito.setKey("VALIDTO");
		paramsValito.setValue(addVPA.getValidto());
		Parameters paramsCustomerId= new Parameters();
		paramsCustomerId.setKey("CUSTOMERID");
		paramsCustomerId.setValue(addVPA.getCustomerid());
		Parameters paramsNickName= new Parameters();
		paramsNickName.setKey("NICKNAME");
		paramsNickName.setValue(addVPA.getNickname());
		Parameters paramsSessionId= new Parameters();
		paramsSessionId.setKey("SESSIONID");
		paramsSessionId.setValue(addVPA.getSessionid());
		Parameters paramsDt= new Parameters();
		paramsDt.setKey("DT");
		paramsDt.setValue(addVPA.getDt());
		
		ArrayList<Parameters> param = new ArrayList<Parameters>();
		
		Request request = new Request();
		request.setParams(param);
		request.setDeviceId(0);
		request.setInitiatorId("");
		request.setService("AddVPA");

		
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
