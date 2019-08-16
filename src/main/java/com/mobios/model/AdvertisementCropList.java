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
@Table(name="cx_advertisement_crop_list")
@EntityListeners(AuditingEntityListener.class)
public class AdvertisementCropList implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cxCropListAdvAutoID;
	
	private int cxAdvertisementId;
	
	private int cxCropMonthId;
	
	private int cxCropListId;

	/**
	 * @return the cxCropListAdvAutoID
	 */
	public int getCxCropListAdvAutoID() {
		return cxCropListAdvAutoID;
	}

	/**
	 * @param cxCropListAdvAutoID the cxCropListAdvAutoID to set
	 */
	public void setCxCropListAdvAutoID(int cxCropListAdvAutoID) {
		this.cxCropListAdvAutoID = cxCropListAdvAutoID;
	}

	/**
	 * @return the cxAdvertisementId
	 */
	public int getCxAdvertisementId() {
		return cxAdvertisementId;
	}

	/**
	 * @param cxAdvertisementId the cxAdvertisementId to set
	 */
	public void setCxAdvertisementId(int cxAdvertisementId) {
		this.cxAdvertisementId = cxAdvertisementId;
	}

	/**
	 * @return the cxCropMonthId
	 */
	public int getCxCropMonthId() {
		return cxCropMonthId;
	}

	/**
	 * @param cxCropMonthId the cxCropMonthId to set
	 */
	public void setCxCropMonthId(int cxCropMonthId) {
		this.cxCropMonthId = cxCropMonthId;
	}

	/**
	 * @return the cxCropListId
	 */
	public int getCxCropListId() {
		return cxCropListId;
	}

	/**
	 * @param cxCropListId the cxCropListId to set
	 */
	public void setCxCropListId(int cxCropListId) {
		this.cxCropListId = cxCropListId;
	}

	
}
