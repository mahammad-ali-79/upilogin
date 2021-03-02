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
import com.fincare.upiprelogin.model.UPIMobileReg;

@Service
public class UPIMobileRegService {
	
	

	@Autowired
	private UpiProxy upiProxy;
	@Autowired
	private ResponseService responseService;
	@Autowired
	private HttpServletRequest clientIp;
	
	
	public String getUPIMobileReg(UPIMobileReg upiMobileReg) {
		
		Map<String, String> headers = new HashMap<>();
		headers.put("Content-Type", "application/json");
		Parameters paramsCustomerid = new Parameters();
		paramsCustomerid.setKey("CUSTID");
		paramsCustomerid.setValue(upiMobileReg.getCustid());
		Parameters paramsVPAId = new Parameters();
		paramsVPAId.setKey("VPAFDID");
		paramsVPAId.setValue(upiMobileReg.getVpafdid());
		Parameters paramsVPA = new Parameters();
		paramsVPA.setKey("VPAID");
		paramsVPA.setValue(upiMobileReg.getVpaid());
		Parameters paramsTxnId = new Parameters();
		paramsTxnId.setKey("TXNID");
		paramsTxnId.setValue(upiMobileReg.getTxnid());
		Parameters paramsDeviceImeiId = new Parameters();
		paramsDeviceImeiId.setKey("DEVICEIMEIID");
		paramsDeviceImeiId.setValue(upiMobileReg.getDeviceimeiid());
		Parameters paramsRefId = new Parameters();
		paramsRefId.setKey("REFID");
		paramsRefId.setValue(upiMobileReg.getRefid());
		Parameters paramsDeviceId = new Parameters();
		paramsDeviceId.setKey("DEVICEID");
		paramsDeviceId.setValue(upiMobileReg.getDeviceid());
		Parameters paramsNpciLibOtp = new Parameters();
		paramsNpciLibOtp.setKey("NPCILIBOTP");
		paramsNpciLibOtp.setValue(upiMobileReg.getNpcilibotp());
		Parameters paramsNpciLibPin = new Parameters();
		paramsNpciLibPin.setKey("NPCILIBPIN");
		paramsNpciLibPin.setValue(upiMobileReg.getNpcilibpin());
		Parameters paramsNpciLibAtmPin = new Parameters();
		paramsNpciLibAtmPin.setKey("NPCILIBATMPIN");
		paramsNpciLibAtmPin.setValue(upiMobileReg.getNpcilibatmpin());
		Parameters paramsAcno = new Parameters();
		paramsAcno.setKey("ACNO");
		paramsAcno.setValue(upiMobileReg.getAcno());
		Parameters paramsIfsc = new Parameters();
		paramsIfsc.setKey("IFSC");
		paramsIfsc.setValue(upiMobileReg.getIfsc());
		Parameters paramsCardno = new Parameters();
		paramsCardno.setKey("CARDNO");
		paramsCardno.setValue(upiMobileReg.getCardno());
		Parameters paramsCardExp = new Parameters();
		paramsCardExp.setKey("CARDEXP");
		paramsCardno.setValue(upiMobileReg.getCardexp());
		Parameters paramsIP = new Parameters();
		paramsIP.setKey("IP");
		paramsIP.setValue(upiMobileReg.getIp());
		Parameters paramsGeoc = new Parameters();
		paramsGeoc.setKey("GEOC");
		paramsGeoc.setValue(upiMobileReg.getGeoc());
		Parameters paramsLoc = new Parameters();
		paramsLoc.setKey("LOC");
		paramsLoc.setValue(upiMobileReg.getLoc());
		Parameters paramsSessionId = new Parameters();
		paramsSessionId.setKey("SESSIONID");
		paramsSessionId.setValue(upiMobileReg.getSessionid());
		Parameters paramsDt = new Parameters();
		paramsDt.setKey("DT");
		paramsDt.setValue(upiMobileReg.getDt());
		
		
		
		ArrayList<Parameters> param = new ArrayList<Parameters>();
		
		param.add(paramsSessionId);
		param.add(paramsGeoc);
		param.add(paramsCardExp);
		param.add(paramsDeviceId);
		param.add(paramsRefId);
		param.add(paramsDeviceImeiId);
		param.add(paramsCustomerid);
		param.add(paramsDt);
		param.add(paramsLoc);
		param.add(paramsIP);
		param.add(paramsCardno);
		param.add(paramsIfsc);
		param.add(paramsVPAId);
		param.add(paramsVPA);
		param.add(paramsTxnId);
		param.add(paramsNpciLibOtp);
		param.add(paramsNpciLibPin);
		param.add(paramsNpciLibAtmPin);
		param.add(paramsAcno);
		
		
		Request request = new Request();
		request.setParams(param);
		request.setDeviceId(0);
		request.setInitiatorId("");
		request.setService("UPI_MobReg");

		
		Common common = new Common();

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
