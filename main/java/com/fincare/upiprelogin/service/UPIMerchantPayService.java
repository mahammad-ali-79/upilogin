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
import com.fincare.upiprelogin.model.UPIMerchantPay;

@Service
public class UPIMerchantPayService {
	
	@Autowired
	private UpiProxy upiProxy;
	@Value("${upi.logType:Error}")
	private String errorLog;
	 private  final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	public Response getUPIMerchantPay(UPIMerchantPay upiMerchantPay) {
		
		Map<String, String> headers = new HashMap<>();
		headers.put("Content-Type", "application/json"); 
		
		Parameters paramsVPAId = new Parameters();
		paramsVPAId.setKey("VPAID");
		paramsVPAId.setValue(upiMerchantPay.getVpaid());
		Parameters paramsVPAFDId = new Parameters();
		paramsVPAFDId.setKey("VPAID");
		paramsVPAFDId.setValue(upiMerchantPay.getVpafdid());
		Parameters paramsNarration = new Parameters();
		paramsNarration.setKey("NARRATION");
		paramsNarration.setValue(upiMerchantPay.getNarration());
		Parameters paramsAmt = new Parameters();
		paramsAmt.setKey("AMT");
		paramsAmt.setValue(upiMerchantPay.getAmt());
		Parameters paramsCustId = new Parameters();
		paramsCustId.setKey("CUSTID");
		paramsCustId.setValue(upiMerchantPay.getCustid());
		Parameters paramsNpciLib = new Parameters();
		paramsNpciLib.setKey("NPCILIB");
		paramsNpciLib.setValue(upiMerchantPay.getNpcilib());
		Parameters paramsDeviceImeiId = new Parameters();
		paramsDeviceImeiId.setKey("deviceIMEIId");
		paramsDeviceImeiId.setValue(upiMerchantPay.getDeviceimeiid());
		Parameters paramsTPin = new Parameters();
		paramsTPin.setKey("TPin");
		paramsTPin.setValue(upiMerchantPay.getTpin());
		Parameters paramsTxnId = new Parameters();
		paramsTxnId.setKey("txnId");
		paramsTxnId.setValue(upiMerchantPay.getTxnid());
		Parameters paramsMpin = new Parameters();
		paramsMpin.setKey("MPin");
		paramsMpin.setValue(upiMerchantPay.getMpin());
		Parameters paramsPayees = new Parameters();
		paramsPayees.setKey("PAYEES");
		paramsPayees.setValue(upiMerchantPay.getPayees());
		Parameters paramsRefId = new Parameters();
		paramsRefId.setKey("REFID");
		paramsRefId.setValue(upiMerchantPay.getRefid());
		Parameters paramsRefUrl = new Parameters();
		paramsRefUrl.setKey("REFURL");
		paramsRefUrl.setValue(upiMerchantPay.getRefurl());
		Parameters paramsOrderId = new Parameters();
		paramsOrderId.setKey("ORDERID");
		paramsOrderId.setValue(upiMerchantPay.getOrderid());
		Parameters paramsDeviceId = new Parameters();
		paramsDeviceId.setKey("DEVICEID");
		paramsDeviceId.setValue(upiMerchantPay.getDeviceid());
		Parameters paramsIP = new Parameters();
		paramsIP.setKey("IP");
		paramsIP.setValue(upiMerchantPay.getIp());
		Parameters paramsGeoc = new Parameters();
		paramsGeoc.setKey("GEOC");
		paramsGeoc.setValue(upiMerchantPay.getGeoc());
		Parameters paramsLoc = new Parameters();
		paramsLoc.setKey("LOC");
		paramsLoc.setValue(upiMerchantPay.getLoc());
		Parameters paramsSessionId = new Parameters();
		paramsSessionId.setKey("SESSIONID");
		paramsSessionId.setValue(upiMerchantPay.getSessionid());
		Parameters paramsDt = new Parameters();
		paramsDt.setKey("DT");
		paramsDt.setValue(upiMerchantPay.getDt());
		Parameters paramsMCode = new Parameters();
		paramsMCode.setKey("MCCCODE");
		paramsMCode.setValue(upiMerchantPay.getMcccode());
		
		
		ArrayList<Parameters> param = new ArrayList<Parameters>();
		
		param.add(paramsSessionId);
		param.add(paramsGeoc);
		param.add(paramsDeviceId);
		param.add(paramsOrderId);
		param.add(paramsRefUrl);
		param.add(paramsRefId);
		param.add(paramsPayees);
		param.add(paramsDeviceImeiId);
		param.add(paramsDt);
		param.add(paramsLoc);
		param.add(paramsIP);
		param.add(paramsMpin);
		param.add(paramsVPAId);
		param.add(paramsVPAFDId);
		param.add(paramsNarration);
		param.add(paramsAmt);
		param.add(paramsCustId);
		param.add(paramsNpciLib);
		param.add(paramsTPin);
		param.add(paramsTxnId);
		
		
		Common common = new Common();

		Request request = new Request();
		request.setParams(param);
		request.setDeviceId(0);
		request.setInitiatorId("");
		request.setService("UPI_MerchantPay");

		
		
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
