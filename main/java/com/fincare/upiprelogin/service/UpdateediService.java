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
import com.fincare.upiprelogin.model.UpdateEDI;

@Service
public class UpdateediService {
	

	@Autowired
	private UpiProxy upiProxy;
	@Value("${upi.logType:Error}")
	private String errorLog;
	 private  final Logger logger = LoggerFactory.getLogger(this.getClass());
	 
	
	public Response getUpdateEdi(UpdateEDI updateEd) {
		
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
		Response response = upiProxy.getResponse(headers, common);
		// System.out.println(response);
    	if(errorLog.equals("Error")) {
 		//logger.info("OutPut Response:",response);
 		logger.error("OutPut Response:",response);
    	}
    	 return response;
		
	
	}
		
	

}
