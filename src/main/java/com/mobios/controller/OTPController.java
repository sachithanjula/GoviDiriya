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


import com.mobios.model.Farmer;
import com.mobios.model.OTP;
import com.mobios.repository.FarmerRepository;
import com.mobios.repository.OTPRepository;


@RestController
@RequestMapping("/api/govidiriya")
public class OTPController {

	@Autowired
	OTPRepository otpRepository;
	
	@Autowired
	FarmerRepository farmerRepository;

	@GetMapping("/otp/check/{otp}/{mobile}")
	public OTP checkOTP(@PathVariable(value = "otp") String otp,@PathVariable(value = "mobile") int mobile) {
		
		OTP Otp = otpRepository.findOTPByMobile(mobile);
		String resOtp = Otp.getOtp();
		
		if(resOtp.equals(otp)) {
			System.out.print(otpRepository.findOTPByMobile(mobile));
			return otpRepository.findOTPByMobile(mobile);
			
		}else {
			System.out.print(resOtp +" : not equal to "+otp);
			return null;
		}
	}
	
	
	/**
	 * @param mobile
	 * @return
	 */
	@GetMapping("/otp/{mobile}")
	public int getOTP(@PathVariable(value = "mobile") int mobile) {

		String mobileS = String.valueOf(mobile);
		getFarmerByMobile(mobileS);
		
		if (getFarmerByMobile(mobileS) != null) {
			String numbers = "0123456789";

			Random r = new Random(System.currentTimeMillis());
			int otp = 10000 + r.nextInt(20000);
			
			SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
			Date date = new Date();
			String dateTime = formatter.format(date);
			
			OTP Otp = new OTP(mobile,String.valueOf(otp),dateTime);
			
			Otp.setMobile(mobile);
			Otp.setOtp(String.valueOf(otp));
			Otp.setDateTime(dateTime);
						
			saveOTP(Otp);
			
			//sendSMS(mobile, String.valueOf(otp));
			return otp;
			
		} else {
			return 0;
		}
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
		return farmerRepository.findFarmerByMobileNo(mobileNo);

	}

	
	
	private String sendSMS(int mobile, String otp) {

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
