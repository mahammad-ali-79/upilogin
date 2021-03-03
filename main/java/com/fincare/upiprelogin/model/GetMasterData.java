package com.fincare.upiprelogin.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class GetMasterData {

	 @NotNull(message="Should be valid Value")
	    @NotBlank(message="Should not be blank")
	private String mtype;
	 @NotNull(message="Should be valid Value")
	    @NotBlank(message="Should not be blank")
	private String sessionid;
	 @NotNull(message="Should be valid Value")
	    @NotBlank(message="Should not be blank")
	private String customerid;
	 @NotNull(message="Should be valid Value")
	    @NotBlank(message="Should not be blank")
	private String dt;
	public String getMtype() {
		return mtype;
	}
	public void setMtype(String mtype) {
		this.mtype = mtype;
	}
	public String getSessionid() {
		return sessionid;
	}
	public void setSessionid(String sessionid) {
		this.sessionid = sessionid;
	}
	public String getCustomerid() {
		return customerid;
	}
	public void setCustomerid(String customerid) {
		this.customerid = customerid;
	}
	public String getDt() {
		return dt;
	}
	public void setDt(String dt) {
		this.dt = dt;
	}
	
}
