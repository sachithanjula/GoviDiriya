package com.mobios.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mobios.model.Advertisement;

@Repository
public interface AdvertisementRepository extends JpaRepository<Advertisement, Integer>{

}
