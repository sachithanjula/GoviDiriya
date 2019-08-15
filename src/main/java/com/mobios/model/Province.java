package com.mobios.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.*;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="cx_land_province")
@EntityListeners(AuditingEntityListener.class)
public class Province implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int province_autoID;
	
	@NotBlank
	private String province_name;

	/**
	 * @return the province_autoID
	 */
	public int getProvince_autoID() {
		return province_autoID;
	}

	/**
	 * @param province_autoID the province_autoID to set
	 */
	public void setProvince_autoID(int province_autoID) {
		this.province_autoID = province_autoID;
	}

	/**
	 * @return the province_name
	 */
	public String getProvince_name() {
		return province_name;
	}

	/**
	 * @param province_name the province_name to set
	 */
	public void setProvince_name(String province_name) {
		this.province_name = province_name;
	}
	
	
	

}
