package com.fincare.upiprelogin.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class UPIGetAccounts {
	
	
	@NotNull(message="Should not be null value")
	@NotBlank(message="Should be valid Customer Id ")
	private String customerid;
	@NotNull(message="Should not be null value")
	@NotBlank(message="Should be valid IIN value")
	private String iin;
	@NotNull(message="Should not be null value")
	@NotBlank(message="Should be valid VPA Id")
	private String vpaid;
	@NotNull(message="Should not be null value")
	@NotBlank(message="Should be valid NpcLib")
	private String npclib;
	@NotNull(message="Should not be null value")
	@NotBlank(message="Should be valid Ref id")
	private String refid;
	@NotNull(message="Should not be null value")
	@NotBlank(message="Should be valid Device Id")
	private String deviceid;
	@NotNull(message="Should not be null value")
	@NotBlank(message="Should be valid Ip")
	private String ip;
	@NotNull(message="Should not be null value")
	@NotBlank(message="Should be valid Geoc")
	private String geoc;
	@NotNull(message="Should not be null value")
	@NotBlank(message="Should be valid Loc")
	private String loc;
	@NotNull(message="Should not be null value")
	@NotBlank(message="Should be valid session id")
	private String sessionid;
	public String getCustomerid() {
		return customerid;
	}
	public void setCustomerid(String customerid) {
		this.customerid = customerid;
	}
	public String getIin() {
		return iin;
	}
	public void setIin(String iin) {
		this.iin = iin;
	}
	public String getVpaid() {
		return vpaid;
	}
	public void setVpaid(String vpaid) {
		this.vpaid = vpaid;
	}
	public String getNpclib() {
		return npclib;
	}
	public void setNpclib(String npclib) {
		this.npclib = npclib;
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
	@NotBlank(message="Should be valid Dt value")
	private String dt;

}
