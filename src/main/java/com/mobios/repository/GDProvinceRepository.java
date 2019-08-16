package com.mobios.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mobios.model.Province;

@Repository
public interface GDProvinceRepository extends JpaRepository<Province, Integer>{
	
}
