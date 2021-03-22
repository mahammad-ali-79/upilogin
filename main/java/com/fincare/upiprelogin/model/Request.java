package com.fincare.upiprelogin.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Request {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@JsonIgnore
	private long id;
	@Column(name="request", columnDefinition = "LONGTEXT")
	private List<Parameters> params;
	@JsonIgnore
	@Column
	private int deviceId;
	@JsonIgnore
	@Column
	private String initiatorId;
	@JsonIgnore
	@Column
	private String service;
	
	public List<Parameters> getParams() {
		return params;
	}
	public void setParams(List<Parameters> params) {
		this.params = params;
	}
	
	public int getDeviceId() {
		return deviceId;
	}
	public void setDeviceId(int deviceId) {
		this.deviceId = deviceId;
	}
	public String getInitiatorId() {
		return initiatorId;
	}
	public void setInitiatorId(String initiatorId) {
		this.initiatorId = initiatorId;
	}
	public String getService() {
		return service;
	}
	public void setService(String service) {
		this.service = service;
	}
	@Override
	public String toString() {
		return "{params=" + params + ", deviceId=" + deviceId + ", initiatorId=" + initiatorId + ", service="
				+ service + "}";
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}

	

}
