package com.fincare.upiprelogin.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class RegPoll {

	@NotNull(message="Should not be null value")
	@NotBlank(message="Should be Randomly generated Unique number")
	private String otptoken; 
	@NotNull(message="Should not be null value")
	@NotBlank(message="should be True/False")
	private String sendemailotp;
	@NotNull(message="Should not be null value")
	@NotBlank(message="should be Unique Number")
	private String dt;
	@NotNull(message="Should not be null value")
	@NotBlank(message="should be version of application")
	private String appversion;
	public String getOtptoken() {
		return otptoken;
	}
	public void setOtptoken(String otptoken) {
		this.otptoken = otptoken;
	}
	public String getSendemailotp() {
		return sendemailotp;
	}
	public void setSendemailotp(String sendemailotp) {
		this.sendemailotp = sendemailotp;
	}
	public String getDt() {
		return dt;
	}
	public void setDt(String dt) {
		this.dt = dt;
	}
	public String getAppversion() {
		return appversion;
	}
	public void setAppversion(String appversion) {
		this.appversion = appversion;
	}
	@Override
	public String toString() {
		return "[otptoken=" + otptoken + ", sendemailotp=" + sendemailotp + ", dt=" + dt + ", appversion="
				+ appversion + "]";
	}

}
