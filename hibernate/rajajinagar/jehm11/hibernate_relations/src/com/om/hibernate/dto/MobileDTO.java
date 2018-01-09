package com.om.hibernate.dto;

import java.io.Serializable;

public class MobileDTO implements Serializable {
	private Integer mobileId;
	private String brand;
	private Double price;
	private String model;
	private OperatingSystemDTO operatingSystemDTO;

	public MobileDTO() {
		System.out.println(this.getClass().getSimpleName() + "created...");
	}

	public Integer getMobileId() {
		return mobileId;
	}

	public void setMobileId(Integer mobileId) {
		this.mobileId = mobileId;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public OperatingSystemDTO getOperatingSystemDTO() {
		return operatingSystemDTO;
	}

	public void setOperatingSystemDTO(OperatingSystemDTO operatingSystemDTO) {
		this.operatingSystemDTO = operatingSystemDTO;
	}

}
