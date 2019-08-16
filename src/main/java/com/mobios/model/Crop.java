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
@Table(name="cx_crop_list")
@EntityListeners(AuditingEntityListener.class)
public class Crop implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cxCropListAutoID;
	
	private String cxCropListName;

	/**
	 * @return the cxCropListAutoID
	 */
	public int getCxCropListAutoID() {
		return cxCropListAutoID;
	}

	/**
	 * @param cxCropListAutoID the cxCropListAutoID to set
	 */
	public void setCxCropListAutoID(int cxCropListAutoID) {
		this.cxCropListAutoID = cxCropListAutoID;
	}

	/**
	 * @return the cxCropListName
	 */
	public String getCxCropListName() {
		return cxCropListName;
	}

	/**
	 * @param cxCropListName the cxCropListName to set
	 */
	public void setCxCropListName(String cxCropListName) {
		this.cxCropListName = cxCropListName;
	}

	
}
