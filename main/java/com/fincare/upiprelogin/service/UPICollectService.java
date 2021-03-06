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
import com.fincare.upiprelogin.model.UPICollect;

@Service
public class UPICollectService {
	
	@Autowired
	private UpiProxy upiProxy;
	@Autowired
	private ResponseService responseService;
	@Autowired
	private HttpServletRequest clientIp;
	
	public String getUPICollect(UPICollect upiCollect) {
		
		Map<String, String> headers = new HashMap<>();
		headers.put("Content-Type", "application/json"); 
		
		Parameters paramsCustomerId = new Parameters();
		paramsCustomerId.setKey("CUSTID");
		paramsCustomerId.setValue(upiCollect.getCustid());
		
		Parameters paramsVPAId = new Parameters();
		paramsVPAId.setKey("VPAID");
		paramsVPAId.setValue(upiCollect.getVpaid());
		
		Parameters paramsVPAFDID = new Parameters();
		paramsVPAFDID.setKey("VPAFDID");
		paramsVPAFDID.setValue(upiCollect.getVpafdid());
		Parameters paramsToVpa = new Parameters();
		paramsToVpa.setKey("TOVPA");
		paramsToVpa.setValue(upiCollect.getTovpa());
		Parameters paramsToName = new Parameters();
		paramsToName.setKey("TONAME");
		paramsToName.setValue(upiCollect.getToname());
		Parameters paramsNarration = new Parameters();
		paramsNarration.setKey("NARRATION");
		paramsNarration.setValue(upiCollect.getNarration());
		Parameters paramsAmt = new Parameters();
		paramsAmt.setKey("AMT");
		paramsAmt.setValue(upiCollect.getAmt());
		Parameters paramsCexp = new Parameters();
		paramsCexp.setKey("CEXP");
		paramsCexp.setValue(upiCollect.getCexp());
		Parameters paramsRefId = new Parameters();
		paramsRefId.setKey("REFID");
		paramsRefId.setValue(upiCollect.getRefid());
		Parameters paramsDeviceId = new Parameters();
		paramsDeviceId.setKey("DEVICEID");
		paramsDeviceId.setValue(upiCollect.getDeviceid());
		Parameters paramsSessionId = new Parameters();
		paramsSessionId.setKey("SESSIONID");
		paramsSessionId.setValue(upiCollect.getSessionid());
		Parameters paramsIP = new Parameters();
		paramsIP.setKey("IP");
		paramsIP.setValue(upiCollect.getIp());
		Parameters paramsGeoc = new Parameters();
		paramsGeoc.setKey("GEOC");
		paramsGeoc.setValue(upiCollect.getGeoc());
		Parameters paramsLoc = new Parameters();
		paramsLoc.setKey("LOC");
		paramsLoc.setValue(upiCollect.getLoc());
		Parameters paramsDt = new Parameters();
		paramsDt.setKey("DT");
		paramsDt.setValue(upiCollect.getDt());
		
		ArrayList<Parameters> param = new ArrayList<Parameters>();
		
		param.add(paramsGeoc);
		param.add(paramsSessionId);
		param.add(paramsDeviceId);
		param.add(paramsRefId);
		param.add(paramsCexp);
		param.add(paramsToName);
		param.add(paramsCustomerId);
		param.add(paramsDt);
		param.add(paramsLoc);
		param.add(paramsIP);
		param.add(paramsAmt);
        param.add(paramsNarration);
        param.add(paramsToVpa);
        param.add(paramsVPAFDID);
        param.add(paramsVPAId);
		
		Common common = new Common();

		Request request = new Request();
		request.setParams(param);
		request.setDeviceId(0);
		request.setInitiatorId("");
		request.setService("UPI_Collect");

		
		
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
