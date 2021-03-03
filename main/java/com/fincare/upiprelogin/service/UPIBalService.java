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
import com.fincare.upiprelogin.model.UPIBal;

@Service
public class UPIBalService {
	
	@Autowired
	private UpiProxy upiProxy;
	@Autowired
	private ResponseService responseService;
	@Autowired
	private HttpServletRequest clientIp;
	
	public String getUPIBal(UPIBal upiBal) {
		
		Map<String, String> headers = new HashMap<>();
		headers.put("Content-Type", "application/json");
		Parameters paramsCustomerId = new Parameters();
		paramsCustomerId.setKey("CUSTID");
		paramsCustomerId.setValue(upiBal.getCustid());
		Parameters paramsVPAId = new Parameters();
		paramsVPAId.setKey("VPAID");
		paramsVPAId.setValue(upiBal.getVpaid());
		Parameters paramsVPAFDId = new Parameters();
		paramsVPAFDId.setKey("VPAFDID");
		paramsVPAFDId.setValue(upiBal.getVpafdid());
		Parameters paramsNpciLib = new Parameters();
		paramsNpciLib.setKey("NPCILIB");
		paramsNpciLib.setValue(upiBal.getNpcilib());
		Parameters paramsTxnId = new Parameters();
		paramsTxnId.setKey("TXNID");
		paramsTxnId.setValue(upiBal.getTxnid());
		Parameters paramsMpin = new Parameters();
		paramsMpin.setKey("MPin");
		paramsMpin.setValue(upiBal.getMpin());
		Parameters paramsTpin = new Parameters();
		paramsTpin.setKey("TPin");
		paramsTpin.setValue(upiBal.getTpin());
		Parameters paramsRefId = new Parameters();
		paramsRefId.setKey("REFID");
		paramsRefId.setValue(upiBal.getRefid());
		Parameters paramsDeviceImeiId = new Parameters();
		paramsDeviceImeiId.setKey("DEVICEIMEIID");
		paramsDeviceImeiId.setValue(upiBal.getDeviceimeiid());
		Parameters paramsDeviceId = new Parameters();
		paramsDeviceId.setKey("DEVICEID");
		paramsDeviceId.setValue(upiBal.getDeviceid());
		Parameters paramsIp = new Parameters();
		paramsIp.setKey("IP");
		paramsIp.setValue(upiBal.getIp());
		Parameters paramsGeoc = new Parameters();
		paramsGeoc.setKey("GEOC");
		paramsGeoc.setValue(upiBal.getGeoc());
		Parameters paramsLoc = new Parameters();
		paramsLoc.setKey("LOC");
		paramsLoc.setValue(upiBal.getLoc());
		Parameters paramsSessionId = new Parameters();
		paramsSessionId.setKey("SESSIONID");
		paramsSessionId.setValue(upiBal.getSessionid());
		Parameters paramsDt = new Parameters();
		paramsDt.setKey("DT");
		paramsDt.setValue(upiBal.getDt());
		
		
		ArrayList<Parameters> param = new ArrayList<Parameters>();
		
		param.add(paramsSessionId);
		param.add(paramsGeoc);
		param.add(paramsDeviceId);
		param.add(paramsDeviceImeiId);
		param.add(paramsRefId);
		param.add(paramsCustomerId);
		param.add(paramsDt);
		param.add(paramsLoc);
		param.add(paramsIp);
		param.add(paramsTpin);
		param.add(paramsMpin);
		param.add(paramsTxnId);
		param.add(paramsNpciLib);
		param.add(paramsVPAFDId);
		param.add(paramsVPAId);
		
		Request request = new Request();
		request.setParams(param);
		request.setDeviceId(0);
		request.setInitiatorId("");
		request.setService("UPI_Bal");

		
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
