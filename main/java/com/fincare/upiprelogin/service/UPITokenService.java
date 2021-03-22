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
import com.fincare.upiprelogin.model.Parameters;
import com.fincare.upiprelogin.model.Request;
import com.fincare.upiprelogin.model.Response;
import com.fincare.upiprelogin.model.UPIToken;

@Service
public class UPITokenService {
	
	@Autowired
	private UpiProxy upiProxy;
	@Value("${upi.logType:Error}")
	private String errorLog;
	 private  final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	public Response getUpiToken(UPIToken upiToken) {
		
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
		Response response = upiProxy.getResponse(headers, common);
		// System.out.println(response);
    	if(errorLog.equals("Error")) {
 		//logger.info("OutPut Response:",response);
 		logger.error("OutPut Response:",response);
    	}
    	 return response;
	
	
	}


}
