package com.fincare.upiprelogin.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class RevokeMandate {
	 @NotNull(message="Should be valid Value")
	    @NotBlank(message="Should not be blank")
	private String mandated;
	 @NotNull(message="Should be valid Value")
	    @NotBlank(message="Should not be blank")
	private String initiatortype;
	 @NotNull(message="Should be valid Value")
	    @NotBlank(message="Should not be blank")
	private String txnid;
	 @NotNull(message="Should be valid Value")
	    @NotBlank(message="Should not be blank")
	private String refid;
	 @NotNull(message="Should be valid Value")
	    @NotBlank(message="Should not be blank")
	private String startdate;
	 @NotNull(message="Should be valid Value")
	    @NotBlank(message="Should not be blank")
	private String enddate;
	 @NotNull(message="Should be valid Value")
	    @NotBlank(message="Should not be blank")
	private String amount;
	 @NotNull(message="Should be valid Value")
	    @NotBlank(message="Should not be blank")
	private String initiationmode;
	 @NotNull(message="Should be valid Value")
	    @NotBlank(message="Should not be blank")
	private String customerid;
	 @NotNull(message="Should be valid Value")
	    @NotBlank(message="Should not be blank")
	private String vpaid;
	 @NotNull(message="Should be valid Value")
	    @NotBlank(message="Should not be blank")
	private String vpafdid;
	 @NotNull(message="Should be valid Value")
	    @NotBlank(message="Should not be blank")
	private String deviceimeiid;
	 @NotNull(message="Should be valid Value")
	    @NotBlank(message="Should not be blank")
	private String deviceid;
	 @NotNull(message="Should be valid Value")
	    @NotBlank(message="Should not be blank")
	private String deviceip;
	 @NotNull(message="Should be valid Value")
	    @NotBlank(message="Should not be blank")
	private String geocode;
	 @NotNull(message="Should be valid Value")
	    @NotBlank(message="Should not be blank")
	private String location;
	 @NotNull(message="Should be valid Value")
	    @NotBlank(message="Should not be blank")
	private String npcilib;
	 @NotNull(message="Should be valid Value")
	    @NotBlank(message="Should not be blank")
	private String mpin;
	 @NotNull(message="Should be valid Value")
	    @NotBlank(message="Should not be blank")
	private String sessionid;
	 @NotNull(message="Should be valid Value")
	    @NotBlank(message="Should not be blank")
	private String dt;
	public String getMandated() {
		return mandated;
	}
	public void setMandated(String mandated) {
		this.mandated = mandated;
	}
	public String getInitiatortype() {
		return initiatortype;
	}
	public void setInitiatortype(String initiatortype) {
		this.initiatortype = initiatortype;
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
	public String getStartdate() {
		return startdate;
	}
	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}
	public String getEnddate() {
		return enddate;
	}
	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getInitiationmode() {
		return initiationmode;
	}
	public void setInitiationmode(String initiationmode) {
		this.initiationmode = initiationmode;
	}
	public String getCustomerid() {
		return customerid;
	}
	public void setCustomerid(String customerid) {
		this.customerid = customerid;
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
	public String getDeviceimeiid() {
		return deviceimeiid;
	}
	public void setDeviceimeiid(String deviceimeiid) {
		this.deviceimeiid = deviceimeiid;
	}
	public String getDeviceid() {
		return deviceid;
	}
	public void setDeviceid(String deviceid) {
		this.deviceid = deviceid;
	}
	public String getDeviceip() {
		return deviceip;
	}
	public void setDeviceip(String deviceip) {
		this.deviceip = deviceip;
	}
	public String getGeocode() {
		return geocode;
	}
	public void setGeocode(String geocode) {
		this.geocode = geocode;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getNpcilib() {
		return npcilib;
	}
	public void setNpcilib(String npcilib) {
		this.npcilib = npcilib;
	}
	public String getMpin() {
		return mpin;
	}
	public void setMpin(String mpin) {
		this.mpin = mpin;
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
