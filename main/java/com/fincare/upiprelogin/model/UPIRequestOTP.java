package com.fincare.upiprelogin.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class UPIRequestOTP {
	
	@NotNull(message="Should not be null value")
	@NotBlank(message="Should be valid  value")
	private String custometid;
	@NotNull(message="Should not be null value")
	@NotBlank(message="Should be valid  value")
	private String vpaid;
	@NotNull(message="Should not be null value")
	@NotBlank(message="Should be valid  value")
	private String ifsc;
	@NotNull(message="Should not be null value")
	@NotBlank(message="Should be valid  value")
	private String iin;
	@NotNull(message="Should not be null value")
	@NotBlank(message="Should be valid  value")
	private String refid;
	@NotNull(message="Should not be null value")
	@NotBlank(message="Should be valid  value")
	private String deviceid;
	@NotNull(message="Should not be null value")
	@NotBlank(message="Should be valid  value")
	private String ip;
	@NotNull(message="Should not be null value")
	@NotBlank(message="Should be valid  value")
	private String geoc;
	@NotNull(message="Should not be null value")
	@NotBlank(message="Should be valid  value")
	private String acno;
	@NotNull(message="Should not be null value")
	@NotBlank(message="Should be valid  value")
	private String loc;
	@NotNull(message="Should not be null value")
	@NotBlank(message="Should be valid  value")
	private String sessionid;
	@NotNull(message="Should not be null value")
	@NotBlank(message="Should be valid  value")
	private String dt;
	public String getCustometid() {
		return custometid;
	}
	public void setCustometid(String custometid) {
		this.custometid = custometid;
	}
	public String getVpaid() {
		return vpaid;
	}
	public void setVpaid(String vpaid) {
		this.vpaid = vpaid;
	}
	public String getIfsc() {
		return ifsc;
	}
	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}
	public String getIin() {
		return iin;
	}
	public void setIin(String iin) {
		this.iin = iin;
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
	public String getAcno() {
		return acno;
	}
	public void setAcno(String acno) {
		this.acno = acno;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
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
