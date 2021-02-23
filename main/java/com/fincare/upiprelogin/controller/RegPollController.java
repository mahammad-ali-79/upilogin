package com.fincare.upiprelogin.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fincare.upiprelogin.model.RegPoll;
import com.fincare.upiprelogin.service.RegPollService;

@RestController
@RequestMapping("/upiprelogin")
public class RegPollController {
	
	@Autowired 
	private RegPollService regPollService;
	
	@PostMapping("/RegPoll")
	public String getRegPoll( @Valid @RequestBody RegPoll regPoll){
		
		String response=regPollService.getRegPoll(regPoll);
		
		return response;
		
	}

}
