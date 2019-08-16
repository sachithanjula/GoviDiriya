package com.mobios.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.mobios.model.LandType;

@Repository
public interface LandTypeRepository extends JpaRepository<LandType, Integer>{

}
