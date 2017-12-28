package com.om.army.util;

import com.om.army.dao.ArmyDAO;

public class UpdateTester {

	public static void main(String[] args) {
		
		ArmyDAO dao=new ArmyDAO();
		dao.updateCountryNameById(3, "South Korea");
		

	}

}
