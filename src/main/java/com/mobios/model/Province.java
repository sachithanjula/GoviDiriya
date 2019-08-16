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
	private int provinceAutoID;
	
	private String provinceName;

	/**
	 * @return the provinceAutoID
	 */
	public int getProvinceAutoID() {
		return provinceAutoID;
	}

	/**
	 * @param provinceAutoID the provinceAutoID to set
	 */
	public void setProvinceAutoID(int provinceAutoID) {
		this.provinceAutoID = provinceAutoID;
	}

	/**
	 * @return the provinceName
	 */
	public String getProvinceName() {
		return provinceName;
	}

	/**
	 * @param provinceName the provinceName to set
	 */
	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}

	

}
