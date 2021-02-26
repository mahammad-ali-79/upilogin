package com.fincare.upiprelogin.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class GetVPA {
	
	@NotNull(message="Should not be null value")
	@NotBlank(message="Should be valid  value")
	private String customerid;
	@NotNull(message="Should not be null value")
	@NotBlank(message="Should be valid  value")
	private String sessionid;
	@NotNull(message="Should not be null value")
	@NotBlank(message="Should be valid  value")
	private String dt;
	public String getCustomerid() {
		return customerid;
	}
	public void setCustomerid(String customerid) {
		this.customerid = customerid;
	}
	public String getSessionid() {
		return sessionid;
	}
	public void setSessionid(String sessionid) {
		this.sessionid = sessionid;
	}
	public String getDt() {
		return dt;
	}
	public void setDt(String dt) {
		this.dt = dt;
	}

}
