package com.fincare.upiprelogin.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fincare.upiprelogin.model.CheckVPA;
import com.fincare.upiprelogin.service.CheckVPAService;


@RestController
@RequestMapping("/upiprelogin")
public class CheckVPAController {
	
	@Autowired
	private CheckVPAService checkVPAService;
	
	@PostMapping("/CheckVPA")
	public String getCheckVPA( @Valid @RequestBody CheckVPA checkVPA){
		
		String response=checkVPAService.getCheckVPA(checkVPA);
		
		return response;
		
	}
	

}
