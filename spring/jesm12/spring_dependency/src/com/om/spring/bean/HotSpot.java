package com.om.spring.bean;

public class HotSpot {

	private String operator;
	private Power power;

	public HotSpot() {
		System.out.println(this.getClass().getSimpleName() + "Created...");
	}

	public void connect() {
		if (power != null) {
			System.out.println("connecting");
			power.generate();
		} else {
			System.out.println("no power");
		}
	}

	public void setOperator(String operator) {
		System.out.println("calling setOperator(..)");
		this.operator = operator;
	}

	public void setPower(Power power) {
		System.out.println("calling setPower(..)");
		this.power = power;
	}

}
