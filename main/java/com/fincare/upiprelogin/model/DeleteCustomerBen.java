package com.fincare.upiprelogin.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class DeleteCustomerBen {
	
	 @NotNull(message="Should be valid Value")
	    @NotBlank(message="Should not be blank")
	private String customerid;
	 @NotNull(message="Should be valid Value")
	    @NotBlank(message="Should not be blank")
	private String benid;
	 @NotNull(message="Should be valid Value")
	    @NotBlank(message="Should not be blank")
	private String sessionid;
	 @NotNull(message="Should be valid Value")
	    @NotBlank(message="Should not be blank")
	private String dt;
	public String getCustomerid() {
		return customerid;
	}
	public void setCustomerid(String customerid) {
		this.customerid = customerid;
	}
	public String getBenid() {
		return benid;
	}
	public void setBenid(String benid) {
		this.benid = benid;
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
