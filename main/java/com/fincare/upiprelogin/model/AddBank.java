package com.fincare.upiprelogin.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class AddBank {
	
	
	
	@NotNull(message="Should not be null value")
	@NotBlank(message="Should be valid  value")
	private String customerid;
	@NotNull(message="Should not be null value")
	@NotBlank(message="Should be valid  value")
	private String vpaid;
	@NotNull(message="Should not be null value")
	@NotBlank(message="Should be valid  value")
	private String vpa;
	@NotNull(message="Should not be null value")
	@NotBlank(message="Should be valid  value")
	private String accno;
	@NotNull(message="Should not be null value")
	@NotBlank(message="Should be valid  value")
	private String accifsc;
	@NotNull(message="Should not be null value")
	@NotBlank(message="Should be valid  value")
	private String name;
	@NotNull(message="Should not be null value")
	@NotBlank(message="Should be valid  value")
	private String nn;
	@NotNull(message="Should not be null value")
	@NotBlank(message="Should be valid  value")
	private String limit;
	@NotNull(message="Should not be null value")
	@NotBlank(message="Should be valid  value")
	private String bank;
	@NotNull(message="Should not be null value")
	@NotBlank(message="Should be valid  value")
	private String isdefault;
	@NotNull(message="Should not be null value")
	@NotBlank(message="Should be valid  value")
	private String acctype;
	@NotNull(message="Should not be null value")
	@NotBlank(message="Should be valid  value")
	private String mmid;
	@NotNull(message="Should not be null value")
	@NotBlank(message="Should be valid  value")
	private String ctype;
	@NotNull(message="Should not be null value")
	@NotBlank(message="Should be valid  value")
	private String cstype;
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
	public String getVpa() {
		return vpa;
	}
	public void setVpa(String vpa) {
		this.vpa = vpa;
	}
	public String getAccno() {
		return accno;
	}
	public void setAccno(String accno) {
		this.accno = accno;
	}
	public String getAccifsc() {
		return accifsc;
	}
	public void setAccifsc(String accifsc) {
		this.accifsc = accifsc;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNn() {
		return nn;
	}
	public void setNn(String nn) {
		this.nn = nn;
	}
	public String getLimit() {
		return limit;
	}
	public void setLimit(String limit) {
		this.limit = limit;
	}
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	public String getIsdefault() {
		return isdefault;
	}
	public void setIsdefault(String isdefault) {
		this.isdefault = isdefault;
	}
	public String getAcctype() {
		return acctype;
	}
	public void setAcctype(String acctype) {
		this.acctype = acctype;
	}
	public String getMmid() {
		return mmid;
	}
	public void setMmid(String mmid) {
		this.mmid = mmid;
	}
	public String getCtype() {
		return ctype;
	}
	public void setCtype(String ctype) {
		this.ctype = ctype;
	}
	public String getCstype() {
		return cstype;
	}
	public void setCstype(String cstype) {
		this.cstype = cstype;
	}
	public String getCdtype() {
		return cdtype;
	}
	public void setCdtype(String cdtype) {
		this.cdtype = cdtype;
	}
	public String getCdlen() {
		return cdlen;
	}
	public void setCdlen(String cdlen) {
		this.cdlen = cdlen;
	}
	public String getInternal() {
		return internal;
	}
	public void setInternal(String internal) {
		this.internal = internal;
	}
	public String getCatmdtype() {
		return catmdtype;
	}
	public void setCatmdtype(String catmdtype) {
		this.catmdtype = catmdtype;
	}
	public String getCatmdlen() {
		return catmdlen;
	}
	public void setCatmdlen(String catmdlen) {
		this.catmdlen = catmdlen;
	}
	public String getAcname() {
		return acname;
	}
	public void setAcname(String acname) {
		this.acname = acname;
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
	private String cdtype;
	@NotNull(message="Should not be null value")
	@NotBlank(message="Should be valid  value")
	private String cdlen;
	@NotNull(message="Should not be null value")
	@NotBlank(message="Should be valid  value")
	private String internal;
	@NotNull(message="Should not be null value")
	@NotBlank(message="Should be valid  value")
	private String catmdtype;
	@NotNull(message="Should not be null value")
	@NotBlank(message="Should be valid  value")
	private String catmdlen;
	@NotNull(message="Should not be null value")
	@NotBlank(message="Should be valid  value")
	private String acname;
	@NotNull(message="Should not be null value")
	@NotBlank(message="Should be valid  value")
	private String sessionid;
	@NotNull(message="Should not be null value")
	@NotBlank(message="Should be valid  value")
	private String dt;

}
