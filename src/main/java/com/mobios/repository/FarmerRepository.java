package com.mobios.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mobios.model.Farmer;

public interface FarmerRepository extends JpaRepository<Farmer, String> {

	Farmer findFarmerByMobileNo(String mobileNo);
}
