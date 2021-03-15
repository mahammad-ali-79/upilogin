package com.fincare.upiprelogin.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.fincare.upiprelogin.model.UPIRequestOTP;
import com.fincare.upiprelogin.model.UpdateEDI;
import com.fincare.upiprelogin.service.UPIRequestOtpService;
import com.fincare.upiprelogin.service.UpdateediService;

public class UPIRequestOTPController {
	
	@Autowired
	private UPIRequestOtpService upiRequestOtpService;
	
	@PostMapping("/UPIRequestOTP")
	public String getUPIRequestOtp( @Valid @RequestBody UPIRequestOTP upiRequestOtp){
		
		String response=upiRequestOtpService.getUpiRequestOtp(upiRequestOtp);
		
		return response;
		 
	}


}
