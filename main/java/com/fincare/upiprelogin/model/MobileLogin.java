package com.fincare.upiprelogin.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class MobileLogin {
	
	@NotNull(message="Should not be null value")
	@NotBlank(message="Should be value of platform")
	private String platform;
	@NotNull(message="Should not be null value")
	@NotBlank(message="Should be value of deviceid")
	private String deviceid;
	@NotNull(message="Should not be null value")
	@NotBlank(message="Should be customer number")
	private String customerid;
	@NotNull(message="Should not be null value")
	@NotBlank(message="Should be appversion")
	private String appversion;
	@NotNull(message="Should not be null value")
	@NotBlank(message="Should be valid password")
	private String validatepassword;
	@NotNull(message="Should not be null value")
	@NotBlank(message="Should be valid sdk")
	private String strsdkint;
	@NotNull(message="Should not be null value")
	@NotBlank(message="Should be valid os version")
	private String osversion;
	public String getPlatform() {
		return platform;
	}
	public void setPlatform(String platform) {
		this.platform = platform;
	}
	public String getDeviceid() {
		return deviceid;
	}
	public void setDeviceid(String deviceid) {
		this.deviceid = deviceid;
	}
	public String getCustomerid() {
		return customerid;
	}
	public void setCustomerid(String customerid) {
		this.customerid = customerid;
	}
	public String getAppversion() {
		return appversion;
	}
	public void setAppversion(String appversion) {
		this.appversion = appversion;
	}
	public String getValidatepassword() {
		return validatepassword;
	}
	public void setValidatepassword(String validatepassword) {
		this.validatepassword = validatepassword;
	}
	public String getStrsdkint() {
		return strsdkint;
	}
	public void setStrsdkint(String strsdkint) {
		this.strsdkint = strsdkint;
	}
	public String getOsversion() {
		return osversion;
	}
	public void setOsversion(String osversion) {
		this.osversion = osversion;
	}
	public String getDt() {
		return dt;
	}
	public void setDt(String dt) {
		this.dt = dt;
	}
	@NotNull(message="Should not be null value")
	@NotBlank(message="Should be valid dt value")
	private String dt;

}
