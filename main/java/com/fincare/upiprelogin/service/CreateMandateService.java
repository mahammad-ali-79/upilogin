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
import com.fincare.upiprelogin.model.CreateMandate;
import com.fincare.upiprelogin.model.Parameters;
import com.fincare.upiprelogin.model.Request;
import com.fincare.upiprelogin.model.Response;

@Service
public class CreateMandateService {
	
	@Autowired
	private UpiProxy upiProxy;
	@Value("${upi.logType:Error}")
	private String errorLog;
	 private  final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	public Response getCreateMandate(CreateMandate createMandate) {
		
		Map<String, String> headers = new HashMap<>();
		headers.put("Content-Type", "application/json");
		Parameters paramsCustomerId = new Parameters();
		paramsCustomerId.setKey("CUSTOMERID");
		paramsCustomerId.setValue(createMandate.getCustomerid());
		Parameters paramsVPAId = new Parameters();
		paramsVPAId.setKey("VPAID");
		paramsVPAId.setValue(createMandate.getVpaid());
		Parameters paramsVPAFdId = new Parameters();
		paramsVPAFdId.setKey("VPAFDID");
		paramsVPAFdId.setValue(createMandate.getVpafdid());
		Parameters paramsInitiatorType = new Parameters();
		paramsInitiatorType.setKey("INITIATORTYPE ");
		paramsInitiatorType.setValue(createMandate.getInitiatonmode());
		Parameters paramsTxnId = new Parameters();
		paramsTxnId.setKey("TXNID ");
		paramsTxnId.setValue(createMandate.getTxnid());
		Parameters paramsNote = new Parameters();
		paramsNote.setKey("NOTE ");
		paramsNote.setValue(createMandate.getNote());
		Parameters paramsRefId = new Parameters();
		paramsRefId.setKey("REFID ");
		paramsRefId.setValue(createMandate.getRefid());
		Parameters paramsMandateExpiry = new Parameters();
		paramsMandateExpiry.setKey("MANDATEEXPIRY");
		paramsMandateExpiry.setValue(createMandate.getMandateexpiry());
		Parameters paramsRevokeable = new Parameters();
		paramsRevokeable.setKey("REVOKEABLE");
		paramsRevokeable.setValue(createMandate.getRevokeable());
		Parameters paramsShareToPayee = new Parameters();
		paramsShareToPayee.setKey("SHARETOPAYEE");
		paramsShareToPayee.setValue(createMandate.getSharetopayee());
		Parameters paramsStartDate = new Parameters();
		paramsStartDate.setKey("STARTDATE");
		paramsStartDate.setValue(createMandate.getStartdate());
		Parameters paramsEndDate = new Parameters();
		paramsEndDate.setKey("ENDDATE");
		paramsEndDate.setValue(createMandate.getEnddate());
		Parameters paramsAmount = new Parameters();
		paramsAmount.setKey("AMOUNT");
		paramsAmount.setValue(createMandate.getAmount());
		Parameters paramsAmountRule = new Parameters();
		paramsAmountRule.setKey("AMOUNTRULE");
		paramsAmountRule.setValue(createMandate.getAmountrule());
		Parameters paramsRecurrencePattern = new Parameters();
		paramsRecurrencePattern.setKey("RECURRENCEPATTERN");
		paramsRecurrencePattern.setValue(createMandate.getRecurrencepattern());
		Parameters paramsRecurrenceRuleValue = new Parameters();
		paramsRecurrenceRuleValue.setKey("RECURRENCERULEVALUE");
		paramsRecurrenceRuleValue.setValue(createMandate.getRecurencerulevalue());
		Parameters paramsRecurrenceRuleType = new Parameters();
		paramsRecurrenceRuleType.setKey("RECURRENCERULETYPE");
		paramsRecurrenceRuleType.setValue(createMandate.getRecurrenceruletype());
		Parameters paramsDeviceImeiId = new Parameters();
		paramsDeviceImeiId.setKey("DEVICEIMEIID");
		paramsDeviceImeiId.setValue(createMandate.getDeviceimeiid());
		Parameters paramsGeoCode = new Parameters();
		paramsGeoCode.setKey("GEOCODE");
		paramsGeoCode.setValue(createMandate.getGeocode());
		Parameters paramsLocation = new Parameters();
		paramsLocation.setKey("LOCATION");
		paramsLocation.setValue(createMandate.getLocation());
		Parameters paramsDeviceIp = new Parameters();
		paramsDeviceIp.setKey("DEVICEIP");
		paramsDeviceIp.setValue(createMandate.getDeviceip());
		Parameters paramsDeviceId = new Parameters();
		paramsDeviceId.setKey("DEVICEID");
		paramsDeviceId.setValue(createMandate.getDeviceid());
		Parameters paramsNpciLibEncryptedData = new Parameters();
		paramsNpciLibEncryptedData.setKey("NPCILIBENCRYPTEDDATA");
		paramsNpciLibEncryptedData.setValue(createMandate.getNpcilibencrypteddata());
		Parameters paramsMPin = new Parameters();
		paramsMPin.setKey("MPIN");
		paramsMPin.setValue(createMandate.getMpin());
		Parameters paramsToVPA = new Parameters();
		paramsToVPA.setKey("TOVPA");
		paramsToVPA.setValue(createMandate.getTovpa());
		Parameters paramsToName = new Parameters();
		paramsToName.setKey("TONAME");
		paramsToName.setValue(createMandate.getToname());
		Parameters paramsToCode = new Parameters();
		paramsToCode.setKey("TOCODE");
		paramsToCode.setValue(createMandate.getTocode());
		Parameters paramsInitiationCode = new Parameters();
		paramsInitiationCode.setKey("INITIATIONCODE");
		paramsInitiationCode.setValue(createMandate.getInitiatonmode());
		Parameters paramsPurpose = new Parameters();
		paramsPurpose.setKey("PURPOSE");
		paramsPurpose.setValue(createMandate.getPurpose());
		Parameters paramsSessionId = new Parameters();
		paramsSessionId.setKey("SESSIONID");
		paramsSessionId.setValue(createMandate.getSessionid());
		Parameters paramsDt = new Parameters();
		paramsDt.setKey("DT");
		paramsDt.setValue(createMandate.getDt());
		ArrayList<Parameters> param = new ArrayList<Parameters>();
		
		param.add(paramsSessionId);
		param.add(paramsPurpose);
		param.add(paramsInitiationCode);
		param.add(paramsToCode);
		param.add(paramsToName);
		param.add(paramsNpciLibEncryptedData);
		param.add(paramsDeviceId);
		param.add(paramsDeviceIp);
		param.add(paramsGeoCode);
		param.add(paramsDeviceImeiId);
		param.add(paramsRecurrenceRuleType);
		param.add(paramsVPAId);
		param.add(paramsVPAFdId);
		param.add(paramsTxnId);
		param.add(paramsAmount);
		param.add(paramsLocation);
		param.add(paramsMPin);
		param.add(paramsToVPA);
		param.add(paramsDt);
		param.add(paramsCustomerId);
		param.add(paramsInitiatorType);
		param.add(paramsNote);
		param.add(paramsRefId);
		param.add(paramsMandateExpiry);
		param.add(paramsRevokeable);
		param.add(paramsShareToPayee);
		param.add(paramsStartDate);
		param.add(paramsEndDate);
		param.add(paramsAmountRule);
		param.add(paramsRecurrencePattern);
		param.add(paramsRecurrenceRuleValue);
		
		Common common = new Common();

		Request request = new Request();
		request.setParams(param);
		request.setDeviceId(0); 
		request.setInitiatorId("");
		request.setService("CreateMandate");

		
		
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
