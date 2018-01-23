package com.om.spring.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Astronaut {

	@Value("Shivu")
	private String name;

	public Astronaut() {
		System.out.println(this.getClass().getSimpleName() + "Created...");
	}

	public void drive() {
		System.out.println(this.name + "driving rocket");
	}

}
