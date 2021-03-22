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

import com.fincare.upiprelogin.model.AddVPA;
import com.fincare.upiprelogin.model.Common;
import com.fincare.upiprelogin.model.Parameters;
import com.fincare.upiprelogin.model.Request;
import com.fincare.upiprelogin.model.Response;

@Service
public class AddVPAService {
	
	@Autowired
	private UpiProxy upiProxy;
	
	@Value("${upi.logType:Error}")
	private String errorLog;
	 private  final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	
	public Response getAddVpa(AddVPA addVPA) {
		
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
		Response response = upiProxy.getResponse(headers, common);
		// System.out.println(response);
    	if(errorLog.equals("Error")) {
 		//logger.info("OutPut Response:",response);
 		logger.error("OutPut Response:",response);
    	}
    	 return response;
		
		
		
	}
	
	

}
