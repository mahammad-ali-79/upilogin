package com.fincare.upiprelogin.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.fincare.upiprelogin.model.GetBlockedVPAList;
import com.fincare.upiprelogin.model.RemoveFromSpam;
import com.fincare.upiprelogin.service.GetBlockedVPAListService;
import com.fincare.upiprelogin.service.RemoveFromSpamService;

public class GetBlockedVPAListController {
	
	
	@Autowired
	private GetBlockedVPAListService getBlockedListService;
	
	@PostMapping("/GetBlockedVPAList")
	public String getBlockedVPAList( @Valid @RequestBody GetBlockedVPAList getBlockedVPAList){
		
		String response=getBlockedListService.getBlockedVPA(getBlockedVPAList);
		
		return response;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


}
