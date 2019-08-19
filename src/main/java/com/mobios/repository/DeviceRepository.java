package com.mobios.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mobios.model.Device;
import com.mobios.model.Farmer;

public interface DeviceRepository extends JpaRepository<Device, Integer> {
	
	Device findDeviceByDeviceName(String deviceName);

}
