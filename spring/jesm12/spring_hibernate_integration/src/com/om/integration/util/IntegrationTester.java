package com.om.integration.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.om.integration.dao.MedicalStoreDAO;
import com.om.integration.dto.MedicalStoreDTO;

public class IntegrationTester {

	public static void main(String[] args) {

	
		
		MedicalStoreDTO medicalStoreDTO = new MedicalStoreDTO();
		medicalStoreDTO.setName("Homeo-world");
		medicalStoreDTO.setOwnerName("Manisha-C");
		medicalStoreDTO.setType("HP");
		medicalStoreDTO.setLicenseNo("LIC420");

		
		ApplicationContext container=new ClassPathXmlApplicationContext("dependency.xml");
		
		MedicalStoreDAO dao = container.getBean(MedicalStoreDAO.class);
		dao.save(medicalStoreDTO);

	}

}
