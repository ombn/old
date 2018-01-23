package com.om.spring.bean;

public class Power {

	private int volts;

	public Power() {
		System.out.println(this.getClass().getSimpleName() + "Created...");
	}

	public void generate() {
		System.out.println("generated...");
	}

	public void setVolts(int volts) {
		System.out.println("calling setVolts(..)");
		this.volts = volts;
	}

}
