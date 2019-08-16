package com.mobios.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;


@Entity
@Table(name="cx_farmer_registations")
@EntityListeners(AuditingEntityListener.class)
public class Farmer implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	
	
	@NotBlank
	private String mobileNo;
	
	@NotBlank
	private String NIC;
	
	@NotBlank
	private String password;
	

	/**
	 * 
	 */
	public Farmer() {
		super();
	}

	/**
	 * @param id
	 * @param mobileNo
	 * @param nIC
	 * @param password
	 */
	public Farmer(int id, String mobileNo, String nIC, String password) {
		super();
		Id = id;
		this.mobileNo = mobileNo;
		NIC = nIC;
		this.password = password;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return Id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		Id = id;
	}

	/**
	 * @return the mobileNo
	 */
	public String getMobileNo() {
		return mobileNo;
	}

	/**
	 * @param mobileNo the mobileNo to set
	 */
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
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
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

}
