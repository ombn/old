package com.om.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Fuel {

	@Value("petrol")
	private String type;
	private double cost;

	@Autowired
	public Fuel(@Value("65") double cost) {
		System.out.println(this.getClass().getSimpleName() + "Created...");
		System.out.println("cost : \t" + cost);
		this.cost = cost;
	}

	public void burn() {
		System.out.println("fuel \t" + this.type + "\t is burning");
	}

}
