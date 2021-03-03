package com.fincare.upiprelogin.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class UPIRejectCollect {
	
	 @NotNull(message="Should be valid Value")
	    @NotBlank(message="Should not be blank")
	private String custid;
	 @NotNull(message="Should be valid Value")
	    @NotBlank(message="Should not be blank")
	private String vpaid;
	 @NotNull(message="Should be valid Value")
	    @NotBlank(message="Should not be blank")
	private String vpafdid;
	 @NotNull(message="Should be valid Value")
	    @NotBlank(message="Should not be blank")
	private String orgtxnid;
	 @NotNull(message="Should be valid Value")
	    @NotBlank(message="Should not be blank")
	private String txnid;
	 @NotNull(message="Should be valid Value")
	    @NotBlank(message="Should not be blank")
	private String refid;
	 @NotNull(message="Should be valid Value")
	    @NotBlank(message="Should not be blank")
	private String chid;
	 @NotNull(message="Should be valid Value")
	    @NotBlank(message="Should not be blank")
	private String deviceid;
	 @NotNull(message="Should be valid Value")
	    @NotBlank(message="Should not be blank")
	private String ip;
	 @NotNull(message="Should be valid Value")
	    @NotBlank(message="Should not be blank")
	private String geoc;
	 @NotNull(message="Should be valid Value")
	    @NotBlank(message="Should not be blank")
	private String loc;
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
	public String getVpafdid() {
		return vpafdid;
	}
	public void setVpafdid(String vpafdid) {
		this.vpafdid = vpafdid;
	}
	public String getOrgtxnid() {
		return orgtxnid;
	}
	public void setOrgtxnid(String orgtxnid) {
		this.orgtxnid = orgtxnid;
	}
	public String getTxnid() {
		return txnid;
	}
	public void setTxnid(String txnid) {
		this.txnid = txnid;
	}
	public String getRefid() {
		return refid;
	}
	public void setRefid(String refid) {
		this.refid = refid;
	}
	public String getChid() {
		return chid;
	}
	public void setChid(String chid) {
		this.chid = chid;
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
	private String sessionid;
	private String dt;
	
	

}
