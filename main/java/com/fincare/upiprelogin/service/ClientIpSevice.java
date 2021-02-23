package com.fincare.upiprelogin.service;

import java.util.StringTokenizer;

import javax.servlet.http.HttpServletRequest;

public class ClientIpSevice {
	
	public static String getClientIpAddress(HttpServletRequest request) {
	    String xForwardedForHeader = request.getHeader("X-Forwarded-For");
	    if (xForwardedForHeader == null) {
	    	System.out.println(request.getRemoteAddr().toString());
	        return request.getRemoteAddr();
	    } else {
	       System.out.println("IPADDRESS");
	        return new StringTokenizer(xForwardedForHeader, ",").nextToken().trim();
	    }
	}

}
