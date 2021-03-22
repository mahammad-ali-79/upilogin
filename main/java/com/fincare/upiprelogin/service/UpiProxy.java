package com.fincare.upiprelogin.service;

import java.util.Map;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fincare.upiprelogin.model.Common;
import com.fincare.upiprelogin.model.Response;

@FeignClient(name="upi.url",url="${upi.url:https://103.210.75.138/services/unt}")
public interface UpiProxy {
	
	@RequestMapping(method=RequestMethod.POST)
	public Response getResponse(@RequestHeader Map<String,String> headerMap,@RequestBody Common common);

}
