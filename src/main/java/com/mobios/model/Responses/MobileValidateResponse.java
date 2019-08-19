package com.mobios.model.Responses;

public class MobileValidateResponse {
	String _mobileNo;
	String _resMsg;
	String _resCode;
	
	
	/**
	 * 
	 */
	public MobileValidateResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param _mobileNo
	 * @param _resMsg
	 * @param _resCode
	 */
	public MobileValidateResponse(String _mobileNo, String _resMsg, String _resCode) {
		super();
		this._mobileNo = _mobileNo;
		this._resMsg = _resMsg;
		this._resCode = _resCode;
	}
	/**
	 * @return the _mobileNo
	 */
	public String get_mobileNo() {
		return _mobileNo;
	}
	/**
	 * @param _mobileNo the _mobileNo to set
	 */
	public void set_mobileNo(String _mobileNo) {
		this._mobileNo = _mobileNo;
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
	
	
	
}
