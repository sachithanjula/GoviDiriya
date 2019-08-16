package com.mobios.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mobios.model.LandDivision;

@Repository
public interface GDLandDivisionRepository extends JpaRepository<LandDivision, Integer>{
	
	List<LandDivision> findByProvinceId(int districtId);

}
