package com.fincare.upiprelogin.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fincare.upiprelogin.model.Registration;
import com.fincare.upiprelogin.model.Parameters;
import com.fincare.upiprelogin.model.Common;
import com.fincare.upiprelogin.model.Request;

@Service
public class RegistrationService {

	@Autowired
	private UpiProxy upiProxy;
	@Autowired
	private ResponseService responseService;
	@Autowired
	private HttpServletRequest clientIp;
	
	public String getRegistration(Registration registration) {
		
		Map<String, String> headers = new HashMap<>();
		headers.put("Content-Type", "application/json");
		Parameters paramsOtpToken = new Parameters();
		paramsOtpToken.setKey("OTPToken");
		paramsOtpToken.setValue(registration.getOtptoken());
		Parameters paramsEmail = new Parameters();
		paramsEmail.setKey("EMAIL");
		paramsEmail.setValue(registration.getEmail());
		Parameters paramsUserRegId = new Parameters();
		paramsUserRegId.setKey("userRegID");
		paramsUserRegId.setValue(registration.getUserRegID());
		Parameters paramsMobile = new Parameters();
		paramsMobile.setKey("mobileno");
		paramsMobile.setValue("91"+registration.getMobileno());
		Parameters paramsName = new Parameters();
		paramsName.setKey("name");
		paramsName.setValue(registration.getName());
		Parameters paramsUsername = new Parameters();
		paramsUsername.setKey("username");
		paramsUsername.setValue(registration.getUsername());
		Parameters paramsPassword = new Parameters();
		paramsPassword.setKey("password");
		paramsPassword.setValue(registration.getPassword());
		Parameters paramsVpa = new Parameters();
		paramsVpa.setKey("vpa");
		paramsVpa.setValue(registration.getVpa());
		Parameters paramsSq1 = new Parameters();
		paramsSq1.setKey("sq1");
		paramsSq1.setValue(registration.getSq1());
		Parameters paramsSa1 = new Parameters();
		paramsSa1.setKey("sa1");
		paramsSa1.setValue(registration.getSa1());
		Parameters paramsSq2 = new Parameters();
		paramsSq2.setKey("sq2");
		paramsSq2.setValue(registration.getSq2());
		Parameters paramsSa2 = new Parameters();
		paramsSa2.setKey("sa2");
		paramsSa2.setValue(registration.getSa2());
		Parameters paramsImei = new Parameters();
		paramsImei.setKey("imei");
		paramsImei.setValue(registration.getImei());
		Parameters paramsPlatform = new Parameters();
		paramsPlatform.setKey("platform");
		paramsPlatform.setValue(registration.getPlatform());
		Parameters paramsDeviceMake = new Parameters();
		paramsDeviceMake.setKey("devicemake");
		paramsDeviceMake.setValue(registration.getDevicemake());
		Parameters paramsDeviceModel = new Parameters();
		paramsDeviceModel.setKey("devicemodel");
		paramsDeviceModel.setValue(registration.getDevicemodel());
		Parameters paramsScreenWidth = new Parameters();
		paramsScreenWidth.setKey("screenwidth");
		paramsScreenWidth.setValue(registration.getScreenwidth());
		Parameters paramsScreenHeight = new Parameters();
		paramsScreenHeight.setKey("screenheight");
		paramsScreenHeight.setValue(registration.getScreenheight());
		Parameters paramsOsVersion = new Parameters();
		paramsOsVersion.setKey("osversion");
		paramsOsVersion.setValue(registration.getOsversion());
		Parameters paramsPushToken = new Parameters();
		paramsPushToken.setKey("pushtoken");
		paramsPushToken.setValue(registration.getPushtoken());
		Parameters paramsDt = new Parameters();
		paramsDt.setKey("dt");
		paramsDt.setValue(registration.getDt());
		Parameters appVersion= new Parameters();
		appVersion.setKey("APPVERSION");
		appVersion.setValue(registration.getAppversion());
		
		
		ArrayList<Parameters> param = new ArrayList<Parameters>();
		param.add(paramsOtpToken);
		param.add(paramsEmail);
		param.add(paramsPushToken);
		param.add(paramsOsVersion);
		param.add(paramsScreenHeight);
		param.add(paramsScreenWidth);
		param.add(paramsDeviceModel);
		param.add(paramsDeviceMake);
		param.add(paramsImei);
		param.add(paramsUsername);
		param.add(paramsName);
		param.add(paramsMobile);
		param.add(paramsUserRegId);
		param.add(paramsDt);
		param.add(paramsPlatform);
		param.add(paramsSa2);
		param.add(paramsSq2);
		param.add(paramsSa1);
		param.add(paramsSq1);
		param.add(paramsVpa);
		param.add(paramsPassword);
		param.add(appVersion);
		

		Request request = new Request();
		request.setParams(param);
		request.setDeviceId(0);
		request.setInitiatorId("");
		request.setService("Registration");

		
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
