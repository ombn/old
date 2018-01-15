package com.om.hibernate.dto.onetomany;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "app_table")
public class ApplicationDTO {
	@Id
	@GenericGenerator(name = "anyThing", strategy = "increment")
	@GeneratedValue(generator = "anyThing")
	@Column(name = "app_id")
	private int appId;
	@Column(name = "app_name")
	private String name;
	@Column(name = "app_type")
	private String type;
	@Column(name = "app_size")
	private double size;

	public ApplicationDTO() {
		System.out.println("Created...\t" + this.getClass().getSimpleName());
	}

	public int getAppId() {
		return appId;
	}

	public void setAppId(int appId) {
		this.appId = appId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

}
