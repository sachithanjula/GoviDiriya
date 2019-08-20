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
	
	private String cxCropListName;
	
	private String cx_crop_duration;
	

	/**
	 * 
	 */
	public AdvertisementCropList() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param cxAdvertisementId
	 * @param cxCropMonthId
	 * @param cxCropListName
	 * @param cx_crop_duration
	 */
	public AdvertisementCropList(int cxAdvertisementId, int cxCropMonthId, String cxCropListName,
			String cx_crop_duration) {
		this.cxAdvertisementId = cxAdvertisementId;
		this.cxCropMonthId = cxCropMonthId;
		this.cxCropListName = cxCropListName;
		this.cx_crop_duration = cx_crop_duration;
	}

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

	/**
	 * @return the cx_crop_duration
	 */
	public String getCx_crop_duration() {
		return cx_crop_duration;
	}

	/**
	 * @param cx_crop_duration the cx_crop_duration to set
	 */
	public void setCx_crop_duration(String cx_crop_duration) {
		this.cx_crop_duration = cx_crop_duration;
	}

	
}
