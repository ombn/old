package com.om.spring.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.om.spring.bean.CameraBean;
import com.om.spring.bean.TrimmerBean;

public class InitTester {

	public static void main(String[] args) {

		
		ApplicationContext container=new ClassPathXmlApplicationContext("spring\\init.xml");		
		//CameraBean cameraBean=container.getBean(CameraBean.class);
		//cameraBean.capture("Jspiders- Om");
		
		TrimmerBean trimmerBean=container.getBean(TrimmerBean.class);
		trimmerBean.trim("hair");
		
		

	}

}
