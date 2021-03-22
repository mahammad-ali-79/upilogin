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
import com.fincare.upiprelogin.model.ForgotPassword;
import com.fincare.upiprelogin.model.Parameters;
import com.fincare.upiprelogin.model.Request;
import com.fincare.upiprelogin.model.Response;


@Service
public class ForgotPasswordService {
	
	@Autowired
	private UpiProxy upiProxy;
	@Value("${upi.logType:Error}")
	private String errorLog;
	 private  final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	
	
	public Response getForgotPassword(ForgotPassword forgotPassword) {
		Map<String, String> headers = new HashMap<>();
		headers.put("Content-Type", "application/json");
		Parameters paramsOtpToken = new Parameters();
		paramsOtpToken.setKey("OTPToken");
		paramsOtpToken.setValue(forgotPassword.getOtptoken());
		Parameters paramsUserRegId = new Parameters();
		paramsUserRegId.setKey("userRegID");
		paramsUserRegId.setValue(forgotPassword.getUserregid());
		Parameters paramscustomerId = new Parameters();
		paramscustomerId.setKey("CUSTOMERID");
		paramscustomerId.setValue(forgotPassword.getCustomerid());
		Parameters paramsPassword = new Parameters();
		paramsPassword.setKey("password");
		paramsPassword.setValue(forgotPassword.getPassword());
		Parameters paramsOtp = new Parameters();
		paramsOtp.setKey("OTP");
		paramsOtp.setValue(forgotPassword.getOtp());
		Parameters paramsMailOtp = new Parameters();
		paramsMailOtp.setKey("MAILOTP");
		paramsMailOtp.setValue(forgotPassword.getMailotp());
		Parameters paramsSecans1 = new Parameters();
		paramsSecans1.setKey("SECANS1");
		paramsSecans1.setValue(forgotPassword.getImei());
		Parameters paramsSecans2 = new Parameters();
		paramsSecans2.setKey("SECANS2");
		paramsSecans2.setValue(forgotPassword.getImei());
		Parameters paramsImei = new Parameters();
		paramsImei.setKey("imei");
		paramsImei.setValue(forgotPassword.getImei());
		Parameters paramsPlatform = new Parameters();
		paramsPlatform.setKey("platform");
		paramsPlatform.setValue(forgotPassword.getPlatform());
		Parameters paramsDeviceMake = new Parameters();
		paramsDeviceMake.setKey("devicemake");
		paramsDeviceMake.setValue(forgotPassword.getDevicemake());
		Parameters paramsDeviceModel = new Parameters();
		paramsDeviceModel.setKey("devicemodel");
		paramsDeviceModel.setValue(forgotPassword.getDevicemodel());
		Parameters paramsScreenWidth = new Parameters();
		paramsScreenWidth.setKey("screenwidth");
		paramsScreenWidth.setValue(forgotPassword.getScreenwidth());
		Parameters paramsScreenHeight = new Parameters();
		paramsScreenHeight.setKey("screenheight");
		paramsScreenHeight.setValue(forgotPassword.getScreenheight());
		Parameters paramsOsVersion = new Parameters();
		paramsOsVersion.setKey("osversion");
		paramsOsVersion.setValue(forgotPassword.getOsversion());
		Parameters paramsPushToken = new Parameters();
		paramsPushToken.setKey("pushtoken");
		paramsPushToken.setValue(forgotPassword.getPushtoken());
		Parameters paramsDt = new Parameters();
		paramsDt.setKey("dt");
		paramsDt.setValue(forgotPassword.getDt());
		
		ArrayList<Parameters> param = new ArrayList<Parameters>();
		param.add(paramsOtpToken);
		param.add(paramsUserRegId);
		param.add(paramsPushToken);
		param.add(paramsOsVersion);
		param.add(paramsScreenHeight);
		param.add(paramsScreenWidth);
		param.add(paramsDeviceModel);
		param.add(paramsDeviceMake);
		param.add(paramsImei);
		param.add(paramsSecans2);
		param.add(paramsSecans1);
		param.add(paramscustomerId);
		param.add(paramsPlatform);
		param.add(paramsPassword);
		param.add(paramsDt);
		param.add(paramsMailOtp);
		param.add(paramsOtp);
		
		Request request = new Request();
		request.setParams(param);
		request.setDeviceId(0);
		request.setInitiatorId("");
		request.setService("ForgotPassword");

		
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
