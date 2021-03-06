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
import com.fincare.upiprelogin.model.LogADispute;
import com.fincare.upiprelogin.model.Parameters;
import com.fincare.upiprelogin.model.Request;
import com.fincare.upiprelogin.model.Response;

@Service
public class LogADisputeService {
	
	@Autowired
	private UpiProxy upiProxy;
	@Value("${upi.logType:Error}")
	private String errorLog;
	 private  final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	public Response getLogADispute(LogADispute logADispute) {
		
		Map<String, String> headers = new HashMap<>();
		headers.put("Content-Type", "application/json");
		Parameters paramsVPAId = new Parameters();
		paramsVPAId.setKey("VPAID");
		paramsVPAId.setValue(logADispute.getVpaid());
		Parameters paramsVPAFdId = new Parameters();
		paramsVPAFdId.setKey("VPAFDID");
		paramsVPAFdId.setValue(logADispute.getVpafdid());
		Parameters paramsTxnId = new Parameters();
		paramsTxnId.setKey("TXNID");
		paramsTxnId.setValue(logADispute.getTxnid());
		Parameters paramsQt = new Parameters();
		paramsQt.setKey("QT");
		paramsQt.setValue(logADispute.getQt());
		Parameters paramsQD = new Parameters();
		paramsQD.setKey("QD");
		paramsQD.setValue(logADispute.getQd() );
		Parameters paramsSessionId = new Parameters();
		paramsSessionId.setKey("SESSIONID");
		paramsSessionId.setValue(logADispute.getSessionid());
		Parameters paramsCustomerId = new Parameters();
		paramsCustomerId.setKey("customerid");
		paramsCustomerId.setValue(logADispute.getCustomerid());
		Parameters paramsDt = new Parameters();
		paramsDt.setKey("DT");
		paramsDt.setValue(logADispute.getDt());
		
		ArrayList<Parameters> param = new ArrayList<Parameters>();
		param.add(paramsCustomerId);
		param.add(paramsSessionId);
		param.add(paramsDt);
		param.add(paramsQD);
		param.add(paramsQt);
		param.add(paramsTxnId);
		param.add(paramsVPAFdId);
		param.add(paramsVPAId);
		

		Common common = new Common();

		Request request = new Request();
		request.setParams(param);
		request.setDeviceId(0);
		request.setInitiatorId("");
		request.setService("LogADispute");

		
		
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
