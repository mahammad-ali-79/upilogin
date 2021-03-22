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
import com.fincare.upiprelogin.model.UPIAuthCollect;

@Service
public class UPIAuthCollectService {
	

	@Autowired
	private UpiProxy upiProxy;
	@Value("${upi.logType:Error}")
	private String errorLog;
	 private  final Logger logger = LoggerFactory.getLogger(this.getClass());
	 
	
	
	public Response getUPIAuthCollect(UPIAuthCollect upiAuthCollect) {
		
		Map<String, String> headers = new HashMap<>();
		headers.put("Content-Type", "application/json");
		Parameters paramsCustomerId = new Parameters();
		paramsCustomerId.setKey("CUSTID");
		paramsCustomerId.setValue(upiAuthCollect.getCustid());
		Parameters paramsVPAId = new Parameters();
		paramsVPAId.setKey("VPAID");
		paramsVPAId.setValue(upiAuthCollect.getVpaid());
		Parameters paramsVPAFDId = new Parameters();
		paramsVPAFDId.setKey("VPAFDID");
		paramsVPAFDId.setValue(upiAuthCollect.getVpafdid());
		Parameters paramsOrgTxnId = new Parameters();
		paramsOrgTxnId.setKey("ORGTXNID");
		paramsOrgTxnId.setValue(upiAuthCollect.getOrgtxnid());
		Parameters paramsNpciLib = new Parameters();
		paramsNpciLib.setKey("NPCILIB");
		paramsNpciLib.setValue(upiAuthCollect.getNpcilib());
		Parameters paramsMPin = new Parameters();
		paramsMPin.setKey("MPin");
		paramsMPin.setValue(upiAuthCollect.getMpin());
		Parameters paramsTPin = new Parameters();
		paramsTPin.setKey("TPin");
		paramsTPin.setValue(upiAuthCollect.getTpin());
		Parameters paramsTxnId = new Parameters();
		paramsTxnId.setKey("TXNID");
		paramsTxnId.setValue(upiAuthCollect.getTxnid());
		Parameters paramsRefId = new Parameters();
		paramsRefId.setKey("REFID");
		paramsRefId.setValue(upiAuthCollect.getRefid());
		Parameters paramsChId = new Parameters();
		paramsChId.setKey("CHID");
		paramsChId.setValue(upiAuthCollect.getChid());
		Parameters paramsDeviceId = new Parameters();
		paramsDeviceId.setKey("DEVICEID");
		paramsDeviceId.setValue(upiAuthCollect.getDeviceid());
		Parameters paramsIP = new Parameters();
		paramsIP.setKey("IP");
		paramsIP.setValue(upiAuthCollect.getIp());
		Parameters paramsGeoc = new Parameters();
		paramsGeoc.setKey("GEOC");
		paramsGeoc.setValue(upiAuthCollect.getGeoc());
		Parameters paramsLoc = new Parameters();
		paramsLoc.setKey("LOC");
		paramsLoc.setValue(upiAuthCollect.getLoc());
		Parameters paramsSessionId = new Parameters();
		paramsSessionId.setKey("SESSIONID");
		paramsSessionId.setValue(upiAuthCollect.getSessionid());
		Parameters paramsDt = new Parameters();
		paramsDt.setKey("DT");
		paramsDt.setValue(upiAuthCollect.getDt());
		
		
		ArrayList<Parameters> param = new ArrayList<Parameters>();
		
		param.add(paramsSessionId);
		param.add(paramsGeoc);
		param.add(paramsDeviceId);
		param.add(paramsRefId);
		param.add(paramsCustomerId);
		param.add(paramsDt);
		param.add(paramsLoc);
		param.add(paramsIP);
		param.add(paramsChId);
		param.add(paramsTxnId);
		param.add(paramsTPin);
		param.add(paramsMPin);
		param.add(paramsVPAId);
		param.add(paramsVPAFDId);
		param.add(paramsOrgTxnId);
		param.add(paramsNpciLib);
		

		Common common = new Common();

		Request request = new Request();
		request.setParams(param);
		request.setDeviceId(0);
		request.setInitiatorId("");
		request.setService("UPI_AuthCollect");

		
		
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
