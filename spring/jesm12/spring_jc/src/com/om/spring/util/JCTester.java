package com.om.spring.util;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.om.spring.bean.Rocket;

public class JCTester {

	public static void main(String[] args) {

		ApplicationContext container = new ClassPathXmlApplicationContext("spring/jc-ioc.xml");

		Rocket rocket=container.getBean("rock",Rocket.class);
		rocket.launch(new Date());
		
		System.out.println(rocket.hashCode());
		Rocket rocket2=container.getBean("rock",Rocket.class);
		System.out.println(rocket2.hashCode());
		
		
		
		
		
		
	}

}
