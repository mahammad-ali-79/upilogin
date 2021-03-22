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
import com.fincare.upiprelogin.model.RejectAuthMandate;
import com.fincare.upiprelogin.model.Request;
import com.fincare.upiprelogin.model.Response;

@Service
public class RejectAuthMandateService {
	
	@Autowired
	private UpiProxy upiProxy;
	@Value("${upi.logType:Error}")
	private String errorLog;
	 private  final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	public Response getRejectAuthMandate(RejectAuthMandate rejectAuthMandate) {
		
		Map<String, String> headers = new HashMap<>();
		headers.put("Content-Type", "application/json");
		Parameters paramsMandateId = new Parameters();
		paramsMandateId.setKey("MANDATEID");
		paramsMandateId.setValue(rejectAuthMandate.getMandated());
		Parameters paramsCustomerId = new Parameters();
		paramsCustomerId.setKey("CUSTOMERID");
		paramsCustomerId.setValue(rejectAuthMandate.getCustomerid());
		Parameters paramsVPAId = new Parameters();
		paramsVPAId.setKey("VPAID");
		paramsVPAId.setValue(rejectAuthMandate.getVpaid());
		Parameters paramsVPAFdId = new Parameters();
		paramsVPAFdId.setKey("VPAFDID");
		paramsVPAFdId.setValue(rejectAuthMandate.getVpafdid());
		Parameters paramsTxnType = new Parameters();
		paramsTxnType.setKey("TXNTYPE ");
		paramsTxnType.setValue(rejectAuthMandate.getTxntype());
		Parameters paramsTxnId = new Parameters();
		paramsTxnId.setKey("TXNID ");
		paramsTxnId.setValue(rejectAuthMandate.getTxnid());		
		Parameters paramsAmount = new Parameters();
		paramsAmount.setKey("AMOUNT");
		paramsAmount.setValue(rejectAuthMandate.getAmount());
		Parameters paramsDeviceImeiId = new Parameters();
		paramsDeviceImeiId.setKey("DEVICEIMEIID");
		paramsDeviceImeiId.setValue(rejectAuthMandate.getDeviceimeiid());
		Parameters paramsGeoCode = new Parameters();
		paramsGeoCode.setKey("GEOCODE");
		paramsGeoCode.setValue(rejectAuthMandate.getGeocode());
		Parameters paramsLocation = new Parameters();
		paramsLocation.setKey("LOCATION");
		paramsLocation.setValue(rejectAuthMandate.getLocation());
		Parameters paramsDeviceIp = new Parameters();
		paramsDeviceIp.setKey("DEVICEIP");
		paramsDeviceIp.setValue(rejectAuthMandate.getDeviceip());
		Parameters paramsDeviceId = new Parameters();
		paramsDeviceId.setKey("DEVICEID");
		paramsDeviceId.setValue(rejectAuthMandate.getDeviceid());		
		Parameters paramsMPin = new Parameters();
		paramsMPin.setKey("MPIN");
		paramsMPin.setValue(rejectAuthMandate.getMpin());
		Parameters paramsInitiationCode = new Parameters();
		Parameters paramsSessionId = new Parameters();
		paramsSessionId.setKey("SESSIONID");
		paramsSessionId.setValue(rejectAuthMandate.getSessionid());
		Parameters paramsDt = new Parameters();
		paramsDt.setKey("DT");
		paramsDt.setValue(rejectAuthMandate.getDt());
		Parameters paramsNpciLibEncryptedData = new Parameters();
		paramsNpciLibEncryptedData.setKey("NPCILIBENCRYPTEDDATA");
		paramsNpciLibEncryptedData.setValue(rejectAuthMandate.getNpcilibencrypteddata());
		
		
ArrayList<Parameters> param = new ArrayList<Parameters>();
		
	
		param.add(paramsCustomerId);
		param.add(paramsNpciLibEncryptedData);
		param.add(paramsSessionId);
		param.add(paramsInitiationCode);
		param.add(paramsDeviceId);
		param.add(paramsDeviceIp);
		param.add(paramsGeoCode);
		param.add(paramsDeviceImeiId);
		param.add(paramsTxnType);
		param.add(paramsCustomerId);
		param.add(paramsMandateId);
		param.add(paramsVPAId);
		param.add(paramsVPAFdId);
		param.add(paramsTxnId);
		param.add(paramsAmount);
		param.add(paramsLocation);
		param.add(paramsMPin);
		param.add(paramsDt);
		
	
		
		Common common = new Common();

		Request request = new Request();
		request.setParams(param);
		request.setDeviceId(0); 
		request.setInitiatorId("");
		request.setService("RejectAuthMandate");

		
		
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
