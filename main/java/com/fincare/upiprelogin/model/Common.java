  package com.fincare.upiprelogin.model;

public class Common {
	
	private Request req;

	public Request getRequest() {
		return req;
	}

	public void setRequest(Request req) {
		this.req = req;
	}

	@Override
	public String toString() {
		return "{req=" + req + "}";
	}

}
