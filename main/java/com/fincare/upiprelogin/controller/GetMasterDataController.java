package com.fincare.upiprelogin.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.fincare.upiprelogin.model.GetAcProv;
import com.fincare.upiprelogin.model.GetMasterData;
import com.fincare.upiprelogin.service.GetAcProvService;
import com.fincare.upiprelogin.service.GetMasterDataService;

public class GetMasterDataController {
	
	

	@Autowired
	private GetMasterDataService getMasterDataService;
	
	@PostMapping("/GetMasters")
	public String getMasterData( @Valid @RequestBody GetMasterData getMasterData){
		
		String response=getMasterDataService.getMasterData(getMasterData);
		
		return response;
		 
	}

}
