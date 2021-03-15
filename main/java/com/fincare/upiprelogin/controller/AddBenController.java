package com.fincare.upiprelogin.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.fincare.upiprelogin.model.AddBen;
import com.fincare.upiprelogin.model.AddVPA;
import com.fincare.upiprelogin.service.AddBenService;
import com.fincare.upiprelogin.service.AddVPAService;

public class AddBenController {

	@Autowired
	private AddBenService addBenService;
	
	@PostMapping("/AddBen")
	public String getAddBen( @Valid @RequestBody AddBen addBen){
		
		String response=addBenService.getAddBen(addBen);
		
		return response;
		 
	}

}
