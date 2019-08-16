package com.mobios.excepion;

public class ErrorHandler {

	private String code;
	private String description;
	
	
	
	/**
	 * @param code
	 * @param description
	 */
	public ErrorHandler(String code, String description) {
		super();
		this.code = code;
		this.description = description;
	}
	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}
	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
