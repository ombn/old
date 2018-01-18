package com.om.spring.bean;

public class TvBean {

	private int inches;
	private String type;

	public TvBean() {
		System.out.println(this.getClass().getCanonicalName() + "Created...");
	}

	public void display(String program) {
		System.out.println("displaying \t" + program + "with display size = \t" + this.inches);

		
		
	}

	public void setInches(int inches) {
		System.out.println("calling setInches(..)");
		this.inches = inches;
	}
	
	public void setType(String type) {
		System.out.println("calling setType(..)"+type);
		this.type = type;
	}

}
