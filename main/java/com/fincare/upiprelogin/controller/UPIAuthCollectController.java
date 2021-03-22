package com.fincare.upiprelogin.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.fincare.upiprelogin.model.GetMasterData;
import com.fincare.upiprelogin.model.Response;
import com.fincare.upiprelogin.model.UPIAuthCollect;
import com.fincare.upiprelogin.service.GetMasterDataService;
import com.fincare.upiprelogin.service.ResponseService;
import com.fincare.upiprelogin.service.UPIAuthCollectService;

public class UPIAuthCollectController {
	
	@Autowired
	private UPIAuthCollectService upiCollectService;
	@Autowired
	private ResponseService responseService;
	@PostMapping("/UPIAuthCollect")
	public Response getUPIAuthCollect( @Valid @RequestBody UPIAuthCollect upiAuthCollect){
		 Logger sdIp = LoggerFactory.getLogger("UPI SD Address");
		 sdIp.info("Source and Destination IP Address",responseService.getIpAddress());
		Response response=upiCollectService.getUPIAuthCollect(upiAuthCollect);
		
		return response;
		 
	}

}
