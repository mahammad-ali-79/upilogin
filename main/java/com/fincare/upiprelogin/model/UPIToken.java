package com.fincare.upiprelogin.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class UPIToken {
	
	@NotNull(message="Should not be null value")
	@NotBlank(message="Should be valid challenge value")
	private String challenge;
	@NotNull(message="Should not be null value")
	@NotBlank(message="Should be valid ctype value")
	private String ctype;
	@NotNull(message="Should not be null value")
	@NotBlank(message="Should be valid refid value")
	private String refid;
	@NotNull(message="Should not be null value")
	@NotBlank(message="Should be valid deviceid value")
	private String deviceid;
	@NotNull(message="Should not be null value")
	@NotBlank(message="Should be valid dt value")
	private String dt;
	@NotNull(message="Should not be null value")
	@NotBlank(message="Should be valid IP value")
	private String ip;
	@NotNull(message="Should not be null value")
	@NotBlank(message="Should be valid GEOC value")
	private String geoc;
	@NotNull(message="Should not be null value")
	@NotBlank(message="Should be valid LOC value")
	private String loc;
	public String getChallenge() {
		return challenge;
	}
	public void setChallenge(String challenge) {
		this.challenge = challenge;
	}
	public String getCtype() {
		return ctype;
	}
	public void setCtype(String ctype) {
		this.ctype = ctype;
	}
	public String getRefid() {
		return refid;
	}
	public void setRefid(String refid) {
		this.refid = refid;
	}
	public String getDeviceid() {
		return deviceid;
	}
	public void setDeviceid(String deviceid) {
		this.deviceid = deviceid;
	}
	public String getDt() {
		return dt;
	}
	public void setDt(String dt) {
		this.dt = dt;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getGeoc() {
		return geoc;
	}
	public void setGeoc(String geoc) {
		this.geoc = geoc;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	

}
