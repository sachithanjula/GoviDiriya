package com.mobios.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="cx_land_district")
@EntityListeners(AuditingEntityListener.class)
public class District implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int districtAutoID;
	
	private String districtName;
	
	private int provinceId;

	/**
	 * @return the districtAutoID
	 */
	public int getDistrictAutoID() {
		return districtAutoID;
	}

	/**
	 * @param districtAutoID the districtAutoID to set
	 */
	public void setDistrictAutoID(int districtAutoID) {
		this.districtAutoID = districtAutoID;
	}

	/**
	 * @return the districtName
	 */
	public String getDistrictName() {
		return districtName;
	}

	/**
	 * @param districtName the districtName to set
	 */
	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	/**
	 * @return the provinceId
	 */
	public int getProvinceId() {
		return provinceId;
	}

	/**
	 * @param provinceId the provinceId to set
	 */
	public void setProvinceId(int provinceId) {
		this.provinceId = provinceId;
	}

	

}
