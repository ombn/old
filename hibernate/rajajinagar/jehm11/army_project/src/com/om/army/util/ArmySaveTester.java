package com.om.army.util;

import com.om.army.dao.ArmyDAO;
import com.om.army.dto.ArmyDTO;

public class ArmySaveTester {

	public static void main(String[] args) {

		ArmyDTO indianArmy = new ArmyDTO();
		//indianArmy.setAid(4);
		indianArmy.setCountryName("Russia");
		indianArmy.setNoOfRec("2mil");
		indianArmy.setType("Infantry");

		ArmyDAO armyDAO = new ArmyDAO();
		armyDAO.anythingButSave(indianArmy);

	}

}
