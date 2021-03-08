package com.fincare.upiprelogin.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class MandateCollect {
	
	 @NotNull(message="Should be valid Value")
	    @NotBlank(message="Should not be blank")
	private String umn;
	 @NotNull(message="Should be valid Value")
	    @NotBlank(message="Should not be blank")
	private String note;
	 @NotNull(message="Should be valid Value")
	    @NotBlank(message="Should not be blank")
	private String collectxp;
	 @NotNull(message="Should be valid Value")
	    @NotBlank(message="Should not be blank")
	private String amount;
	 @NotNull(message="Should be valid Value")
	    @NotBlank(message="Should not be blank")
	private String initiationmode;
	 @NotNull(message="Should be valid Value")
	    @NotBlank(message="Should not be blank")
	private String purpose;
	 @NotNull(message="Should be valid Value")
	    @NotBlank(message="Should not be blank")
	private String deviceimeiid;
	 @NotNull(message="Should be valid Value")
	    @NotBlank(message="Should not be blank")
	private String geocode;
	 @NotNull(message="Should be valid Value")
	    @NotBlank(message="Should not be blank")
	private String location;
	 @NotNull(message="Should be valid Value")
	    @NotBlank(message="Should not be blank")
	private String deviceip;
	 @NotNull(message="Should be valid Value")
	    @NotBlank(message="Should not be blank")
	private String deviceid;
	 @NotNull(message="Should be valid Value")
	    @NotBlank(message="Should not be blank")
	private String customerid;
	 @NotNull(message="Should be valid Value")
	    @NotBlank(message="Should not be blank")
	private String sessionid;
	 @NotNull(message="Should be valid Value")
	    @NotBlank(message="Should not be blank")
	private String dt;
	public String getUmn() {
		return umn;
	}
	public void setUmn(String umn) {
		this.umn = umn;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public String getCollectxp() {
		return collectxp;
	}
	public void setCollectxp(String collectxp) {
		this.collectxp = collectxp;
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
	public String getPurpose() {
		return purpose;
	}
	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
	public String getDeviceimeiid() {
		return deviceimeiid;
	}
	public void setDeviceimeiid(String deviceimeiid) {
		this.deviceimeiid = deviceimeiid;
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
	public String getDeviceip() {
		return deviceip;
	}
	public void setDeviceip(String deviceip) {
		this.deviceip = deviceip;
	}
	public String getDeviceid() {
		return deviceid;
	}
	public void setDeviceid(String deviceid) {
		this.deviceid = deviceid;
	}
	public String getCustomerid() {
		return customerid;
	}
	public void setCustomerid(String customerid) {
		this.customerid = customerid;
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
