package com.om.spring.bean;

public class BarBean {

	private String name;
	private String type;

	BarBean(String name) {
		System.out.println(this.getClass().getSimpleName() + "Created...");
		this.name = name;
	}

	public void serve(String brand) {
		// sop
		System.out.println("serving ...\t" + brand);
	}

	public void setType(String type) {
		System.out.println("calling setType(..)");
		this.type = type;
	}
}
