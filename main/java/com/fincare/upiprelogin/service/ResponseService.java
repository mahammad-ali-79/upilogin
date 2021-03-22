package com.fincare.upiprelogin.service;



import java.util.StringTokenizer;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResponseService {
	
	@Autowired
	private HttpServletRequest clientIp;
	public String getIpAddress() {
 String xForwardedForHeader = clientIp.getHeader("X-Forwarded-For");
	    if (xForwardedForHeader == null) {
	    	System.out.println(clientIp.getRemoteAddr().toString());
	    	 System.out.println(clientIp.getRemoteAddr().toString());
	    	
	    
	        return clientIp.getRemoteAddr();
	        
	    } else { 
	       System.out.println("IPADDRESS");
	     
	       return new StringTokenizer(xForwardedForHeader, ",").nextToken().trim();
	    }
		
	}
	
	

}
