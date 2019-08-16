package com.mobios.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mobios.model.Crop;

@Repository
public interface CropRepository extends JpaRepository<Crop, Integer>{
	
}
