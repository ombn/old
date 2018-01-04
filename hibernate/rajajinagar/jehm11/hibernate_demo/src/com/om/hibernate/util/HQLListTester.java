package com.om.hibernate.util;

import com.om.hibernate.dao.WeaponHQLDAO;

public class HQLListTester {

	public static void main(String[] args) {
		new WeaponHQLDAO().fetchAllByNamedQuery().forEach(dto->{
			System.out.println(dto.getModel());
		});
		
	new WeaponHQLDAO().fetchAllTypeByModel("Shivrajkumar")
	.forEach(type->{
			System.out.println(type);
		});

	}

}
