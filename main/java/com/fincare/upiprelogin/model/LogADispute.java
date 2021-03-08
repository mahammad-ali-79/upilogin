package com.fincare.upiprelogin.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class LogADispute {
	 @NotNull(message="Should be valid Value")
	    @NotBlank(message="Should not be blank")
	private String vpaid;
	 @NotNull(message="Should be valid Value")
	    @NotBlank(message="Should not be blank")
	private String vpafdid;
	 @NotNull(message="Should be valid Value")
	    @NotBlank(message="Should not be blank")
	private String txnid;
	 @NotNull(message="Should be valid Value")
	    @NotBlank(message="Should not be blank")
	private String qt;
	 @NotNull(message="Should be valid Value")
	    @NotBlank(message="Should not be blank")
	private String qd;
	 @NotNull(message="Should be valid Value")
	    @NotBlank(message="Should not be blank")
	private String sessionid;
	 @NotNull(message="Should be valid Value")
	    @NotBlank(message="Should not be blank")
	private String customerid;
	 @NotNull(message="Should be valid Value")
	    @NotBlank(message="Should not be blank")
	private String dt;
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
	public String getTxnid() {
		return txnid;
	}
	public void setTxnid(String txnid) {
		this.txnid = txnid;
	}
	public String getQt() {
		return qt;
	}
	public void setQt(String qt) {
		this.qt = qt;
	}
	public String getQd() {
		return qd;
	}
	public void setQd(String qd) {
		this.qd = qd;
	}
	public String getSessionid() {
		return sessionid;
	}
	public void setSessionid(String sessionid) {
		this.sessionid = sessionid;
	}
	public String getCustomerid() {
		return customerid;
	}
	public void setCustomerid(String customerid) {
		this.customerid = customerid;
	}
	public String getDt() {
		return dt;
	}
	public void setDt(String dt) {
		this.dt = dt;
	}
	
	

}
