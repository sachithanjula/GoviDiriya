package com.mobios.controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;

import javax.validation.Valid;

import org.hibernate.jpa.criteria.expression.function.AggregationFunction.COUNT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mobios.excepion.Validation;
import com.mobios.model.Farmer;
import com.mobios.model.OTP;
import com.mobios.model.Responses.OTPResponse;
import com.mobios.repository.FarmerRepository;
import com.mobios.repository.OTPRepository;

@RestController
@RequestMapping("/api/govidiriya")
public class OTPController {

	@Autowired
	OTPRepository otpRepository;

	@Autowired
	FarmerRepository farmerRepository;
	
	
	SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
	Date date = new Date();
	String dateTime = formatter.format(date);

	@GetMapping("/otp/check/{otp}/{mobile}")
	public OTPResponse checkOTP(@PathVariable(value = "otp") String otp, @PathVariable(value = "mobile") String mobile) {

		OTP Otp = otpRepository.findOTPByMobile(mobile);
		String resOtp = Otp.getOtp();

		if (resOtp.equals(otp)) {
			System.out.print(otpRepository.findOTPByMobile(mobile));

			return new OTPResponse("202", "OTP tallies with the database entry");

		} else {
			System.out.print(resOtp + " : not equal to " + otp);
			return new OTPResponse("203", "OTP doesnot Tally with Database");
		}

	}

	/**
	 * @param mobile
	 * @return
	 */
	@GetMapping("/otp/{mobile}")
	public OTPResponse getOTP(@PathVariable(value = "mobile") String mobile) {

		String mobileS = mobile;
		
		Validation validation = new Validation();
		mobileS =validation.validateMobile(mobileS);
		
		System.out.println(mobileS);
		getFarmerByMobile(mobileS);
		
		if (getFarmerByMobile(mobileS) != null) {
			String numbers = "0123456789";

			Random r = new Random(System.currentTimeMillis());
			int otp = 10000 + r.nextInt(20000);

			OTP Otp = new OTP(mobileS, String.valueOf(otp), dateTime);

			OTPResponse otpResponse = new OTPResponse("200", "Mobile is in Database . OTP Sent successfully");

			if (otpRepository.findOTPByMobile(mobileS) != null) {
				System.out.println("inside update");
				updateOTP(mobileS,otp);
				return new OTPResponse("206", "Resend OTP Database Update");

			} else {
				Otp.setMobile(mobileS);
				Otp.setOtp(String.valueOf(otp));
				Otp.setDateTime(dateTime);
				saveOTP(Otp);
			}

			// sendSMS(mobile, String.valueOf(otp));
			return otpResponse;

		} else {
			return new OTPResponse("201", "Mobile Number is not in database");
		}
	}

	
	private OTP updateOTP(String mobile, int otp) {
		OTP Otp = otpRepository.findOTPByMobile(mobile);
		Otp.setMobile(mobile);
		Otp.setOtp(String.valueOf(otp));
		Otp.setDateTime(dateTime);
		
		return otpRepository.save(Otp);
		
	}

	private OTP saveOTP(OTP otp) {
		return otpRepository.save(otp);
	}

	/**
	 * @param mobileNo
	 * @return
	 */
	private Farmer getFarmerByMobile(String mobileNo) {
		Farmer farmer = farmerRepository.findFarmerByMobileNo(mobileNo);
		return farmer;
	}

	private String sendSMS(String mobile, String otp) {

		String url = "http://122.255.29.68:5000/sms/send_sms.php?username=mobios_alert&password=Mo321Ar&src=SMSDEMO&dst="
				+ mobile + "&msg=" + otp + "&dr=1 ";

		StringBuffer response = null;
		String converted_response = "";

		try {

			URL obj = new URL(url);
			HttpURLConnection con = (HttpURLConnection) obj.openConnection();

			// optional default is GET
			con.setRequestMethod("GET");

			int responseCode = con.getResponseCode();
			System.out.println("\nSending 'GET' request to URL : " + url);
			System.out.println("Response Code : " + responseCode);

			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String inputLine;
			response = new StringBuffer();

			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
			in.close();
			converted_response = response.toString();

		} catch (Exception e) {
			System.out.println("Exception in Client.sendSMS " + e.toString());
			converted_response = "xxxxxxxxxx_message_not_success_xxxxxxxxxx";
		}

		return converted_response;
	}

}
