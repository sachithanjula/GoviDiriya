package com.mobios.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mobios.model.Farmer;
import com.mobios.model.Province;
import com.mobios.repository.FarmerRepository;
import com.mobios.repository.OTPRepository;

@RestController
@RequestMapping("/api/govidiriya/mob")
public class FarmerController {
	@Autowired
	FarmerRepository farmerRepository;

	@GetMapping("/otp/{mobile}")
	public Farmer getAllProvinces(@PathVariable(value = "mobile") String mobileNo) {
		return farmerRepository.findFarmerByMobileNo(mobileNo);
	}

	
	@PostMapping("/password")
	public Farmer setPassword(@RequestBody Farmer farmer) {
		String mob = farmer.getMobileNo();
		
		Farmer _farmer = farmerRepository.findFarmerByMobileNo(mob);
		
		farmer.setId(_farmer.getId());
		farmer.setNIC(_farmer.getNIC());
		
		return farmerRepository.save(farmer);

	}

}
