package com.fincare.upiprelogin.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class AddBen {
	
	 @NotNull(message="Should be valid Value")
	    @NotBlank(message="Should not be blank")
	private String customerid;
	 @NotNull(message="Should be valid Value")
	    @NotBlank(message="Should not be blank")
	private String bentype;
	 @NotNull(message="Should be valid Value")
	    @NotBlank(message="Should not be blank")
	private String nickname;
	 @NotNull(message="Should be valid Value")
	    @NotBlank(message="Should not be blank")
	private String limit;
	 @NotNull(message="Should be valid Value")
	    @NotBlank(message="Should not be blank")
	private String dt;
	 @NotNull(message="Should be valid Value")
	    @NotBlank(message="Should not be blank")
	private String sessionid;
	 @NotNull(message="Should be valid Value")
	    @NotBlank(message="Should not be blank")
	private String accno;
	public String getCustomerid() {
		return customerid;
	}
	public void setCustomerid(String customerid) {
		this.customerid = customerid;
	}
	public String getBentype() {
		return bentype;
	}
	public void setBentype(String bentype) {
		this.bentype = bentype;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getLimit() {
		return limit;
	}
	public void setLimit(String limit) {
		this.limit = limit;
	}
	public String getDt() {
		return dt;
	}
	public void setDt(String dt) {
		this.dt = dt;
	}
	public String getSessionid() {
		return sessionid;
	}
	public void setSessionid(String sessionid) {
		this.sessionid = sessionid;
	}
	public String getAccno() {
		return accno;
	}
	public void setAccno(String accno) {
		this.accno = accno;
	}
	public String getAcifsc() {
		return acifsc;
	}
	public void setAcifsc(String acifsc) {
		this.acifsc = acifsc;
	}
	 @NotNull(message="Should be valid Value")
	    @NotBlank(message="Should not be blank")
	private String acifsc;

}
