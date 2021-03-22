package com.fincare.upiprelogin.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.fincare.upiprelogin.model.PendingCollect;
import com.fincare.upiprelogin.model.Response;
import com.fincare.upiprelogin.model.UPICollect;
import com.fincare.upiprelogin.service.PendingCollectService;
import com.fincare.upiprelogin.service.ResponseService;
import com.fincare.upiprelogin.service.UPICollectService;

public class PendingCollectController {
	

	@Autowired
	private PendingCollectService pendingCollectService;
	@Autowired
	private ResponseService responseService;
	@PostMapping("/PendingCollect")
	public Response getPendingCollect( @Valid @RequestBody PendingCollect pendingCollect){
		 Logger sdIp = LoggerFactory.getLogger("UPI SD Address");
		 sdIp.info("Source and Destination IP Address",responseService.getIpAddress());
		Response response=pendingCollectService.getPendingCollect(pendingCollect);
		
		return response;
		 
	}

}
