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
import com.fincare.upiprelogin.model.UPISetPin;

@Service
public class UPISetPinService {
	
	
	@Autowired
	private UpiProxy upiProxy;
	@Value("${upi.logType:Error}")
	private String errorLog;
	 private  final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	
	public Response getUPIPin(UPISetPin upiSetPin) {
		Map<String, String> headers = new HashMap<>();
		headers.put("Content-Type", "application/json");
		Parameters paramsCustomerId = new Parameters();
		paramsCustomerId.setKey("CUSTID");
		paramsCustomerId.setValue(upiSetPin.getCustid());
		Parameters paramsVPAFdId = new Parameters();
		paramsVPAFdId.setKey("VPAFDID");
		paramsVPAFdId.setValue(upiSetPin.getVpafdid());
		Parameters paramsVPAId = new Parameters();
		paramsVPAId.setKey("VPAID");
		paramsVPAId.setValue(upiSetPin.getVpaid());
		Parameters paramsTxnId = new Parameters();
		paramsTxnId.setKey("TXNID");
		paramsTxnId.setValue(upiSetPin.getTxnid());
		Parameters paramsDeviceImeiId = new Parameters();
		paramsDeviceImeiId.setKey("DEVICEIMEIID");
		paramsDeviceImeiId.setValue(upiSetPin.getDeviceimeiid());
		Parameters paramsRefId = new Parameters();
		paramsRefId.setKey("REFID");
		paramsRefId.setValue(upiSetPin.getRefid());
		Parameters paramsDeviceId = new Parameters();
		paramsDeviceId.setKey("DEVICEID");
		paramsDeviceId.setValue(upiSetPin.getDeviceid());
		Parameters paramsNpciLibOldPin = new Parameters();
		paramsNpciLibOldPin.setKey("NPCILIBOLDMPIN");
		paramsNpciLibOldPin.setValue(upiSetPin.getNpciliboldmpin());
		Parameters paramsNpciLibNewPin = new Parameters();
		paramsNpciLibNewPin.setKey("NPCILIBNEWMPIN");
		paramsNpciLibNewPin.setValue(upiSetPin.getNpcilibnewpin());
		Parameters paramsIp = new Parameters();
		paramsIp.setKey("IP");
		paramsIp.setValue(upiSetPin.getIp());
		Parameters paramsGeoc = new Parameters();
		paramsGeoc.setKey("GEOC");
		paramsGeoc.setValue(upiSetPin.getGeoc());
		Parameters paramsLoc = new Parameters();
		paramsLoc.setKey("LOC");
		paramsLoc.setValue(upiSetPin.getLoc());
		Parameters paramsSessionId = new Parameters();
		paramsSessionId.setKey("SESSIONID");
		paramsSessionId.setValue(upiSetPin.getSessionid());
		Parameters paramsDt = new Parameters();
		paramsDt.setKey("DT");
		paramsDt.setValue(upiSetPin.getDt());
		ArrayList<Parameters> param = new ArrayList<Parameters>();
		
		param.add(paramsSessionId);
		param.add(paramsGeoc);
		param.add(paramsNpciLibNewPin);
		param.add(paramsDeviceId);
		param.add(paramsRefId);
		param.add(paramsDeviceImeiId);
		param.add(paramsCustomerId);
		param.add(paramsDt);
		param.add(paramsLoc);
		param.add(paramsIp);
		param.add(paramsNpciLibOldPin);
		param.add(paramsTxnId);
		param.add(paramsVPAFdId);
		param.add(paramsVPAId);
		param.add(paramsTxnId);
		
		
		
		

		Common common = new Common();

		Request request = new Request();
		request.setParams(param);
		request.setDeviceId(0);
		request.setInitiatorId("");
		request.setService("UPI_SetPin");

		
		
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
