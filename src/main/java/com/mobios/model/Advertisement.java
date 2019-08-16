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
@Table(name = "cx_advertisement")
@EntityListeners(AuditingEntityListener.class)
public class Advertisement implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String mobile;

	private String NIC;

	private String district;

	private String province;

	private String division;

	private String gramaNiladariDiv;

	private String landName;

	private int landArea;

	private int expectedInvestType;

	private String expectedInvestment;

	private String expectedReturnType;

	private String createdDateTime;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the mobile
	 */
	public String getMobile() {
		return mobile;
	}

	/**
	 * @param mobile the mobile to set
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	/**
	 * @return the nIC
	 */
	public String getNIC() {
		return NIC;
	}

	/**
	 * @param nIC the nIC to set
	 */
	public void setNIC(String nIC) {
		NIC = nIC;
	}

	/**
	 * @return the district
	 */
	public String getDistrict() {
		return district;
	}

	/**
	 * @param district the district to set
	 */
	public void setDistrict(String district) {
		this.district = district;
	}

	/**
	 * @return the province
	 */
	public String getProvince() {
		return province;
	}

	/**
	 * @param province the province to set
	 */
	public void setProvince(String province) {
		this.province = province;
	}

	/**
	 * @return the division
	 */
	public String getDivision() {
		return division;
	}

	/**
	 * @param division the division to set
	 */
	public void setDivision(String division) {
		this.division = division;
	}

	/**
	 * @return the gramaNiladariDiv
	 */
	public String getGramaNiladariDiv() {
		return gramaNiladariDiv;
	}

	/**
	 * @param gramaNiladariDiv the gramaNiladariDiv to set
	 */
	public void setGramaNiladariDiv(String gramaNiladariDiv) {
		this.gramaNiladariDiv = gramaNiladariDiv;
	}

	/**
	 * @return the landName
	 */
	public String getLandName() {
		return landName;
	}

	/**
	 * @param landName the landName to set
	 */
	public void setLandName(String landName) {
		this.landName = landName;
	}

	/**
	 * @return the landArea
	 */
	public int getLandArea() {
		return landArea;
	}

	/**
	 * @param landArea the landArea to set
	 */
	public void setLandArea(int landArea) {
		this.landArea = landArea;
	}

	/**
	 * @return the expectedInvestType
	 */
	public int getExpectedInvestType() {
		return expectedInvestType;
	}

	/**
	 * @param expectedInvestType the expectedInvestType to set
	 */
	public void setExpectedInvestType(int expectedInvestType) {
		this.expectedInvestType = expectedInvestType;
	}

	/**
	 * @return the expectedInvestment
	 */
	public String getExpectedInvestment() {
		return expectedInvestment;
	}

	/**
	 * @param expectedInvestment the expectedInvestment to set
	 */
	public void setExpectedInvestment(String expectedInvestment) {
		this.expectedInvestment = expectedInvestment;
	}

	/**
	 * @return the expectedReturnType
	 */
	public String getExpectedReturnType() {
		return expectedReturnType;
	}

	/**
	 * @param expectedReturnType the expectedReturnType to set
	 */
	public void setExpectedReturnType(String expectedReturnType) {
		this.expectedReturnType = expectedReturnType;
	}

	/**
	 * @return the createdDateTime
	 */
	public String getCreatedDateTime() {
		return createdDateTime;
	}

	/**
	 * @param createdDateTime the createdDateTime to set
	 */
	public void setCreatedDateTime(String createdDateTime) {
		this.createdDateTime = createdDateTime;
	}

}
