package com.om.army.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "army_table")
public class ArmyDTO implements Serializable {

	@Id
	@GenericGenerator(name="om",strategy="increment")
	@GeneratedValue(generator="om")
	@Column(name = "armyd_id")
	private int aid;
	@Column(name = "army_country_name")
	private String countryName;
	@Column(name = "army_type")
	private String type;
	@Column(name = "army_no_of_rec")
	private String noOfRec;
	@Column(name = "army_batchno")
	private String batchNo;

	public ArmyDTO() {
		System.out.println("ArmyDTO created");
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getNoOfRec() {
		return noOfRec;
	}

	public void setNoOfRec(String noOfRec) {
		this.noOfRec = noOfRec;
	}

	public String getBatchNo() {
		return batchNo;
	}

	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}

}
