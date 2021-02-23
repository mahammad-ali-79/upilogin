package com.fincare.upiprelogin.model;

import java.util.List;

public class Request {
	
	private List<Parameters> params;
	private int deviceId;
	private String initiatorId;
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

	

}
