package com.fincare.upiprelogin.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.fincare.upiprelogin.model.GetBlockedVPAList;
import com.fincare.upiprelogin.model.RemoveFromSpam;
import com.fincare.upiprelogin.model.Response;
import com.fincare.upiprelogin.service.GetBlockedVPAListService;
import com.fincare.upiprelogin.service.RemoveFromSpamService;
import com.fincare.upiprelogin.service.ResponseService;

public class GetBlockedVPAListController {
	
	
	@Autowired
	private GetBlockedVPAListService getBlockedListService;
	@Autowired
	private ResponseService responseService;
	@PostMapping("/GetBlockedVPAList")
	public Response getBlockedVPAList( @Valid @RequestBody GetBlockedVPAList getBlockedVPAList){
		 Logger sdIp = LoggerFactory.getLogger("UPI SD Address");
		 sdIp.info("Source and Destination IP Address",responseService.getIpAddress());
		Response response=getBlockedListService.getBlockedVPA(getBlockedVPAList);
		
		return response;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


}
