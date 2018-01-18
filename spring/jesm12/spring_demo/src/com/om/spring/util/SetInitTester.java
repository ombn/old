package com.om.spring.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.om.spring.bean.TvBean;

public class SetInitTester {

	public static void main(String[] args) {
		
		
		ApplicationContext container=new ClassPathXmlApplicationContext("spring/set-init.xml");
		
		
		TvBean tvBean=container.getBean(TvBean.class);
		
		System.out.println(tvBean.hashCode());
		
		
		TvBean tvBean2=container.getBean(TvBean.class);
		System.out.println(tvBean2.hashCode());
		
		
		tvBean.display("chota bhim");
		

	}

}
