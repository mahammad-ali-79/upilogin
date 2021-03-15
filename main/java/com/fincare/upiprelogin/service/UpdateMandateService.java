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
import com.fincare.upiprelogin.model.UpdateMandate;

@Service
public class UpdateMandateService {
	
	

	@Autowired
	private UpiProxy upiProxy;
	@Autowired
	private ResponseService responseService;
	@Autowired
	private HttpServletRequest clientIp;
	
	
	public String getUpdateMandate(UpdateMandate updateMandate) {
		
		
		Map<String, String> headers = new HashMap<>();
		headers.put("Content-Type", "application/json");
		Parameters paramsMandatId = new Parameters();
		paramsMandatId.setKey("MANDATEID");
		paramsMandatId.setValue(updateMandate.getMandated());
		Parameters paramsCustomerId = new Parameters();
		paramsCustomerId.setKey("CUSTOMERID");
		paramsCustomerId.setValue(updateMandate.getCustomerid());
		Parameters paramsVPAId = new Parameters();
		paramsVPAId.setKey("VPAID");
		paramsVPAId.setValue(updateMandate.getVpaid());
		Parameters paramsVPAFdId = new Parameters();
		paramsVPAFdId.setKey("VPAFDID");
		paramsVPAFdId.setValue(updateMandate.getVpafdid());
		Parameters paramsInitiatorType = new Parameters();
		paramsInitiatorType.setKey("INITIATORTYPE ");
		paramsInitiatorType.setValue(updateMandate.getInitiatortype());
		Parameters paramsTxnId = new Parameters();
		paramsTxnId.setKey("TXNID ");
		paramsTxnId.setValue(updateMandate.getTxnid());
		Parameters paramsNote = new Parameters();
		paramsNote.setKey("NOTE ");
		paramsNote.setValue(updateMandate.getNote());
		Parameters paramsRefId = new Parameters();
		paramsRefId.setKey("REFID ");
		paramsRefId.setValue(updateMandate.getRefid());
		Parameters paramsMandateExpiry = new Parameters();
		paramsMandateExpiry.setKey("MANDATEEXPIRY");
		paramsMandateExpiry.setValue(updateMandate.getMandateexpiry());
		Parameters paramsEndDate = new Parameters();
		paramsEndDate.setKey("ENDDATE");
		paramsEndDate.setValue(updateMandate.getEnddate());
		Parameters paramsAmount = new Parameters();
		paramsAmount.setKey("AMOUNT");
		paramsAmount.setValue(updateMandate.getAmount());
		Parameters paramsDeviceImeiId = new Parameters();
		paramsDeviceImeiId.setKey("DEVICEIMEIID");
		paramsDeviceImeiId.setValue(updateMandate.getDeviceimeiid());
		Parameters paramsGeoCode = new Parameters();
		paramsGeoCode.setKey("GEOCODE");
		paramsGeoCode.setValue(updateMandate.getGeocode());
		Parameters paramsLocation = new Parameters();
		paramsLocation.setKey("LOCATION");
		paramsLocation.setValue(updateMandate.getLocation());
		Parameters paramsDeviceIp = new Parameters();
		paramsDeviceIp.setKey("DEVICEIP");
		paramsDeviceIp.setValue(updateMandate.getDeviceip());
		Parameters paramsDeviceId = new Parameters();
		paramsDeviceId.setKey("DEVICEID");
		paramsDeviceId.setValue(updateMandate.getDeviceid());
		Parameters paramsNpciLibEncryptedData = new Parameters();
		paramsNpciLibEncryptedData.setKey("NPCILIBENCRYPTEDDATA");
		paramsNpciLibEncryptedData.setValue(updateMandate.getNpcilibencrypteddata());
		Parameters paramsMPin = new Parameters();
		paramsMPin.setKey("MPIN");
		paramsMPin.setValue(updateMandate.getMpin());
		Parameters paramsInitiationCode = new Parameters();
		paramsInitiationCode.setKey("INITIATIONCODE");
		paramsInitiationCode.setValue(updateMandate.getInitationmode());
		Parameters paramsPurpose = new Parameters();
		paramsPurpose.setKey("PURPOSE");
		paramsPurpose.setValue(updateMandate.getPurpose());
		Parameters paramsSessionId = new Parameters();
		paramsSessionId.setKey("SESSIONID");
		paramsSessionId.setValue(updateMandate.getSessionid());
		Parameters paramsDt = new Parameters();
		paramsDt.setKey("DT");
		paramsDt.setValue(updateMandate.getDt());
		ArrayList<Parameters> param = new ArrayList<Parameters>();
		
		param.add(paramsSessionId);
		param.add(paramsPurpose);
		param.add(paramsInitiationCode);
		
		param.add(paramsNpciLibEncryptedData);
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
		param.add(paramsMandatId);
		param.add(paramsDt);
		param.add(paramsCustomerId);
		param.add(paramsInitiatorType);
		param.add(paramsNote);
		param.add(paramsRefId);
		param.add(paramsMandateExpiry);
		
		param.add(paramsEndDate);
		
		
		Common common = new Common();

		Request request = new Request();
		request.setParams(param);
		request.setDeviceId(0); 
		request.setInitiatorId("");
		request.setService("UpdateMandate");

		
		
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
