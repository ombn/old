package com.om.hibernate.util;

import java.util.ArrayList;
import java.util.Collection;

import com.om.hibernate.dao.ComputerDAO;
import com.om.hibernate.dto.onetomany.ApplicationDTO;
import com.om.hibernate.dto.onetomany.ComputerDTO;

public class OneToManyTester {

	public static void main(String[] args) {
		// create a comp obj and init props
		// create two app's and init props
		// create a collection
		// add app's to collection
		// ref/relate coll to comp

		ComputerDTO computerDTO = new ComputerDTO();
		computerDTO.setBrand("HP");
		computerDTO.setModel("Notepad");
		computerDTO.setGraphics(true);

		ApplicationDTO ludo = new ApplicationDTO();
		ludo.setName("Ludo");
		ludo.setType("Game");
		ludo.setSize(10.00);

		ApplicationDTO nothing = new ApplicationDTO();
		nothing.setName("Nothing");
		nothing.setType("Nothing");
		nothing.setSize(0);

		Collection<ApplicationDTO> collection = new ArrayList<ApplicationDTO>();
		collection.add(ludo);
		collection.add(nothing);
		
		
		computerDTO.setApps(collection);
		

		new ComputerDAO().save(computerDTO);
		
	}

}
