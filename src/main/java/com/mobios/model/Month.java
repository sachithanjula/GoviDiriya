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
@Table(name = "cx_crop_month")
@EntityListeners(AuditingEntityListener.class)
public class Month implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cxMonthAutoID;

	private String cxMonthName;

	/**
	 * @return the cxMonthAutoID
	 */
	public int getCxMonthAutoID() {
		return cxMonthAutoID;
	}

	/**
	 * @param cxMonthAutoID the cxMonthAutoID to set
	 */
	public void setCxMonthAutoID(int cxMonthAutoID) {
		this.cxMonthAutoID = cxMonthAutoID;
	}

	/**
	 * @return the cxMonthName
	 */
	public String getCxMonthName() {
		return cxMonthName;
	}

	/**
	 * @param cxMonthName the cxMonthName to set
	 */
	public void setCxMonthName(String cxMonthName) {
		this.cxMonthName = cxMonthName;
	}

	
	
}
