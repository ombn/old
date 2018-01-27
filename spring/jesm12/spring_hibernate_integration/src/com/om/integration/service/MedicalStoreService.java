package com.om.integration.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.om.integration.dao.MedicalStoreDAO;
import com.om.integration.dto.MedicalStoreDTO;

@Component
public class MedicalStoreService {

	@Autowired
	private MedicalStoreDAO medicalStoreDAO;

	public MedicalStoreService() {
		System.out.println(this.getClass().getSimpleName() + "Created...");
	}

	public void saveMedicalStore(MedicalStoreDTO dto) {
		System.out.println("saving from service");
		medicalStoreDAO.save(dto);
	}

}
