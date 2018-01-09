package com.om.hibernate.dto;

import java.io.Serializable;

public class OperatingSystemDTO implements Serializable {

	private Integer osid;
	private String version;
	private String name;
	private Integer bitVersion;

	public OperatingSystemDTO() {
		System.out.println(this.getClass().getSimpleName() + "Created...");
	}

	public Integer getOsid() {
		return osid;
	}

	public void setOsid(Integer osid) {
		this.osid = osid;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getBitVersion() {
		return bitVersion;
	}

	public void setBitVersion(Integer bitVersion) {
		this.bitVersion = bitVersion;
	}

}
