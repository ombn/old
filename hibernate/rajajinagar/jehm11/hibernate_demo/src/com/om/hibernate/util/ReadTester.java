package com.om.hibernate.util;

import com.om.hibernate.dao.WeaponDAO;
import com.om.hibernate.dto.WeaponDTO;

public class ReadTester {

	public static void main(String[] args) {

		WeaponDAO weaponDAO = new WeaponDAO();
		WeaponDTO dto = weaponDAO.readById(10);
		if (dto != null) {
			System.out.println(dto);
			System.out.println(dto.getModel());
		} else {
			System.out.println("object is not found");
		}

	}

}
