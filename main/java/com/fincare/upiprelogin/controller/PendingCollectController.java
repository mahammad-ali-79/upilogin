package com.fincare.upiprelogin.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.fincare.upiprelogin.model.PendingCollect;
import com.fincare.upiprelogin.model.UPICollect;
import com.fincare.upiprelogin.service.PendingCollectService;
import com.fincare.upiprelogin.service.UPICollectService;

public class PendingCollectController {
	

	@Autowired
	private PendingCollectService pendingCollectService;
	
	@PostMapping("/PendingCollect")
	public String getPendingCollect( @Valid @RequestBody PendingCollect pendingCollect){
		
		String response=pendingCollectService.getPendingCollect(pendingCollect);
		
		return response;
		 
	}

}
