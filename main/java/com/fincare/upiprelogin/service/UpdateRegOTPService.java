package com.fincare.upiprelogin.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.fincare.upiprelogin.model.Common;
import com.fincare.upiprelogin.model.Parameters;
import com.fincare.upiprelogin.model.Request;
import com.fincare.upiprelogin.model.UpdateRegOTP;

public class UpdateRegOTPService {
	

	@Autowired
	private UpiProxy upiProxy;
	
	public String getUpdateRegOTP(UpdateRegOTP updateRegOTP) {
		
		Map<String, String> headers = new HashMap<>();
		headers.put("Content-Type", "application/json");
		Parameters paramsOtpToken = new Parameters();
		paramsOtpToken.setKey("OTPToken");
		paramsOtpToken.setValue(updateRegOTP.getOtptoken());
		Parameters userregid = new Parameters();
		userregid.setKey("userRegID");
		userregid.setValue(updateRegOTP.getUserregid());
		Parameters customerid = new Parameters();
		customerid.setKey("CUSTOMERID");
		customerid.setValue(updateRegOTP.getCustomerid());
		Parameters paramsPassword = new Parameters();
		paramsPassword.setKey("password");
		paramsPassword.setValue(updateRegOTP.getPassword());
		Parameters paramsSecans1 = new Parameters();
		paramsSecans1.setKey("SECANS1");
		paramsSecans1.setValue(updateRegOTP.getImei());
		Parameters paramsSecans2 = new Parameters();
		paramsSecans2.setKey("SECANS2");
		paramsSecans2.setValue(updateRegOTP.getImei());
		Parameters paramsImei = new Parameters();
		paramsImei.setKey("imei");
		paramsImei.setValue(updateRegOTP.getImei());
		Parameters paramsPlatform = new Parameters();
		paramsPlatform.setKey("platform");
		paramsPlatform.setValue(updateRegOTP.getPlatform());
		Parameters paramsDeviceMake = new Parameters();
		paramsDeviceMake.setKey("devicemake");
		paramsDeviceMake.setValue(updateRegOTP.getDevicemake());
		Parameters paramsDeviceModel = new Parameters();
		paramsDeviceModel.setKey("devicemodel");
		paramsDeviceModel.setValue(updateRegOTP.getDevicemodel());
		Parameters paramsScreenWidth = new Parameters();
		paramsScreenWidth.setKey("screenwidth");
		paramsScreenWidth.setValue(updateRegOTP.getScreenwidth());
		Parameters paramsScreenHeight = new Parameters();
		paramsScreenHeight.setKey("screenheight");
		paramsScreenHeight.setValue(updateRegOTP.getScreenheight());
		Parameters paramsOsVersion = new Parameters();
		paramsOsVersion.setKey("osversion");
		paramsOsVersion.setValue(updateRegOTP.getOsversion());
		Parameters paramsPushToken = new Parameters();
		paramsPushToken.setKey("pushtoken");
		paramsPushToken.setValue(updateRegOTP.getPushtoken());
		Parameters paramsDt = new Parameters();
		paramsDt.setKey("dt");
		paramsDt.setValue(updateRegOTP.getDt());
		Parameters appVersion= new Parameters();
		appVersion.setKey("APPVERSION");
		appVersion.setValue(updateRegOTP.getAppversion());
		Parameters mailotp= new Parameters();
		mailotp.setKey("MAILOTP");
		int mOtp=updateRegOTP.getMailotp();
		mailotp.setValue(String.valueOf(mOtp));
		Parameters otp= new Parameters();
		otp.setKey("APPVERSION");
		otp.setValue(String.valueOf(updateRegOTP.getOtp()));
		
		ArrayList<Parameters> param = new ArrayList<Parameters>();
		param.add(paramsOtpToken);
		param.add(userregid);
		param.add(paramsPushToken);
		param.add(paramsOsVersion);
		param.add(paramsScreenHeight);
		param.add(paramsScreenWidth);
		param.add(paramsDeviceModel);
		param.add(paramsDeviceMake);
		param.add(paramsImei);
		param.add(paramsSecans2);
		param.add(paramsSecans1);
		param.add(customerid);
		param.add(userregid);
		param.add(paramsPlatform);
		param.add(paramsPassword);
		param.add(paramsDt);
		param.add(appVersion);
		
		Request request = new Request();
		request.setParams(param);
		request.setDeviceId(0);
		request.setInitiatorId("");
		request.setService("UpdateRegViaOTP");

		
		Common common = new Common();

		common.setRequest(request);
		System.out.println(common.toString());
		String response = upiProxy.getResponse(headers, common);

		return response;
	}


}
