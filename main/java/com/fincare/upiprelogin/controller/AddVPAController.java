package com.fincare.upiprelogin.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.fincare.upiprelogin.model.AddVPA;
import com.fincare.upiprelogin.model.UPIValAdd;
import com.fincare.upiprelogin.service.AddVPAService;
import com.fincare.upiprelogin.service.UPIValAddService;

public class AddVPAController {
	

	@Autowired
	private AddVPAService addVPAService;
	
	@PostMapping("/AddVPA")
	public String getAddVPA( @Valid @RequestBody AddVPA addVPA){
		
		String response=addVPAService.getAddVpa(addVPA);
		
		return response;
		 
	}


}
