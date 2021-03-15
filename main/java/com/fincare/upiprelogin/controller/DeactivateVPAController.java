package com.fincare.upiprelogin.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.fincare.upiprelogin.model.CheckTxnStatus;
import com.fincare.upiprelogin.model.DeactivateVPA;
import com.fincare.upiprelogin.service.CheckTxnStatusService;
import com.fincare.upiprelogin.service.DeActivateVPAService;

public class DeactivateVPAController {
	
	
	@Autowired
	private DeActivateVPAService deactivateVPAService;
	
	@PostMapping("/DeactivateVPA")
	public String getDeactivateVPA( @Valid @RequestBody DeactivateVPA deactivateVPA){
		
		String response=deactivateVPAService.getDeactivateVPA(deactivateVPA);
		
		return response;
		 
	}


}
