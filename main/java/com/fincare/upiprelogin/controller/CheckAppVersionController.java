package com.fincare.upiprelogin.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.fincare.upiprelogin.model.CheckAppVersion;
import com.fincare.upiprelogin.model.VerifySignedUrl;
import com.fincare.upiprelogin.service.CheckAppVersionService;
import com.fincare.upiprelogin.service.VerifySignedUrlService;

public class CheckAppVersionController {
	
	@Autowired
	private CheckAppVersionService checkAppVersionService;
	
	@PostMapping("/CheckAppVersion")
	public String getVerifySignedUrl( @Valid @RequestBody CheckAppVersion checkAppVersion){
		
		String response=checkAppVersionService.getAppVersion(checkAppVersion);
		
		return response;
	}

}
