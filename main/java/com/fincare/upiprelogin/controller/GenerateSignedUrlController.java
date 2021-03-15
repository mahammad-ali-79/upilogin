package com.fincare.upiprelogin.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.fincare.upiprelogin.model.GenerateSignedUrl;
import com.fincare.upiprelogin.model.MandateCollect;
import com.fincare.upiprelogin.service.GenerateSignedUrlService;
import com.fincare.upiprelogin.service.MandateCollectService;

public class GenerateSignedUrlController {
	
	@Autowired
	private GenerateSignedUrlService generateSignedUrlService;
	
	@PostMapping("/GenerateSignedUrl")
	public String getGenerateSignedUrl( @Valid @RequestBody GenerateSignedUrl generateSignedUrl){
		
		String response=generateSignedUrlService.getSignedUrl(generateSignedUrl);
		
		return response;
	}

}
