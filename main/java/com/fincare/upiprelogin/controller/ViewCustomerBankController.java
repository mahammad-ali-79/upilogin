package com.fincare.upiprelogin.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.fincare.upiprelogin.model.GetVPA;
import com.fincare.upiprelogin.model.Response;
import com.fincare.upiprelogin.model.ViewCustomerBank;
import com.fincare.upiprelogin.service.GetVPAService;
import com.fincare.upiprelogin.service.ResponseService;
import com.fincare.upiprelogin.service.ViewCustomerBanksservice;

public class ViewCustomerBankController {
	

	@Autowired
	private ViewCustomerBanksservice viewCustomerBankService;
	@Autowired
	private ResponseService responseService;
	@PostMapping("/ViewCustomerBank")
	public Response getUPIMobileReg( @Valid @RequestBody ViewCustomerBank viewCustomerBank){
		 Logger sdIp = LoggerFactory.getLogger("UPI SD Address");
		 sdIp.info("Source and Destination IP Address",responseService.getIpAddress());
		Response response=viewCustomerBankService.getViewCustomerBank(viewCustomerBank);
		
		return response;
		 
	}

}
