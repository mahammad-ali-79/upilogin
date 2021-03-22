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
import com.fincare.upiprelogin.model.MandateCollect;
import com.fincare.upiprelogin.model.Parameters;
import com.fincare.upiprelogin.model.Request;
import com.fincare.upiprelogin.model.Response;

@Service
public class MandateCollectService {
	
	@Autowired
	private UpiProxy upiProxy;
	@Value("${upi.logType:Error}")
	private String errorLog;
	 private  final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	
	public Response getMandateCollect(MandateCollect mandateCollect) {
		
		Map<String, String> headers = new HashMap<>();
		headers.put("Content-Type", "application/json");
		Parameters paramsUmn = new Parameters();
		paramsUmn.setKey("UMN");
		paramsUmn.setValue(mandateCollect.getUmn());
		Parameters paramsNote = new Parameters();
		paramsNote.setKey("NOTE");
		paramsNote.setValue(mandateCollect.getNote());
		Parameters paramsCollectXp = new Parameters();
		paramsCollectXp.setKey("COLLECTEXP");
		paramsCollectXp.setValue(mandateCollect.getCollectxp());
		Parameters paramsAmount = new Parameters();
		paramsAmount.setKey("AMOUNT");
		paramsAmount.setValue(mandateCollect.getAmount());
		Parameters paramsInitiationMode = new Parameters();
		paramsInitiationMode.setKey("INITIATIONMODE");
		paramsInitiationMode.setValue(mandateCollect.getInitiationmode());
		Parameters paramsPurpose = new Parameters();
		paramsPurpose.setKey("PURPOSE");
		paramsPurpose.setValue(mandateCollect.getPurpose());
		Parameters paramsDeviceImeiId = new Parameters();
		paramsDeviceImeiId.setKey("DEVICEIMEIID");
		paramsDeviceImeiId.setValue(mandateCollect.getDeviceimeiid());
		Parameters paramsGeoCode = new Parameters();
		paramsGeoCode.setKey("GEOCODE");
		paramsGeoCode.setValue(mandateCollect.getGeocode());
		Parameters paramsLocation = new Parameters();
		paramsLocation.setKey("LOCATION");
		paramsLocation.setValue(mandateCollect.getLocation());
		Parameters paramsDeviceIp = new Parameters();
		paramsDeviceIp.setKey("DEVICEIP");
		paramsDeviceIp.setValue(mandateCollect.getDeviceip());
		Parameters paramsDeviceId = new Parameters();
		paramsDeviceId.setKey("DEVICEID");
		paramsDeviceId.setValue(mandateCollect.getDeviceid());		
		Parameters paramsSessionId = new Parameters();
		paramsSessionId.setKey("SESSIONID");
		paramsSessionId.setValue(mandateCollect.getSessionid());
		Parameters paramsDt = new Parameters();
		paramsDt.setKey("DT");
		paramsDt.setValue(mandateCollect.getDt());
		
		ArrayList<Parameters> param = new ArrayList<Parameters>();
		param.add(paramsSessionId);
		param.add(paramsDeviceId);
		param.add(paramsDeviceIp);
		param.add(paramsGeoCode);
		param.add(paramsDeviceImeiId);
		param.add(paramsPurpose);
		param.add(paramsInitiationMode);
		param.add(paramsCollectXp);
		param.add(paramsNote);
		param.add(paramsDt);
		param.add(paramsLocation);
		param.add(paramsUmn);
		param.add(paramsAmount);
		
		Common common = new Common();

		Request request = new Request();
		request.setParams(param);
		request.setDeviceId(0); 
		request.setInitiatorId("");
		request.setService("MandateCollect");

		
		
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
