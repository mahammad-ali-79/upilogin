package com.fincare.upiprelogin.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fincare.upiprelogin.model.ForgotPassword;
import com.fincare.upiprelogin.model.Response;
import com.fincare.upiprelogin.service.ForgotPasswordService;
import com.fincare.upiprelogin.service.ResponseService;

@RestController
@RequestMapping("/upiprelogin")
public class ForgotPasswordController {
	
	
	@Autowired
	private ForgotPasswordService forgotPasswordService;
	@Autowired
	private ResponseService responseService;
	@PostMapping("/forgotPassword")
	public Response getForgotPassword( @Valid @RequestBody ForgotPassword forgotpassword){
		 Logger sdIp = LoggerFactory.getLogger("UPI SD Address");
		 sdIp.info("Source and Destination IP Address",responseService.getIpAddress());
		Response response=forgotPasswordService.getForgotPassword(forgotpassword);
		
		return response;
		
	}

}
