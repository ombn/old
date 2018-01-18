package com.om.spring.bean;

public class CameraBean {

	private String pixel;

	public CameraBean(String pixel) {
		System.out.println(this.getClass().getCanonicalName() + "\t created...");
		this.pixel=pixel;
	}
	public void capture(String whatTo) {
System.out.println("Captured ... \t" + whatTo + "\t" + this.pixel);
	}

}
