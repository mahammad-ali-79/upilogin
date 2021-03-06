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
import com.fincare.upiprelogin.model.UPIMerchantPay;

@Service
public class UPIMerchantPayService {
	
	@Autowired
	private UpiProxy upiProxy;
	@Autowired
	private ResponseService responseService;
	@Autowired
	private HttpServletRequest clientIp;
	
	
	public String getUPIMerchantPay(UPIMerchantPay upiMerchantPay) {
		
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
