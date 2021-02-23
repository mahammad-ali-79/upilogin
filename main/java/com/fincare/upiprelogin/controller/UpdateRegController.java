package com.fincare.upiprelogin.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fincare.upiprelogin.model.UpdateReg;
import com.fincare.upiprelogin.service.UpdateRegService;


@RestController
@RequestMapping("/upiprelogin")
public class UpdateRegController {
	
	@Autowired 
	private UpdateRegService updateRegService;
	
	@PostMapping("/UpdateReg")
	public String getupdateReg( @Valid @RequestBody UpdateReg updateReg){
		
		String response=updateRegService.getUpdateReg(updateReg);
		
		return response;
		
	}

}
