package com.om.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.om.spring.bean.HotSpot;

public class DependencyTester {

	public static void main(String[] args) {

		ApplicationContext container = new ClassPathXmlApplicationContext("spring/dependency.xml");

		HotSpot hotSpot = container.getBean(HotSpot.class);

		hotSpot.connect();

	}

}
