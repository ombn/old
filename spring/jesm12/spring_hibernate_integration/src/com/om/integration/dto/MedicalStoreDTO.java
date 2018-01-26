package com.om.integration.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "medical_table")
public class MedicalStoreDTO implements Serializable {

	@Id
	@GenericGenerator(name = "mid", strategy = "increment")
	@GeneratedValue(generator = "mid")
	@Column
	private int mid;
	private String name;
	private String licenseNo;
	private String ownerName;
	private String type;

	public MedicalStoreDTO() {
		System.out.println(this.getClass().getSimpleName() + "Created...");
	}

	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLicenseNo() {
		return licenseNo;
	}

	public void setLicenseNo(String licenseNo) {
		this.licenseNo = licenseNo;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "MedicalStoreDTO [mid=" + mid + ", name=" + name + ", licenseNo=" + licenseNo + ", ownerName="
				+ ownerName + ", type=" + type + "]";
	}

}
