package com.fincare.upiprelogin.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.fincare.upiprelogin.model.CheckAppVersion;
import com.fincare.upiprelogin.model.Response;
import com.fincare.upiprelogin.model.VerifySignedUrl;
import com.fincare.upiprelogin.service.CheckAppVersionService;
import com.fincare.upiprelogin.service.ResponseService;
import com.fincare.upiprelogin.service.VerifySignedUrlService;

public class CheckAppVersionController {
	
	@Autowired
	private CheckAppVersionService checkAppVersionService;
	@Autowired
	private ResponseService responseService;
	@PostMapping("/CheckAppVersion")
	public Response getVerifySignedUrl( @Valid @RequestBody CheckAppVersion checkAppVersion){
		 Logger sdIp = LoggerFactory.getLogger("UPI SD Address");
		 sdIp.info("Source and Destination IP Address",responseService.getIpAddress());
		Response response=checkAppVersionService.getAppVersion(checkAppVersion);
		
		return response;
	}

}
