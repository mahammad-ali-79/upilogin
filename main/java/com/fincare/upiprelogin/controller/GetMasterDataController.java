package com.fincare.upiprelogin.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.fincare.upiprelogin.model.GetAcProv;
import com.fincare.upiprelogin.model.GetMasterData;
import com.fincare.upiprelogin.model.Response;
import com.fincare.upiprelogin.service.GetAcProvService;
import com.fincare.upiprelogin.service.GetMasterDataService;
import com.fincare.upiprelogin.service.ResponseService;

public class GetMasterDataController {
	
	

	@Autowired
	private GetMasterDataService getMasterDataService;
	@Autowired
	private ResponseService responseService;
	@PostMapping("/GetMasters")
	public Response getMasterData( @Valid @RequestBody GetMasterData getMasterData){
		 Logger sdIp = LoggerFactory.getLogger("UPI SD Address");
		 sdIp.info("Source and Destination IP Address",responseService.getIpAddress());
		Response response=getMasterDataService.getMasterData(getMasterData);
		
		return response;
		 
	}

}
