package com.om.hibernate.dto.onetomany;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="comp_table")
public class ComputerDTO {

	@Id
	@GenericGenerator(name="anyThing",strategy="increment")
	@GeneratedValue(generator="anyThing")
	@Column(name="comp_id")
	private int compId;
	@Column
	private String model;
	@Column
	private String brand;
	@Column
	private boolean graphics;
	//@transient
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="comp")
	private Collection<ApplicationDTO> apps;

	public ComputerDTO() {
		System.out.println("Created... \t" + this.getClass().getSimpleName());
	}

	public int getCompId() {
		return compId;
	}

	public void setCompId(int compId) {
		this.compId = compId;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public boolean isGraphics() {
		return graphics;
	}

	public void setGraphics(boolean graphics) {
		this.graphics = graphics;
	}

	public Collection<ApplicationDTO> getApps() {
		return apps;
	}

	public void setApps(Collection<ApplicationDTO> apps) {
		this.apps = apps;
	}
}
