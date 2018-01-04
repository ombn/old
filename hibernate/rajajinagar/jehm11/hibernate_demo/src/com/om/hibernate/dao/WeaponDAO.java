package com.om.hibernate.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.om.hibernate.dto.WeaponDTO;

public class WeaponDAO {

	public void save(WeaponDTO weaponDTO) {
		Configuration configuration = new Configuration();
		configuration.configure("mysql.xml");
		configuration.addAnnotatedClass(WeaponDTO.class);
		SessionFactory factory =
				configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(weaponDTO);
		transaction.commit();
		session.close();
		factory.close();

	}

	public WeaponDTO readById(int id) {
		Configuration configuration = new Configuration();
		configuration.configure();
		configuration.addAnnotatedClass(WeaponDTO.class);
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		WeaponDTO dto = session.get(WeaponDTO.class, id);
		session.close();
		factory.close();
		return dto;
	}
}
