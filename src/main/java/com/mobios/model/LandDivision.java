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
@Table(name="cx_land_division")
@EntityListeners(AuditingEntityListener.class)
public class LandDivision implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int divisionAutoID;
	
	private int districtId;
	
	private int provinceId;
	
	private String divisionName;

	/**
	 * @return the divisionAutoID
	 */
	public int getDivisionAutoID() {
		return divisionAutoID;
	}

	/**
	 * @param divisionAutoID the divisionAutoID to set
	 */
	public void setDivisionAutoID(int divisionAutoID) {
		this.divisionAutoID = divisionAutoID;
	}

	/**
	 * @return the districtId
	 */
	public int getDistrictId() {
		return districtId;
	}

	/**
	 * @param districtId the districtId to set
	 */
	public void setDistrictId(int districtId) {
		this.districtId = districtId;
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

	/**
	 * @return the divisionName
	 */
	public String getDivisionName() {
		return divisionName;
	}

	/**
	 * @param divisionName the divisionName to set
	 */
	public void setDivisionName(String divisionName) {
		this.divisionName = divisionName;
	}

	
	
}
