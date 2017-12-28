package com.om.hibernate.util;

import com.om.hibernate.dao.WeaponDAO;
import com.om.hibernate.dto.WeaponDTO;

public class Tester {

	public static void main(String[] args) {

		WeaponDTO weaponDTO = new WeaponDTO();
		weaponDTO.setWid(1);
		weaponDTO.setType("Long-1");
		weaponDTO.setPrice(2);
		weaponDTO.setRange(2);
		weaponDTO.setModel("Shivrajkumar");

		WeaponDAO weaponDAO = new WeaponDAO();
		weaponDAO.save(weaponDTO);

	}

}
