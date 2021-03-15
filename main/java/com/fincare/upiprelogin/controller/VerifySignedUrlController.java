package com.fincare.upiprelogin.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.fincare.upiprelogin.model.GenerateSignedUrl;
import com.fincare.upiprelogin.model.VerifySignedUrl;
import com.fincare.upiprelogin.service.GenerateSignedUrlService;
import com.fincare.upiprelogin.service.VerifySignedUrlService;

public class VerifySignedUrlController {
	
	
	@Autowired
	private VerifySignedUrlService verifySignedUrlService;
	
	@PostMapping("/VerifySignedUrl")
	public String getVerifySignedUrl( @Valid @RequestBody VerifySignedUrl verifySignedUrl){
		
		String response=verifySignedUrlService.getVerifyUrl(verifySignedUrl);
		
		return response;
	}


}
