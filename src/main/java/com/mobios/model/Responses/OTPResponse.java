package com.mobios.model.Responses;

public class OTPResponse {
	String _resCode;
	String _resMessage;

	/**
	 * @param _resCode
	 * @param _resMessage
	 */
	public OTPResponse(String _resCode, String _resMessage) {
		super();
		this._resCode = _resCode;
		this._resMessage = _resMessage;
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
	 * @return the _resMessage
	 */
	public String get_resMessage() {
		return _resMessage;
	}

	/**
	 * @param _resMessage the _resMessage to set
	 */
	public void set_resMessage(String _resMessage) {
		this._resMessage = _resMessage;
	}

}
