package com.om.backup.util;

import com.om.backup.dao.SportDAO;
import com.om.backup.dto.SportDTO;

public class Tester {

	public static void main(String[] args) {
		
		SportDTO dataOfSport=new SportDTO();
		dataOfSport.setSportId(1);
		dataOfSport.setName("Snooker");
		dataOfSport.setTeamsize(2);
		dataOfSport.setType("Indoor");
		
		//logic
		
		SportDAO dao=new SportDAO();
		dao.saveSport(dataOfSport);
		

	}

}
