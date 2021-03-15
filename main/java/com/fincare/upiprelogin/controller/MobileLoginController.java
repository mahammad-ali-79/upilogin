package com.fincare.upiprelogin.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.fincare.upiprelogin.model.MobileLogin;
import com.fincare.upiprelogin.service.MobileLoginService;

@RestController
@RequestMapping("/upiprelogin")
public class MobileLoginController {
	
	@Autowired
	private MobileLoginService mobileLoginService;
	
	@PostMapping("/mobileLogin")
	public String getMobileLogin( @Valid @RequestBody MobileLogin mobileLogin){
		
		String response=mobileLoginService.getMobileLogin(mobileLogin);
		
		return response;
		
	}


}
