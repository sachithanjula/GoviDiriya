package com.mobios.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mobios.model.OTP;

public interface OTPRepository extends JpaRepository<OTP, String> {

	OTP findOTPByMobile (String mobile);

	

}
