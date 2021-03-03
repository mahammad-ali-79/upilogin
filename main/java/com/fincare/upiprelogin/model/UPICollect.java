package com.fincare.upiprelogin.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class UPICollect {
	
	 @NotNull(message="Should be valid Value")
	    @NotBlank(message="Should not be blank")
	private String custid;
	 @NotNull(message="Should be valid Value")
	    @NotBlank(message="Should not be blank")
	private String vpaid;
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
	public String getTovpa() {
		return tovpa;
	}
	public void setTovpa(String tovpa) {
		this.tovpa = tovpa;
	}
	public String getToname() {
		return toname;
	}
	public void setToname(String toname) {
		this.toname = toname;
	}
	public String getNarration() {
		return narration;
	}
	public void setNarration(String narration) {
		this.narration = narration;
	}
	public String getAmt() {
		return amt;
	}
	public void setAmt(String amt) {
		this.amt = amt;
	}
	public String getCexp() {
		return cexp;
	}
	public void setCexp(String cexp) {
		this.cexp = cexp;
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
	public String getSessionid() {
		return sessionid;
	}
	public void setSessionid(String sessionid) {
		this.sessionid = sessionid;
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
	public String getDt() {
		return dt;
	}
	public void setDt(String dt) {
		this.dt = dt;
	}
	 @NotNull(message="Should be valid Value")
	    @NotBlank(message="Should not be blank")
	private String vpafdid;
	 @NotNull(message="Should be valid Value")
	    @NotBlank(message="Should not be blank")
	private String tovpa;
	 @NotNull(message="Should be valid Value")
	    @NotBlank(message="Should not be blank")
	private String toname;
	 @NotNull(message="Should be valid Value")
	    @NotBlank(message="Should not be blank")
	private String narration;
	 @NotNull(message="Should be valid Value")
	    @NotBlank(message="Should not be blank")
	private String amt;
	 @NotNull(message="Should be valid Value")
	    @NotBlank(message="Should not be blank")
	private String cexp;
	 @NotNull(message="Should be valid Value")
	    @NotBlank(message="Should not be blank")
	private String refid;
	 @NotNull(message="Should be valid Value")
	    @NotBlank(message="Should not be blank")
	private String deviceid;
	 @NotNull(message="Should be valid Value")
	    @NotBlank(message="Should not be blank")
	private String sessionid;
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
	private String dt;
	
	

}
