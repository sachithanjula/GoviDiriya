package com.mobios.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mobios.excepion.Validation;
import com.mobios.model.Device;
import com.mobios.model.Farmer;
import com.mobios.model.Login;
import com.mobios.model.PasswordAuthenticate;
import com.mobios.model.Responses.LoginResponse;
import com.mobios.model.Responses.OTPResponse;
import com.mobios.repository.DeviceRepository;
import com.mobios.repository.FarmerRepository;

@RestController
@RequestMapping("/api/govidiriya")
public class LoginController {

	Validation valid = new Validation();

	@Autowired
	DeviceRepository deviceRepository;

	@Autowired
	FarmerRepository farmerRepository;

	@PostMapping("/register/password")
	public OTPResponse addDevice(@RequestBody PasswordAuthenticate passAuthen) {

		System.out.println("passAuthen: " + passAuthen);

		String _reqMobile = passAuthen.getMobile();
		String _reqPassword = passAuthen.getPassword();
		String _reqDeviceName = passAuthen.getDeviceName();

		String validmobile = valid.validateMobile(_reqMobile);

		System.out.println("---------- validmobile ----- " + validmobile);
		if (_reqMobile != null || _reqPassword != null || _reqDeviceName != null) {
			OTPResponse otpResponse = new OTPResponse("300", "Succesfully saved");
			String mobileNo = passAuthen.getMobile();
			mobileNo = valid.validateMobile(mobileNo);
			String deviceName = passAuthen.getDeviceName();

			try {
				Farmer _farmer = farmerRepository.findFarmerByMobileNo(mobileNo);
				System.out.println("_farmer.getMobileNo() : " + _farmer.getMobileNo());

				if (_farmer.getMobileNo().equals(mobileNo)) {
					if (_farmer.getPassword() != null) {
						return new OTPResponse("002", "Already registered");
					} else {
						int id = _farmer.getId();
						String nIC = _farmer.getNIC();
						String password = passAuthen.getPassword();

						Farmer farmer = new Farmer(id, mobileNo, nIC, password);
						farmerRepository.save(farmer);

						Device device = new Device(mobileNo, deviceName);
						deviceRepository.save(device);

						return new OTPResponse("002", "New Password Added and Device added");
					}
				}
			} catch (Exception e) {
				System.out.println("Exception  :" + e.toString());
				return new OTPResponse("302", "The Mobile number is not in Database");
			}

		} else {
			return new OTPResponse("304", "Error Jason");

		}
		return null;

	}

	@GetMapping("/login/{device}/{mobile}")
	public OTPResponse getLoginDetails(@PathVariable(value = "device") String device,
			@PathVariable(value = "mobile") String mobile) {
		System.out.println(device + "  " + mobile);
		
		try {
			Device _device = deviceRepository.findDeviceByDeviceName(device);
			System.out.println(_device.getDeviceName());

			if (_device.getMobile().equals(mobile)) {
				return new OTPResponse("500", "The mobile sent tallies with the database");
				
			} else {
				return new OTPResponse("501", "The mobile sent doesnt tally with the database");
			}
		} catch (Exception e) {
			return new OTPResponse("502", "The device is not in the database");
		}
		

	}

	@PostMapping("/login")
	public LoginResponse login(@RequestBody Login login) {
		String _mobile = login.getMobile();
		String _password = login.getPassword();

		_mobile = valid.validateMobile(_mobile);
		System.out.println("_mobile  : " + _mobile);
		try {
			Farmer _farmer = farmerRepository.findFarmerByMobileNo(_mobile);
			if (_farmer.getPassword().equals(_password)) {
				return new LoginResponse("200", "Sucessfully Logged in", _farmer.getNIC(), _farmer.getMobileNo());

			} else {
				return new LoginResponse("204", "Password not match", "null", "null");
			}
		} catch (Exception e) {
			return new LoginResponse("203", "Error JSON Request", "null", "null");
		}
	}

}
