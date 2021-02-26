package com.fincare.upiprelogin.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class UpdateEDI {
	
	@NotNull(message="Should not be null value")
	@NotBlank(message="Should be valid  value")
	private String deviceid;
	@NotNull(message="Should not be null value")
	@NotBlank(message="Should be valid  value")
	private String did;
	@NotNull(message="Should not be null value")
	@NotBlank(message="Should be valid  value")
	private String simid;
	@NotNull(message="Should not be null value")
	@NotBlank(message="Should be valid  value")
	private String slotid;
	@NotNull(message="Should not be null value")
	@NotBlank(message="Should be valid  value")
	private String dc;
	@NotNull(message="Should not be null value")
	@NotBlank(message="Should be valid  value")
	private String dt;
	public String getDeviceid() {
		return deviceid;
	}
	public void setDeviceid(String deviceid) {
		this.deviceid = deviceid;
	}
	public String getDid() {
		return did;
	}
	public void setDid(String did) {
		this.did = did;
	}
	public String getSimid() {
		return simid;
	}
	public void setSimid(String simid) {
		this.simid = simid;
	}
	public String getSlotid() {
		return slotid;
	}
	public void setSlotid(String slotid) {
		this.slotid = slotid;
	}
	public String getDc() {
		return dc;
	}
	public void setDc(String dc) {
		this.dc = dc;
	}
	public String getDt() {
		return dt;
	}
	public void setDt(String dt) {
		this.dt = dt;
	}
	

}
