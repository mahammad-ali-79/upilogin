package com.fincare.upiprelogin.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fincare.upiprelogin.model.RegPoll;
import com.fincare.upiprelogin.model.Response;
import com.fincare.upiprelogin.service.RegPollService;
import com.fincare.upiprelogin.service.ResponseService;

@RestController
@RequestMapping("/upiprelogin")
public class RegPollController {
	
	@Autowired 
	private RegPollService regPollService;
	@Autowired
	private ResponseService responseService;
	@PostMapping("/RegPoll")
	public Response getRegPoll( @Valid @RequestBody RegPoll regPoll){
		 Logger sdIp = LoggerFactory.getLogger("UPI SD Address");
		 sdIp.info("Source and Destination IP Address",responseService.getIpAddress());
		Response response=regPollService.getRegPoll(regPoll);
		
		return response;
		
	}

}
