package com.fincare.upiprelogin.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class UpdateRegOTP {
	
	@NotNull(message="Should not be null value")
	@NotBlank(message="Should be Randomly generated Unique number")
	private String otptoken;
	@NotNull(message="Should not be null value")
	@NotBlank(message="Should be Randomly generated Unique number")
	private int otp;
	@NotNull(message="Should not be null value")
	@NotBlank(message="Should be Randomly generated Unique number")
	private int mailotp;
	@NotNull(message="Should not be null value")
	@NotBlank(message="Should be valid Userid")
	private String userregid;
	@NotNull(message="Should not be null value")
	@NotBlank(message="Should be valid customerid")
	private String customerid;
	@NotNull(message="Should not be null value")
	@NotBlank(message="Should be valid password")
	private String password;
	@NotNull(message="Should not be null value")
	@NotBlank(message="Should be valid Secans1")
	private String secans1;
	@NotNull(message="Should not be null value")
	@NotBlank(message="Should be valid Secans2")
	private String secans2;
	@NotNull(message="Should not be null value")
	@NotBlank(message="Should be valid imei")
	private String imei;
	@NotNull(message="Should not be null value")
	@NotBlank(message="Should be valid platform")
	private String platform;
	@NotNull(message="Should not be null value")
	@NotBlank(message="Should be valid deviceMake")
	private String devicemake;
	@NotNull(message="Should not be null value")
	@NotBlank(message="Should be valid devicemodel")
	private String devicemodel;
	@NotNull(message="Should not be null value")
	@NotBlank(message="Should be valid screen Width")
	private String screenwidth;
	@NotNull(message="Should not be null value")
	@NotBlank(message="Should be valid Screen Height")
	private String screenheight;
	@NotNull(message="Should not be null value")
	@NotBlank(message="Should be valid osversion")
	private String osversion;
	@NotNull(message="Should not be null value")
	@NotBlank(message="Should be valid pushtoken")
	private String pushtoken;
	@NotNull(message="Should not be null value")
	@NotBlank(message="Should be valid dt")
	private String dt;
	@NotNull(message="Should not be null value")
	@NotBlank(message="Should be valid appversion")
	private String appversion;

	public String getOtptoken() {
		return otptoken;
	}

	public void setOtptoken(String otptoken) {
		this.otptoken = otptoken;
	}

	public String getUserregid() {
		return userregid;
	}

	public void setUserregid(String userregid) {
		this.userregid = userregid;
	}

	public String getCustomerid() {
		return customerid;
	}

	public void setCustomerid(String customerid) {
		this.customerid = customerid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSecans1() {
		return secans1;
	}

	public void setSecans1(String secans1) {
		this.secans1 = secans1;
	}

	public String getSecans2() {
		return secans2;
	}

	public void setSecans2(String secans2) {
		this.secans2 = secans2;
	}

	public String getImei() {
		return imei;
	}

	public void setImei(String imei) {
		this.imei = imei;
	}

	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public String getDevicemake() {
		return devicemake;
	}

	public void setDevicemake(String devicemake) {
		this.devicemake = devicemake;
	}

	public String getDevicemodel() {
		return devicemodel;
	}

	public void setDevicemodel(String devicemodel) {
		this.devicemodel = devicemodel;
	}

	public String getScreenwidth() {
		return screenwidth;
	}

	public void setScreenwidth(String screenwidth) {
		this.screenwidth = screenwidth;
	}

	public String getScreenheight() {
		return screenheight;
	}

	public void setScreenheight(String screenheight) {
		this.screenheight = screenheight;
	}

	public String getOsversion() {
		return osversion;
	}

	public void setOsversion(String osversion) {
		this.osversion = osversion;
	}

	public String getPushtoken() {
		return pushtoken;
	}

	public void setPushtoken(String pushtoken) {
		this.pushtoken = pushtoken;
	}

	public String getDt() {
		return dt;
	}

	public void setDt(String dt) {
		this.dt = dt;
	}

	public String getAppversion() {
		return appversion;
	}

	public void setAppversion(String appversion) {
		this.appversion = appversion;
	}

	public int getOtp() {
		return otp;
	}

	public void setOtp(int otp) {
		this.otp = otp;
	}

	public int getMailotp() {
		return mailotp;
	}

	public void setMailotp(int mailotp) {
		this.mailotp = mailotp;
	}



}
