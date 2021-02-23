package com.fincare.upiprelogin.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.fincare.upiprelogin.model.Common;
import com.fincare.upiprelogin.model.Parameters;
import com.fincare.upiprelogin.model.Request;
import com.fincare.upiprelogin.model.UpdateReg;

public class UpdateRegService {

	
	@Autowired
	private UpiProxy upiProxy;
	
	public String getUpdateReg(UpdateReg updateReg) {
		
		Map<String, String> headers = new HashMap<>();
		headers.put("Content-Type", "application/json");
		Parameters paramsOtpToken = new Parameters();
		paramsOtpToken.setKey("OTPToken");
		paramsOtpToken.setValue(updateReg.getOtptoken());
		Parameters userregid = new Parameters();
		userregid.setKey("userRegID");
		userregid.setValue(updateReg.getUserregid());
		Parameters customerid = new Parameters();
		customerid.setKey("CUSTOMERID");
		customerid.setValue(updateReg.getCustomerid());
		Parameters paramsPassword = new Parameters();
		paramsPassword.setKey("password");
		paramsPassword.setValue(updateReg.getPassword());
		Parameters paramsSecans1 = new Parameters();
		paramsSecans1.setKey("SECANS1");
		paramsSecans1.setValue(updateReg.getImei());
		Parameters paramsSecans2 = new Parameters();
		paramsSecans2.setKey("SECANS2");
		paramsSecans2.setValue(updateReg.getImei());
		Parameters paramsImei = new Parameters();
		paramsImei.setKey("imei");
		paramsImei.setValue(updateReg.getImei());
		Parameters paramsPlatform = new Parameters();
		paramsPlatform.setKey("platform");
		paramsPlatform.setValue(updateReg.getPlatform());
		Parameters paramsDeviceMake = new Parameters();
		paramsDeviceMake.setKey("devicemake");
		paramsDeviceMake.setValue(updateReg.getDevicemake());
		Parameters paramsDeviceModel = new Parameters();
		paramsDeviceModel.setKey("devicemodel");
		paramsDeviceModel.setValue(updateReg.getDevicemodel());
		Parameters paramsScreenWidth = new Parameters();
		paramsScreenWidth.setKey("screenwidth");
		paramsScreenWidth.setValue(updateReg.getScreenwidth());
		Parameters paramsScreenHeight = new Parameters();
		paramsScreenHeight.setKey("screenheight");
		paramsScreenHeight.setValue(updateReg.getScreenheight());
		Parameters paramsOsVersion = new Parameters();
		paramsOsVersion.setKey("osversion");
		paramsOsVersion.setValue(updateReg.getOsversion());
		Parameters paramsPushToken = new Parameters();
		paramsPushToken.setKey("pushtoken");
		paramsPushToken.setValue(updateReg.getPushtoken());
		Parameters paramsDt = new Parameters();
		paramsDt.setKey("dt");
		paramsDt.setValue(updateReg.getDt());
		Parameters appVersion= new Parameters();
		appVersion.setKey("APPVERSION");
		appVersion.setValue(updateReg.getAppversion());
		
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
		request.setService("UpdateReg");

		
		Common common = new Common();

		common.setRequest(request);
		System.out.println(common.toString());
		String response = upiProxy.getResponse(headers, common);

		return response;
	}

}
