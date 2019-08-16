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
@Table(name="cx_land_type")
@EntityListeners(AuditingEntityListener.class)
public class LandType implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cxLandTypeAutoId;
	
	private String cxLandTypes;

	/**
	 * @return the cxLandTypeAutoId
	 */
	public int getCxLandTypeAutoId() {
		return cxLandTypeAutoId;
	}

	/**
	 * @param cxLandTypeAutoId the cxLandTypeAutoId to set
	 */
	public void setCxLandTypeAutoId(int cxLandTypeAutoId) {
		this.cxLandTypeAutoId = cxLandTypeAutoId;
	}

	/**
	 * @return the cxLandTypes
	 */
	public String getCxLandTypes() {
		return cxLandTypes;
	}

	/**
	 * @param cxLandTypes the cxLandTypes to set
	 */
	public void setCxLandTypes(String cxLandTypes) {
		this.cxLandTypes = cxLandTypes;
	} 
	
	

}
