package com.fincare.upiprelogin.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fincare.upiprelogin.model.ForgotPassword;
import com.fincare.upiprelogin.service.ForgotPasswordService;

@RestController
@RequestMapping("/upiprelogin")
public class ForgotPasswordController {
	
	
	@Autowired
	private ForgotPasswordService forgotPasswordService;
	
	@PostMapping("/forgotPassword")
	public String getForgotPassword( @Valid @RequestBody ForgotPassword forgotpassword){
		
		String response=forgotPasswordService.getForgotPassword(forgotpassword);
		
		return response;
		
	}

}
