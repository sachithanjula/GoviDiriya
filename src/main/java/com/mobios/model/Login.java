package com.mobios.model;

public class Login {
	public String mobile;
	public String password;
	
	/**
	 * 
	 */
	public Login() {
		super();
	}

	/**
	 * @param mobile
	 * @param password
	 */
	public Login(String mobile, String password) {
		super();
		this.mobile = mobile;
		this.password = password;
	}

	/**
	 * @return the mobile
	 */
	public String getMobile() {
		return mobile;
	}

	/**
	 * @param mobile the mobile to set
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

}
