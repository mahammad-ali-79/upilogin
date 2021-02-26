package com.fincare.upiprelogin.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class UPIMobileReg {
	
	@NotNull(message="Should not be null value")
	@NotBlank(message="Should be valid  value")
	private String custid;
	@NotNull(message="Should not be null value")
	@NotBlank(message="Should be valid  value")
	private String vpafdid;
	@NotNull(message="Should not be null value")
	@NotBlank(message="Should be valid  value")
	private String vpaid;
	@NotNull(message="Should not be null value")
	@NotBlank(message="Should be valid  value")
	private String txnid;
	@NotNull(message="Should not be null value")
	@NotBlank(message="Should be valid  value")
	private String deviceimeiid;
	@NotNull(message="Should not be null value")
	@NotBlank(message="Should be valid  value")
	private String refid;
	@NotNull(message="Should not be null value")
	@NotBlank(message="Should be valid  value")
	private String deviceid;
	@NotNull(message="Should not be null value")
	@NotBlank(message="Should be valid  value")
	private String npcilibotp;
	@NotNull(message="Should not be null value")
	@NotBlank(message="Should be valid  value")
	private String npcilibpin;
	@NotNull(message="Should not be null value")
	@NotBlank(message="Should be valid  value")
	private String npcilibatmpin;
	@NotNull(message="Should not be null value")
	@NotBlank(message="Should be valid  value")
	private String acno;
	@NotNull(message="Should not be null value")
	@NotBlank(message="Should be valid  value")
	private String ifsc;
	@NotNull(message="Should not be null value")
	@NotBlank(message="Should be valid  value")
	private String cardno;
	@NotNull(message="Should not be null value")
	@NotBlank(message="Should be valid  value")
	private String cardexp;
	@NotNull(message="Should not be null value")
	@NotBlank(message="Should be valid  value")
	private String ip;
	@NotNull(message="Should not be null value")
	@NotBlank(message="Should be valid  value")
	private String geoc;
	@NotNull(message="Should not be null value")
	@NotBlank(message="Should be valid  value")
	private String loc;
	@NotNull(message="Should not be null value")
	@NotBlank(message="Should be valid  value")
	private String sessionid;
	@NotNull(message="Should not be null value")
	@NotBlank(message="Should be valid  value")
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
	public String getNpcilibotp() {
		return npcilibotp;
	}
	public void setNpcilibotp(String npcilibotp) {
		this.npcilibotp = npcilibotp;
	}
	public String getNpcilibpin() {
		return npcilibpin;
	}
	public void setNpcilibpin(String npcilibpin) {
		this.npcilibpin = npcilibpin;
	}
	public String getNpcilibatmpin() {
		return npcilibatmpin;
	}
	public void setNpcilibatmpin(String npcilibatmpin) {
		this.npcilibatmpin = npcilibatmpin;
	}
	public String getAcno() {
		return acno;
	}
	public void setAcno(String acno) {
		this.acno = acno;
	}
	public String getIfsc() {
		return ifsc;
	}
	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}
	public String getCardno() {
		return cardno;
	}
	public void setCardno(String cardno) {
		this.cardno = cardno;
	}
	public String getCardexp() {
		return cardexp;
	}
	public void setCardexp(String cardexp) {
		this.cardexp = cardexp;
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
