package com.om.army.util;

import com.om.army.dao.ArmyDAO;
import com.om.army.dto.ArmyDTO;

public class ArmyReadTester {

	public static void main(String[] args) {
		ArmyDAO armyDAO = new ArmyDAO();
		ArmyDTO armyDTO = armyDAO.loadById(3);
		System.out.println(armyDTO.getCountryName());

	}

}
