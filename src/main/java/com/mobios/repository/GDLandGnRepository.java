package com.mobios.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mobios.model.GnDivition;

@Repository
public interface GDLandGnRepository extends JpaRepository<GnDivition, Integer>{
	
	List<GnDivition> findByDivisionId(int diviId);

}
