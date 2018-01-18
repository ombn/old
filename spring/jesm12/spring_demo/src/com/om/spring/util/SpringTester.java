package com.om.spring.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.om.spring.bean.YoutubeBean;

public class SpringTester {

	public static void main(String[] args) {

		String configLocation = "spring\\spring.xml";
		ApplicationContext spring =
				new ClassPathXmlApplicationContext(configLocation);
		YoutubeBean youtubeBean =
				spring.getBean("youtubeBean",YoutubeBean.class);
		youtubeBean.play("Chai-chai");
		
	}

}
