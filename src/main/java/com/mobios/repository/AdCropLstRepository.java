package com.mobios.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mobios.model.AdvertisementCropList;

@Repository
public interface AdCropLstRepository extends JpaRepository<AdvertisementCropList, Integer>{

}
