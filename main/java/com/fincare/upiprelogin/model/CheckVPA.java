package com.fincare.upiprelogin.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class CheckVPA {
	
	
	@NotNull(message="Should not be null value")
	@NotBlank(message="Should be valid VPA")
	private String vpa;
	@NotNull(message="Should not be null value")
	@NotBlank(message="Should be valid dt")
	private String dt;
	@NotNull(message="Should not be null value")
	@NotBlank(message="Should be app version")
	private String appversion;
	public String getVpa() {
		return vpa;
	}
	public void setVpa(String vpa) {
		this.vpa = vpa;
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

}
