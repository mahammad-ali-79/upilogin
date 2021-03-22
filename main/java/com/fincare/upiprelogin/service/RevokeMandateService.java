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
import com.fincare.upiprelogin.model.RevokeMandate;

@Service
public class RevokeMandateService {
	
	
	@Autowired
	private UpiProxy upiProxy;
	@Value("${upi.logType:Error}")
	private String errorLog;
	 private  final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	
	public Response getRevokeMandate(RevokeMandate revokeMandate) {
		
		Map<String, String> headers = new HashMap<>();
		headers.put("Content-Type", "application/json");
		Parameters paramsMandateId = new Parameters();
		paramsMandateId.setKey("MANDATEID");
		paramsMandateId.setValue(revokeMandate.getMandated());
		Parameters paramsCustomerId = new Parameters();
		paramsCustomerId.setKey("CUSTOMERID");
		paramsCustomerId.setValue(revokeMandate.getCustomerid());
		Parameters paramsVPAId = new Parameters();
		paramsVPAId.setKey("VPAID");
		paramsVPAId.setValue(revokeMandate.getVpaid());
		Parameters paramsVPAFdId = new Parameters();
		paramsVPAFdId.setKey("VPAFDID");
		paramsVPAFdId.setValue(revokeMandate.getVpafdid());
		Parameters paramsInitiatorType = new Parameters();
		paramsInitiatorType.setKey("INITIATORTYPE ");
		paramsInitiatorType.setValue(revokeMandate.getInitiationmode());
		Parameters paramsTxnId = new Parameters();
		paramsTxnId.setKey("TXNID ");
		paramsTxnId.setValue(revokeMandate.getTxnid());		
		Parameters paramsRefId = new Parameters();
		paramsRefId.setKey("REFID ");
		paramsRefId.setValue(revokeMandate.getRefid());
		Parameters paramsStartDate = new Parameters();
		paramsStartDate.setKey("STARTDATE");
		paramsStartDate.setValue(revokeMandate.getStartdate());
		Parameters paramsEndDate = new Parameters();
		paramsEndDate.setKey("ENDDATE");
		paramsEndDate.setValue(revokeMandate.getEnddate());
		Parameters paramsAmount = new Parameters();
		paramsAmount.setKey("AMOUNT");
		paramsAmount.setValue(revokeMandate.getAmount());		
		Parameters paramsDeviceImeiId = new Parameters();
		paramsDeviceImeiId.setKey("DEVICEIMEIID");
		paramsDeviceImeiId.setValue(revokeMandate.getDeviceimeiid());
		Parameters paramsGeoCode = new Parameters();
		paramsGeoCode.setKey("GEOCODE");
		paramsGeoCode.setValue(revokeMandate.getGeocode());
		Parameters paramsLocation = new Parameters();
		paramsLocation.setKey("LOCATION");
		paramsLocation.setValue(revokeMandate.getLocation());
		Parameters paramsDeviceIp = new Parameters();
		paramsDeviceIp.setKey("DEVICEIP");
		paramsDeviceIp.setValue(revokeMandate.getDeviceip());
		Parameters paramsDeviceId = new Parameters();
		paramsDeviceId.setKey("DEVICEID");
		paramsDeviceId.setValue(revokeMandate.getDeviceid());		
		Parameters paramsMPin = new Parameters();
		paramsMPin.setKey("MPIN");
		paramsMPin.setValue(revokeMandate.getMpin());
		Parameters paramsInitiationCode = new Parameters();
		paramsInitiationCode.setKey("INITIATIONCODE");
		paramsInitiationCode.setValue(revokeMandate.getInitiationmode());	
		Parameters paramsSessionId = new Parameters();
		paramsSessionId.setKey("SESSIONID");
		paramsSessionId.setValue(revokeMandate.getSessionid());
		Parameters paramsDt = new Parameters();
		paramsDt.setKey("DT");
		paramsDt.setValue(revokeMandate.getDt());
		Parameters paramsNpciLib = new Parameters();
		paramsNpciLib.setKey("NPCILIB");
		paramsNpciLib.setValue(revokeMandate.getNpcilib());
		ArrayList<Parameters> param = new ArrayList<Parameters>();
		
		param.add(paramsSessionId);
		param.add(paramsNpciLib);
		param.add(paramsInitiationCode);
		param.add(paramsMandateId);
		param.add(paramsDeviceId);
		param.add(paramsDeviceIp);
		param.add(paramsGeoCode);
		param.add(paramsDeviceImeiId);
		param.add(paramsVPAId);
		param.add(paramsVPAFdId);
		param.add(paramsTxnId);
		param.add(paramsAmount);
		param.add(paramsLocation);
		param.add(paramsMPin);
		param.add(paramsDt);
		param.add(paramsCustomerId);
		param.add(paramsInitiatorType);	
		param.add(paramsRefId);
		param.add(paramsStartDate);
		param.add(paramsEndDate);
	
		
		Common common = new Common();

		Request request = new Request();
		request.setParams(param);
		request.setDeviceId(0); 
		request.setInitiatorId("");
		request.setService("RevokeMandate");

		
		
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
