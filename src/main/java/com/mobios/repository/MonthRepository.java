package com.mobios.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mobios.model.Month;

@Repository
public interface MonthRepository extends JpaRepository<Month, Integer>{
	

}
