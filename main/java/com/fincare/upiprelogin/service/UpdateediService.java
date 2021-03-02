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
import com.fincare.upiprelogin.model.UpdateEDI;

@Service
public class UpdateediService {
	

	@Autowired
	private UpiProxy upiProxy;
	@Autowired
	private ResponseService responseService;
	@Autowired
	private HttpServletRequest clientIp;
	
	public String getUpdateEdi(UpdateEDI updateEd) {
		
		Map<String, String> headers = new HashMap<>();
		headers.put("Content-Type", "application/json");
		
		Parameters paramsDeviceId = new Parameters();
		paramsDeviceId.setKey("DeviceId");
		paramsDeviceId.setValue(updateEd.getDeviceid());
		Parameters paramsDid = new Parameters();
		paramsDid.setKey("DID");
		paramsDid.setValue(updateEd.getDid());
		Parameters paramsSimId = new Parameters();
		paramsSimId.setKey("SIMID");
		paramsSimId.setValue(updateEd.getSimid());
		Parameters paramsSlotId = new Parameters();
		paramsSlotId.setKey("SLOTID");
		paramsSlotId.setValue(updateEd.getSlotid());
		Parameters paramsDc = new Parameters();
		paramsDc.setKey("DC");
		paramsDc.setValue(updateEd.getDc());
		Parameters paramsDt = new Parameters();
		paramsDt.setKey("DT");
		paramsDt.setValue(updateEd.getDt());
		
		
		ArrayList<Parameters> param = new ArrayList<Parameters>();
		
		
		param.add(paramsDeviceId);
		param.add(paramsDt);
		param.add(paramsDc);
		param.add(paramsSlotId);
		param.add(paramsSimId);
		param.add(paramsDid);
		
		
		Request request = new Request();
		request.setParams(param);
		request.setDeviceId(0);
		request.setInitiatorId("");
		request.setService("UpdateDI");

		
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
