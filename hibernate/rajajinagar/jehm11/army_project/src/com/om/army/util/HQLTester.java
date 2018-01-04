package com.om.army.util;

import com.om.army.dao.ArmyHQLDAO;
import com.om.army.dto.ArmyDTO;

public class HQLTester {

	public static void main(String[] args) {
		ArmyHQLDAO armyHQLDAO=new ArmyHQLDAO();
		//ArmyDTO armyDTO=armyHQLDAO.fetchByCountryNameNP("India");
		//System.out.println(armyDTO);
		
		String type=armyHQLDAO.fetchTypeById(2);
		System.out.println(type);
		
		System.out.println(armyHQLDAO.fetchIdByCountryName("India"));
		
		
		Object[] idAndCname=
		armyHQLDAO.fetchIdAndCountryNameByNoOfRec("20mil");
		System.out.println(idAndCname[0]);
		System.out.println(idAndCname[1]);

	}

}
