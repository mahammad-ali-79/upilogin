package com.fincare.upiprelogin.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.fincare.upiprelogin.model.ChangePassword;
import com.fincare.upiprelogin.model.UPICollect;
import com.fincare.upiprelogin.service.ChangePasswordService;
import com.fincare.upiprelogin.service.UPICollectService;

public class UPICollectController {
	
	
	@Autowired
	private UPICollectService upiCollectService;
	
	@PostMapping("/UPICollect")
	public String getUPICollect( @Valid @RequestBody UPICollect upiCollect){
		
		String response=upiCollectService.getUPICollect(upiCollect);
		
		return response;
		 
	}

}
