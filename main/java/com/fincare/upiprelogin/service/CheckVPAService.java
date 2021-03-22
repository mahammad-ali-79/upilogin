package com.fincare.upiprelogin.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.fincare.upiprelogin.model.CheckVPA;
import com.fincare.upiprelogin.model.Common;
import com.fincare.upiprelogin.model.Parameters;
import com.fincare.upiprelogin.model.Request;
import com.fincare.upiprelogin.model.Response;

@Service
public class CheckVPAService {

	@Autowired
	private UpiProxy upiProxy;
	@Value("${upi.logType:Error}")
	private String errorLog;
	 private  final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	public Response getCheckVPA(CheckVPA checkVPA) {
		
		Map<String, String> headers = new HashMap<>();
		headers.put("Content-Type", "application/json");
		Parameters paramVpa = new Parameters();
		paramVpa.setKey("VPA");
		paramVpa.setValue(checkVPA.getVpa());
		Parameters paramsDt = new Parameters();
		paramsDt.setKey("dt");
		paramsDt.setValue(checkVPA.getDt());
		Parameters appVersion= new Parameters();
		appVersion.setKey("APPVERSION");
		appVersion.setValue(checkVPA.getAppversion());
		
		
		ArrayList<Parameters> param = new ArrayList<Parameters>();
		param.add(paramVpa);
		param.add(paramsDt);
		param.add(appVersion);
		
		Request request = new Request();
		request.setParams(param);
		request.setDeviceId(0);
		request.setInitiatorId("");
		request.setService("CheckVPA");

		
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
