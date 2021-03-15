package com.fincare.upiprelogin.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.fincare.upiprelogin.model.UPIMobileReg;
import com.fincare.upiprelogin.model.UpdateEDI;
import com.fincare.upiprelogin.service.UPIMobileRegService;
import com.fincare.upiprelogin.service.UpdateediService;

public class UpdateEDIController {
	
	@Autowired
	private UpdateediService updateEdiService;
	
	@PostMapping("/UpdateEDI")
	public String getUpdateEDI( @Valid @RequestBody UpdateEDI updateEdi){
		
		String response=updateEdiService.getUpdateEdi(updateEdi);
		
		return response;
		 
	}


}
