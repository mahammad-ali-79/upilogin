package com.fincare.upiprelogin.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
public class Registration {
	
    @NotNull(message="Should be unique 16 digit number with branch code")
    @NotBlank(message="Should not be blank")
	private String otptoken;
    @NotNull(message="should be same as RegPoll")
    @NotBlank(message="Should not be blank")
	private String userRegID;
    @NotBlank(message="Should not be blank")
    @Pattern(regexp="(^$|[0-9]{10})")
    @NotNull(message="Mobile Number should not be null")
	private String mobileno;
    @NotBlank(message="Should not be blank")
    @NotNull(message="Name should not be null")
	private String name;
    @NotBlank(message="Should not be blank")
    @NotNull(message="Email should not be null")
	private String email;
    @NotBlank(message="Should not be blank")
    @NotNull(message="UserName should not be null")
	private String username;
    @NotBlank(message="Should not be blank")
    @NotNull(message="Password should not be null")
	private String password;
    @NotBlank(message="Should not be blank")
    @NotNull(message="VPA Number should not be null")
	private String vpa;
	private String sq1;
	private String sa1;
	private String sq2;
	private String sa2;
    @NotBlank(message="Should not be blank")
    @NotNull(message="IMEI Number should not be null")
	private String imei;
    @NotBlank(message="Should not be blank")
    @NotNull(message="Platform should not be null")
	private String platform;
    @NotBlank(message="Should not be blank")
    @NotNull(message="Device Make should not be null")
	private String devicemake;
    @NotBlank(message="Should not be blank")
    @NotNull(message="Device Model should not be null")
	private String devicemodel;
    @NotBlank(message="Should not be blank")
    @NotNull(message="Screen Width should not be null")
	private String screenwidth;
    @NotBlank(message="Should not be blank")
    @NotNull(message="Screen Height should not be null")
	private String screenheight;
    @NotBlank(message="Should not be blank")
    @NotNull(message="Os Version should not be null")
	private String osversion;
    @NotBlank(message="Should not be blank")
    @NotNull(message="Push Token should not be null")
	private String pushtoken;
    @NotBlank(message="Should not be blank")
    @NotNull(message="Dt should not be null")
	private String dt;
    @NotBlank(message="Should not be blank")
    @NotNull(message="App Version should not be null")
	private String appversion;
    
	public String getDt() {
		return dt;
	}
	public String getAppversion() {
		return appversion;
	}
	public void setAppversion(String appversion) {
		this.appversion = appversion;
	}
	public void setDt(String dt) {
		this.dt = dt;
	}
	public String getOtptoken() {
		return otptoken;
	}
	public void setOtptoken(String otptoken) {
		this.otptoken = otptoken;
	}
	public String getUserRegID() {
		return userRegID;
	}
	public void setUserRegID(String userRegID) {
		this.userRegID = userRegID;
	}
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getVpa() {
		return vpa;
	}
	public void setVpa(String vpa) {
		this.vpa = vpa;
	}
	public String getSq1() {
		return sq1;
	}
	public void setSq1(String sq1) {
		this.sq1 = sq1;
	}
	public String getSa1() {
		return sa1;
	}
	public void setSa1(String sa1) {
		this.sa1 = sa1;
	}
	public String getSq2() {
		return sq2;
	}
	public void setSq2(String sq2) {
		this.sq2 = sq2;
	}
	public String getSa2() {
		return sa2;
	}
	public void setSa2(String sa2) {
		this.sa2 = sa2;
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

}
