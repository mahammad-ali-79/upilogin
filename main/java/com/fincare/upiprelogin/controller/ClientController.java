package com.fincare.upiprelogin.controller;

import java.util.StringTokenizer;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;



@RestController
@RequestMapping("/upiprelogin")
public class ClientController {
	

	@PostMapping("/ClientIp")
	public String getClient( HttpServletRequest request){
		
			
			   String xForwardedForHeader = request.getHeader("X-Forwarded-For");
			    if (xForwardedForHeader == null) {
			    	
			    	StringBuilder sb= new StringBuilder();
			    	sb.append("{\"remoteaddr\":"+request.getRemoteAddr().toString());
			    	sb.append(",");
			    	sb.append("\"localaddr\":"+request.getLocalAddr().toString()+"}");
			        return sb.toString();
			    } else {
			       System.out.println("IPADDRESS");
			        return new StringTokenizer(xForwardedForHeader, ",").nextToken().trim();
			    }
			
		
	}

}
