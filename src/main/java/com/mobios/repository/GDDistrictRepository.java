package com.mobios.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mobios.model.District;

@Repository
public interface GDDistrictRepository extends JpaRepository<District, Integer>{
	List<District> findByProvinceId(int provinceId);
	
}
