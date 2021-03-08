package com.fincare.upiprelogin.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class CreateMandate {
	
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
	private String initiatortype;
	 @NotNull(message="Should be valid Value")
	    @NotBlank(message="Should not be blank")
	private String txnid;
	 @NotNull(message="Should be valid Value")
	    @NotBlank(message="Should not be blank")
	private String note;
	 @NotNull(message="Should be valid Value")
	    @NotBlank(message="Should not be blank")
	private String refid;
	 @NotNull(message="Should be valid Value")
	    @NotBlank(message="Should not be blank")
	private String mandateexpiry;
	 @NotNull(message="Should be valid Value")
	    @NotBlank(message="Should not be blank")
	private String revokeable;
	 @NotNull(message="Should be valid Value")
	    @NotBlank(message="Should not be blank")
	private String sharetopayee;
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
	private String amountrule;
	 @NotNull(message="Should be valid Value")
	    @NotBlank(message="Should not be blank")
	private String recurrencepattern;
	 @NotNull(message="Should be valid Value")
	    @NotBlank(message="Should not be blank")
	private String recurencerulevalue;
	 @NotNull(message="Should be valid Value")
	    @NotBlank(message="Should not be blank")
	private String recurrenceruletype;
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
	private String dviceip;
	 @NotNull(message="Should be valid Value")
	    @NotBlank(message="Should not be blank")
	private String deviceid;
	 @NotNull(message="Should be valid Value")
	    @NotBlank(message="Should not be blank")
	private String npcilibencrypteddata;
	 @NotNull(message="Should be valid Value")
	    @NotBlank(message="Should not be blank")
	private String mpin;
	 @NotNull(message="Should be valid Value")
	    @NotBlank(message="Should not be blank")
	private String tovpa;
	 @NotNull(message="Should be valid Value")
	    @NotBlank(message="Should not be blank")
	private String toname;
	 @NotNull(message="Should be valid Value")
	    @NotBlank(message="Should not be blank")
	private String tocode;
	 @NotNull(message="Should be valid Value")
	    @NotBlank(message="Should not be blank")
	private String initiatonmode;
	 @NotNull(message="Should be valid Value")
	    @NotBlank(message="Should not be blank")
	private String purpose;
	 @NotNull(message="Should be valid Value")
	    @NotBlank(message="Should not be blank")
	private String sessionid;
	 @NotNull(message="Should be valid Value")
	    @NotBlank(message="Should not be blank")
	private String dt;
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
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public String getRefid() {
		return refid;
	}
	public void setRefid(String refid) {
		this.refid = refid;
	}
	public String getMandateexpiry() {
		return mandateexpiry;
	}
	public void setMandateexpiry(String mandateexpiry) {
		this.mandateexpiry = mandateexpiry;
	}
	public String getRevokeable() {
		return revokeable;
	}
	public void setRevokeable(String revokeable) {
		this.revokeable = revokeable;
	}
	public String getSharetopayee() {
		return sharetopayee;
	}
	public void setSharetopayee(String sharetopayee) {
		this.sharetopayee = sharetopayee;
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
	public String getAmountrule() {
		return amountrule;
	}
	public void setAmountrule(String amountrule) {
		this.amountrule = amountrule;
	}
	public String getRecurrencepattern() {
		return recurrencepattern;
	}
	public void setRecurrencepattern(String recurrencepattern) {
		this.recurrencepattern = recurrencepattern;
	}
	public String getRecurencerulevalue() {
		return recurencerulevalue;
	}
	public void setRecurencerulevalue(String recurencerulevalue) {
		this.recurencerulevalue = recurencerulevalue;
	}
	public String getRecurrenceruletype() {
		return recurrenceruletype;
	}
	public void setRecurrenceruletype(String recurrenceruletype) {
		this.recurrenceruletype = recurrenceruletype;
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
	public String getDviceip() {
		return dviceip;
	}
	public void setDviceip(String dviceip) {
		this.dviceip = dviceip;
	}
	public String getDeviceid() {
		return deviceid;
	}
	public void setDeviceid(String deviceid) {
		this.deviceid = deviceid;
	}
	public String getNpcilibencrypteddata() {
		return npcilibencrypteddata;
	}
	public void setNpcilibencrypteddata(String npcilibencrypteddata) {
		this.npcilibencrypteddata = npcilibencrypteddata;
	}
	public String getMpin() {
		return mpin;
	}
	public void setMpin(String mpin) {
		this.mpin = mpin;
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
	public String getTocode() {
		return tocode;
	}
	public void setTocode(String tocode) {
		this.tocode = tocode;
	}
	public String getInitiatonmode() {
		return initiatonmode;
	}
	public void setInitiatonmode(String initiatonmode) {
		this.initiatonmode = initiatonmode;
	}
	public String getPurpose() {
		return purpose;
	}
	public void setPurpose(String purpose) {
		this.purpose = purpose;
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
