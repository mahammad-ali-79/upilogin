package com.fincare.upiprelogin.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.fincare.upiprelogin.model.Response;
import com.fincare.upiprelogin.model.UPIAuthCollect;
import com.fincare.upiprelogin.model.UPIRejectCollect;
import com.fincare.upiprelogin.service.ResponseService;
import com.fincare.upiprelogin.service.UPIAuthCollectService;
import com.fincare.upiprelogin.service.UPIRejectCollectService;

public class UPIRejectCollectController {
	
	@Autowired
	private UPIRejectCollectService upiRejectCollectService;
	@Autowired
	private ResponseService responseService;
	@PostMapping("/UPIRejectCollect")
	public Response getUPIRejectCollect( @Valid @RequestBody UPIRejectCollect upiRejectCollect){
		 Logger sdIp = LoggerFactory.getLogger("UPI SD Address");
		 sdIp.info("Source and Destination IP Address",responseService.getIpAddress());
		Response response=upiRejectCollectService.getUPIRejectCollect(upiRejectCollect);
		
		return response;
		 
	}

}
