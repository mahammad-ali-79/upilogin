package com.fincare.upiprelogin.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.fincare.upiprelogin.model.Response;
import com.fincare.upiprelogin.model.ViewDisputes;
import com.fincare.upiprelogin.service.ResponseService;
import com.fincare.upiprelogin.service.ViewDisputeService;

public class ViewDisputesController {
	

	@Autowired
	private ViewDisputeService viewDisputesService;
	@Autowired
	private ResponseService responseService;
	@PostMapping("/ViewDisputes")
	public Response getViewDisputes( @Valid @RequestBody ViewDisputes viewDisputes){
		 Logger sdIp = LoggerFactory.getLogger("UPI SD Address");
		 sdIp.info("Source and Destination IP Address",responseService.getIpAddress());
		Response response=viewDisputesService.getViewDispute(viewDisputes);
		
		return response;
		 
	}


}
