package com.om.integration.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.om.integration.dto.MedicalStoreDTO;
import com.om.integration.service.MedicalStoreService;

public class ServiceTester {

	public static void main(String
			[] args) {

		ApplicationContext container = new ClassPathXmlApplicationContext("dependency.xml");

		MedicalStoreService service = container.getBean(MedicalStoreService.class);

		MedicalStoreDTO dto = new MedicalStoreDTO();
		dto.setName("Myra");
		dto.setLicenseNo("My123");
		dto.setOwnerName("Shiv Kumar");
		dto.setType("Ayurvedic");

		service.saveMedicalStore(dto);

	}

}
