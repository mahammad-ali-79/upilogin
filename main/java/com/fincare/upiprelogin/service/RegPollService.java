package com.fincare.upiprelogin.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fincare.upiprelogin.model.Common;
import com.fincare.upiprelogin.model.Parameters;
import com.fincare.upiprelogin.model.RegPoll;
import com.fincare.upiprelogin.model.Request;

@Service
public class RegPollService {
	
	
	@Autowired
	private UpiProxy upiProxy;
	
	public String getRegPoll(RegPoll regPoll) {
		
		Map<String, String> headers = new HashMap<>();
		headers.put("Content-Type", "application/json");
		Parameters paramsOtpToken = new Parameters();
		paramsOtpToken.setKey("OTPToken");
		paramsOtpToken.setValue(regPoll.getOtptoken());
		Parameters sendEmailOtp = new Parameters();
		sendEmailOtp.setKey("SENDEMAILOTP");
		sendEmailOtp.setValue(regPoll.getSendemailotp());
		Parameters dt= new Parameters();
		dt.setKey("DT");
		dt.setValue(regPoll.getDt());
		Parameters appVersion= new Parameters();
		appVersion.setKey("APPVERSION");
		appVersion.setValue(regPoll.getAppversion());
		
		ArrayList<Parameters> param = new ArrayList<Parameters>();
		param.add(paramsOtpToken);
		param.add(sendEmailOtp);
		param.add(dt);
		param.add(appVersion);
		
		Request request = new Request();
		request.setParams(param);
		request.setDeviceId(0);
		request.setInitiatorId("");
		request.setService("RegPoll");

		
		Common common = new Common();

		common.setRequest(request);
		System.out.println(common.toString());
		String response = upiProxy.getResponse(headers, common);

		return response;
	}

}
