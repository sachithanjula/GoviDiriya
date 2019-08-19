package com.mobios.excepion;

public class Validation {

	public String validateMobile(String mobile) {

		String mobileRep = mobile;
		try {
			if (mobile.length() == 10) {
				if (mobile.charAt(0) == '0' && mobile.matches("^[0-9]+$")) {
					return mobileRep = mobile.replace(mobile.substring(0, 1), "94");
				}
			} else if (mobile.length() == 11) {
				if (mobile.substring(0, 2).equals("94") && mobile.matches("^[0-9]+$")) {
					return mobileRep = mobile;
				}
			} else if (mobile.length() == 12) {
				if (mobile.substring(0, 3).equals("+94") && mobile.matches("^[+][0-9]+$")) {
					return mobileRep = mobile.replace(mobile.substring(0, 3), "94");
				}
			}else if(mobile.length() == 9 && mobile.matches("^[0-9]+$")) {
				if(mobile.substring(0, 1).equals("7")) {
					return mobileRep = mobile.replace(mobile.substring(0, 1), "947");
				}
			}
		} catch (Exception e) {
			return mobileRep;
		}
		return mobileRep;

	}

}
