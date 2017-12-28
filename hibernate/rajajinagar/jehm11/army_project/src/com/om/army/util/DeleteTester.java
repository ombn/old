package com.om.army.util;

import com.om.army.dao.ArmyDAO;

public class DeleteTester {

	public static void main(String[] args) {

		ArmyDAO armyDAO = new ArmyDAO();
		armyDAO.deleteById(3);
		// close factory here

	}

}
