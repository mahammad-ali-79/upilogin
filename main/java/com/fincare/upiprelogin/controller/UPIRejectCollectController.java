package com.fincare.upiprelogin.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.fincare.upiprelogin.model.UPIAuthCollect;
import com.fincare.upiprelogin.model.UPIRejectCollect;
import com.fincare.upiprelogin.service.UPIAuthCollectService;
import com.fincare.upiprelogin.service.UPIRejectCollectService;

public class UPIRejectCollectController {
	
	@Autowired
	private UPIRejectCollectService upiRejectCollectService;
	
	@PostMapping("/UPIRejectCollect")
	public String getUPIRejectCollect( @Valid @RequestBody UPIRejectCollect upiRejectCollect){
		
		String response=upiRejectCollectService.getUPIRejectCollect(upiRejectCollect);
		
		return response;
		 
	}

}
