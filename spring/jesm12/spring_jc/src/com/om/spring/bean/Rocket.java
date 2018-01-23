package com.om.spring.bean;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//<bean id="" class=""/>
@Component("rock")
@Scope("singleton")
public class Rocket {

	@Value("100")
	private int thrust;
	@Autowired
	private Fuel fuel;
	@Autowired
	private Astronaut ast;

	public Rocket() {
		System.out.println(this.getClass().getSimpleName() + "\t Created...");
	}

	public void launch(Date date) {
		if (date != null && fuel != null) {
			System.out.println("launched..." + date);
			fuel.burn();
			ast.drive();

		} else {
			System.out.println("preparing , but not launching...");
		}
	}

	// <property name="thrust" value="100"/>

}
