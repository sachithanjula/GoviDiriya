package com.mobios.model.Responses;

public class LoginResponse {

	public String _resCode;
	public String _resMsg;
	public String nic;
	public String mobile;
	
	

	/**
	 * @param _resCode
	 * @param _resMsg
	 * @param nic
	 * @param mobile
	 */
	public LoginResponse(String _resCode, String _resMsg, String nic, String mobile) {
		super();
		this._resCode = _resCode;
		this._resMsg = _resMsg;
		this.nic = nic;
		this.mobile = mobile;
	}

	/**
	 * @return the _resCode
	 */
	public String get_resCode() {
		return _resCode;
	}

	/**
	 * @param _resCode the _resCode to set
	 */
	public void set_resCode(String _resCode) {
		this._resCode = _resCode;
	}

	/**
	 * @return the _resMsg
	 */
	public String get_resMsg() {
		return _resMsg;
	}

	/**
	 * @param _resMsg the _resMsg to set
	 */
	public void set_resMsg(String _resMsg) {
		this._resMsg = _resMsg;
	}

	/**
	 * @return the nic
	 */
	public String getNic() {
		return nic;
	}

	/**
	 * @param nic the nic to set
	 */
	public void setNic(String nic) {
		this.nic = nic;
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

}
