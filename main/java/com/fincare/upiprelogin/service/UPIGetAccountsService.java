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
import com.fincare.upiprelogin.model.UPIGetAccounts;

@Service
public class UPIGetAccountsService {
	
	@Autowired
	private UpiProxy upiProxy;
	@Value("${upi.logType:Error}")
	private String errorLog;
	 private  final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	public Response getUPIGetAccounts(UPIGetAccounts upiGetAccounts) {
		
		Map<String, String> headers = new HashMap<>();
		headers.put("Content-Type", "application/json");
		Parameters paramsCustomerid = new Parameters();
		paramsCustomerid.setKey("CUSTOMERID");
		paramsCustomerid.setValue(upiGetAccounts.getCustomerid());
		Parameters paramsIIN = new Parameters();
		paramsIIN.setKey("IIN");
		paramsIIN.setValue(upiGetAccounts.getIin());
		Parameters paramsVPAId = new Parameters();
		paramsVPAId.setKey("VPAId");
		paramsVPAId.setValue(upiGetAccounts.getVpaid());
		Parameters paramsNPCILIB = new Parameters();
		paramsNPCILIB.setKey("NPCILIB");
		paramsNPCILIB.setValue(upiGetAccounts.getNpclib());
		Parameters paramsRefId = new Parameters();
		paramsRefId.setKey("REFID");
		paramsRefId.setValue(upiGetAccounts.getRefid());
		Parameters paramsDeviceId = new Parameters();
		paramsDeviceId.setKey("DEVICEID");
		paramsDeviceId.setValue(upiGetAccounts.getDeviceid());
		Parameters paramsDt = new Parameters();
		paramsDt.setKey("DT");
		paramsDt.setValue(upiGetAccounts.getDt());
		Parameters paramsSession = new Parameters();
		paramsSession.setKey("SESSIONID");
		paramsSession.setValue(upiGetAccounts.getSessionid());
		Parameters paramsIP = new Parameters();
		paramsIP.setKey("IP");
		paramsIP.setValue(upiGetAccounts.getIp());
		Parameters paramsGEOC = new Parameters();
		paramsGEOC.setKey("GEOC");
		paramsGEOC.setValue(upiGetAccounts.getGeoc());
		Parameters paramsLOC = new Parameters();
		paramsLOC.setKey("LOC");
		paramsLOC.setValue(upiGetAccounts.getLoc());
		
		
		ArrayList<Parameters> param = new ArrayList<Parameters>();
		
		param.add(paramsGEOC);
		param.add(paramsSession);
		param.add(paramsDeviceId);
		param.add(paramsRefId);
		param.add(paramsCustomerid);
		param.add(paramsLOC);
		param.add(paramsIP);
		param.add(paramsDt);
		param.add(paramsNPCILIB);
		param.add(paramsVPAId);
		param.add(paramsIIN);
		
		Request request = new Request();
		request.setParams(param);
		request.setDeviceId(0);
		request.setInitiatorId("");
		request.setService("UPI_GetAccounts");

		
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


