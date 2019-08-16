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
@Table(name="cx_land_gn_division")
@EntityListeners(AuditingEntityListener.class)
public class GnDivition implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int gnDivisionAutoId;
	
	private int provinceId;
	
	private int districtId;
	
	private int divisionId;
	
	private String gnDivisionName;

	/**
	 * @return the gnDivisionAutoId
	 */
	public int getGnDivisionAutoId() {
		return gnDivisionAutoId;
	}

	/**
	 * @param gnDivisionAutoId the gnDivisionAutoId to set
	 */
	public void setGnDivisionAutoId(int gnDivisionAutoId) {
		this.gnDivisionAutoId = gnDivisionAutoId;
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
	 * @return the divisionId
	 */
	public int getDivisionId() {
		return divisionId;
	}

	/**
	 * @param divisionId the divisionId to set
	 */
	public void setDivisionId(int divisionId) {
		this.divisionId = divisionId;
	}

	/**
	 * @return the gnDivisionName
	 */
	public String getGnDivisionName() {
		return gnDivisionName;
	}

	/**
	 * @param gnDivisionName the gnDivisionName to set
	 */
	public void setGnDivisionName(String gnDivisionName) {
		this.gnDivisionName = gnDivisionName;
	}
	
	

}
