package com.om.hibernate.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "weapon_table")
public class WeaponDTO implements Serializable {

	@Id
	@Column(name = "weapon_id")
	private int wid;
	@Column(name = "weapon_type")
	private String type;
	@Column(name = "weapon_price")
	private double price;
	@Column(name = "weapon_model")
	private String model;
	@Column(name = "weapon_range")
	private double range;

	public WeaponDTO() {
		System.out.println("WeaponDTO created...");
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getRange() {
		return range;
	}

	public void setRange(double range) {
		this.range = range;
	}

	public int getWid() {
		return wid;
	}

	public void setWid(int wid) {
		this.wid = wid;
	}

	@Override
	public String toString() {
		return "WeaponDTO [wid=" + wid + ", type=" + type + ", price=" + price + ", model=" + model + ", range=" + range
				+ "]";
	}

}
