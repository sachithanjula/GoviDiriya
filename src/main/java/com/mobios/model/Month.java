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
	private int cxMonthAutoId;

	private String cxMonthNname;

	/**
	 * @return the cxMonthAutoId
	 */
	public int getCxMonthAutoId() {
		return cxMonthAutoId;
	}

	/**
	 * @param cxMonthAutoId the cxMonthAutoId to set
	 */
	public void setCxMonthAutoId(int cxMonthAutoId) {
		this.cxMonthAutoId = cxMonthAutoId;
	}

	/**
	 * @return the cxMonthNname
	 */
	public String getCxMonthNname() {
		return cxMonthNname;
	}

	/**
	 * @param cxMonthNname the cxMonthNname to set
	 */
	public void setCxMonthNname(String cxMonthNname) {
		this.cxMonthNname = cxMonthNname;
	}

}
