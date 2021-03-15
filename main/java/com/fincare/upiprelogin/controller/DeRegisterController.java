package com.fincare.upiprelogin.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.fincare.upiprelogin.model.DeRegister;
import com.fincare.upiprelogin.model.UPIRejectCollect;
import com.fincare.upiprelogin.service.DeRegisterService;
import com.fincare.upiprelogin.service.UPIRejectCollectService;

public class DeRegisterController {
	
	@Autowired
	private DeRegisterService deRegisterService;
	
	@PostMapping("/DeRegister")
	public String getDeRegister( @Valid @RequestBody DeRegister deRegister){
		
		String response=deRegisterService.getDeregister(deRegister);
		
		return response;
		 
	}

}
