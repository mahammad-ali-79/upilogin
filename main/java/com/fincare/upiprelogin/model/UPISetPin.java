package com.fincare.upiprelogin.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class UPISetPin {
	 @NotNull(message="Should be valid Value")
	    @NotBlank(message="Should not be blank")
	private String custid;
	 @NotNull(message="Should be valid Value")
	    @NotBlank(message="Should not be blank")
	private String vpafdid;
	 @NotNull(message="Should be valid Value")
	    @NotBlank(message="Should not be blank")
	private String vpaid;
	 @NotNull(message="Should be valid Value")
	    @NotBlank(message="Should not be blank")
	private String txnid;
	 @NotNull(message="Should be valid Value")
	    @NotBlank(message="Should not be blank")
	private String deviceimeiid;
	 @NotNull(message="Should be valid Value")
	    @NotBlank(message="Should not be blank")
	private String refid;
	 @NotNull(message="Should be valid Value")
	    @NotBlank(message="Should not be blank")
	private String deviceid;
	 @NotNull(message="Should be valid Value")
	    @NotBlank(message="Should not be blank")
	private String npciliboldmpin;
	 @NotNull(message="Should be valid Value")
	    @NotBlank(message="Should not be blank")
	private String npcilibnewpin;
	 @NotNull(message="Should be valid Value")
	    @NotBlank(message="Should not be blank")
	private String ip;
	 @NotNull(message="Should be valid Value")
	    @NotBlank(message="Should not be blank")
	private String geoc;
	 @NotNull(message="Should be valid Value")
	    @NotBlank(message="Should not be blank")
	private String loc;
	 @NotNull(message="Should be valid Value")
	    @NotBlank(message="Should not be blank")
	private String sessionid;
	 @NotNull(message="Should be valid Value")
	    @NotBlank(message="Should not be blank")
	private String dt;
	public String getCustid() {
		return custid;
	}
	public void setCustid(String custid) {
		this.custid = custid;
	}
	public String getVpafdid() {
		return vpafdid;
	}
	public void setVpafdid(String vpafdid) {
		this.vpafdid = vpafdid;
	}
	public String getVpaid() {
		return vpaid;
	}
	public void setVpaid(String vpaid) {
		this.vpaid = vpaid;
	}
	public String getTxnid() {
		return txnid;
	}
	public void setTxnid(String txnid) {
		this.txnid = txnid;
	}
	public String getDeviceimeiid() {
		return deviceimeiid;
	}
	public void setDeviceimeiid(String deviceimeiid) {
		this.deviceimeiid = deviceimeiid;
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
	public String getNpciliboldmpin() {
		return npciliboldmpin;
	}
	public void setNpciliboldmpin(String npciliboldmpin) {
		this.npciliboldmpin = npciliboldmpin;
	}
	public String getNpcilibnewpin() {
		return npcilibnewpin;
	}
	public void setNpcilibnewpin(String npcilibnewpin) {
		this.npcilibnewpin = npcilibnewpin;
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
	
	
	

}
