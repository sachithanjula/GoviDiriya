package com.mobios.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mobios.model.Province;

public interface GDRepository extends JpaRepository<Province, Integer>{
	
	

}
