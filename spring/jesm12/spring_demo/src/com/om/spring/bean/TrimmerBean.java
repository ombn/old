package com.om.spring.bean;

public class TrimmerBean {

	private String batteryBrand;
	private boolean working;


	public TrimmerBean(String batteryBrand, boolean working) {
		super();
		this.batteryBrand = batteryBrand;
		this.working = working;
	}

	

	public void trim(String trim) {
		if (this.working) {
			System.out.println("trimming \t" + trim + "with battery \t" + this.batteryBrand);
			return;
		}

		System.out.println("not working");
	}

}
