package com.fincare.upiprelogin.model;

import java.util.List;

public class Response {
	
	private String serv;
	private List<Parameters> op;
	private String error;
	private String errors;
	public String getServ() {
		return serv;
	}
	public void setServ(String serv) {
		this.serv = serv;
	}
	
	public List<Parameters> getOp() {
		return op;
	}
	public void setOp(List<Parameters> op) {
		this.op = op;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	public String getErrors() {
		return errors;
	}
	public void setErrors(String errors) {
		this.errors = errors;
	}

}
