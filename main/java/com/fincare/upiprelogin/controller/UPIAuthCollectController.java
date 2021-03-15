package com.fincare.upiprelogin.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.fincare.upiprelogin.model.GetMasterData;
import com.fincare.upiprelogin.model.UPIAuthCollect;
import com.fincare.upiprelogin.service.GetMasterDataService;
import com.fincare.upiprelogin.service.UPIAuthCollectService;

public class UPIAuthCollectController {
	
	@Autowired
	private UPIAuthCollectService upiCollectService;
	
	@PostMapping("/UPIAuthCollect")
	public String getUPIAuthCollect( @Valid @RequestBody UPIAuthCollect upiAuthCollect){
		
		String response=upiCollectService.getUPIAuthCollect(upiAuthCollect);
		
		return response;
		 
	}

}
