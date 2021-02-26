package com.fincare.upiprelogin.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class AddVPA {
	
	@NotNull(message="Should not be null value")
	@NotBlank(message="Should be valid  value")
	private String vpa;
	@NotNull(message="Should not be null value")
	@NotBlank(message="Should be valid  value")
	private String vpatype;
	@NotNull(message="Should not be null value")
	@NotBlank(message="Should be valid  value")
	private String validfrom;
	@NotNull(message="Should not be null value")
	@NotBlank(message="Should be valid  value")
	private String validto;
	@NotNull(message="Should not be null value")
	@NotBlank(message="Should be valid  value")
	private String customerid;
	@NotNull(message="Should not be null value")
	@NotBlank(message="Should be valid  value")
	private String nickname;
	@NotNull(message="Should not be null value")
	@NotBlank(message="Should be valid  value")
	private String sessionid;
	@NotNull(message="Should not be null value")
	@NotBlank(message="Should be valid  value")
	private String dt;
	public String getVpa() {
		return vpa;
	}
	public void setVpa(String vpa) {
		this.vpa = vpa;
	}
	public String getVpatype() {
		return vpatype;
	}
	public void setVpatype(String vpatype) {
		this.vpatype = vpatype;
	}
	public String getValidfrom() {
		return validfrom;
	}
	public void setValidfrom(String validfrom) {
		this.validfrom = validfrom;
	}
	public String getValidto() {
		return validto;
	}
	public void setValidto(String validto) {
		this.validto = validto;
	}
	public String getCustomerid() {
		return customerid;
	}
	public void setCustomerid(String customerid) {
		this.customerid = customerid;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
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
