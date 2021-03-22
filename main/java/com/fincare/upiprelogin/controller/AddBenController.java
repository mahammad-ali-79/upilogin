package com.fincare.upiprelogin.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.fincare.upiprelogin.model.AddBen;
import com.fincare.upiprelogin.model.Response;
import com.fincare.upiprelogin.service.AddBenService;
import com.fincare.upiprelogin.service.ResponseService;

public class AddBenController {

	@Autowired
	private AddBenService addBenService;
	@Autowired
	private ResponseService responseService;
	@PostMapping("/AddBen")
	public Response getAddBen( @Valid @RequestBody AddBen addBen){
		 Logger sdIp = LoggerFactory.getLogger("UPI SD Address");
		 sdIp.info("Source and Destination IP Address",responseService.getIpAddress());
		Response response=addBenService.getAddBen(addBen);
		
		return response;
		 
	}

}
