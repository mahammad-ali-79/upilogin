package com.fincare.upiprelogin.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class UPIValAdd {
	
	@NotNull(message="Should not be null value")
	@NotBlank(message="Should be valid  value")
	private String custid;
	@NotNull(message="Should not be null value")
	@NotBlank(message="Should be valid  value")
	private String vpaid;
	@NotNull(message="Should not be null value")
	@NotBlank(message="Should be valid  value")
	private String vpa;
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
	public String getCustid() {
		return custid;
	}
	public void setCustid(String custid) {
		this.custid = custid;
	}
	public String getVpaid() {
		return vpaid;
	}
	public void setVpaid(String vpaid) {
		this.vpaid = vpaid;
	}
	public String getVpa() {
		return vpa;
	}
	public void setVpa(String vpa) {
		this.vpa = vpa;
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
	@NotNull(message="Should not be null value")
	@NotBlank(message="Should be valid  value")
	private String loc;
	@NotNull(message="Should not be null value")
	@NotBlank(message="Should be valid  value")
	private String sessionid;
	@NotNull(message="Should not be null value")
	@NotBlank(message="Should be valid  value")
	private String dt;

}
