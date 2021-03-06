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
import com.fincare.upiprelogin.model.MobileLogin;
import com.fincare.upiprelogin.model.Parameters;
import com.fincare.upiprelogin.model.Request;
import com.fincare.upiprelogin.model.Response;

@Service
public class MobileLoginService {
	
	@Autowired
	private UpiProxy upiProxy;
	@Value("${upi.logType:Error}")
	private String errorLog;
	 private  final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	
	public Response getMobileLogin(MobileLogin mobileLogin) {
		
		Map<String, String> headers = new HashMap<>();
		headers.put("Content-Type", "application/json");
		
		Parameters paramsPlatform = new Parameters();
		paramsPlatform.setKey("platform");
		paramsPlatform.setValue(mobileLogin.getPlatform());
		Parameters paramscustomerId = new Parameters();
		paramscustomerId.setKey("CUSTOMERID");
		paramscustomerId.setValue(mobileLogin.getCustomerid());
		Parameters paramsDeviceId = new Parameters();
		paramsDeviceId.setKey("DeviceId");
		paramsDeviceId.setValue(mobileLogin.getDeviceid());
		Parameters paramsPassword = new Parameters();
		paramsPassword.setKey("password");
		paramsPassword.setValue(mobileLogin.getPassword());
		Parameters paramsAppVersion = new Parameters();
		paramsAppVersion.setKey("APPVERSION");
		paramsAppVersion.setValue(mobileLogin.getAppversion());
		Parameters paramsValidatePassword = new Parameters();
		paramsValidatePassword.setKey("APPVERSION");
		paramsValidatePassword.setValue(mobileLogin.getValidatepassword());
		Parameters paramsSdk = new Parameters();
		paramsSdk.setKey("strSDKINT");
		paramsSdk.setValue(mobileLogin.getStrsdkint());
		Parameters paramsOsVersion = new Parameters();
		paramsOsVersion.setKey("osversion");
		paramsOsVersion.setValue(mobileLogin.getOsversion());
		Parameters paramsDt = new Parameters();
		paramsDt.setKey("dt");
		paramsDt.setValue(mobileLogin.getDt());
		ArrayList<Parameters> param = new ArrayList<Parameters>(); 
		
		param.add(paramsOsVersion);
		param.add(paramsValidatePassword);
		param.add(paramsAppVersion);
		param.add(paramsDeviceId);
		param.add(paramscustomerId);
		param.add(paramsDt);
		param.add(paramsSdk);
		param.add(paramsPassword);
		param.add(paramsPlatform);
		Request request = new Request();
		request.setParams(param);
		request.setDeviceId(0);
		request.setInitiatorId("");
		request.setService("MobileLogin");

		
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
