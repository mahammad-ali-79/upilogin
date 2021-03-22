package com.fincare.upiprelogin.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.fincare.upiprelogin.model.MobileLogin;
import com.fincare.upiprelogin.model.Response;
import com.fincare.upiprelogin.service.MobileLoginService;
import com.fincare.upiprelogin.service.ResponseService;

@RestController
@RequestMapping("/upiprelogin")
public class MobileLoginController {
	
	@Autowired
	private MobileLoginService mobileLoginService;
	@Autowired
	private ResponseService responseService;
	@PostMapping("/mobileLogin")
	public Response getMobileLogin( @Valid @RequestBody MobileLogin mobileLogin){
		 Logger sdIp = LoggerFactory.getLogger("UPI SD Address");
		 sdIp.info("Source and Destination IP Address",responseService.getIpAddress());
		Response response=mobileLoginService.getMobileLogin(mobileLogin);
		
		return response;
		
	}


}
