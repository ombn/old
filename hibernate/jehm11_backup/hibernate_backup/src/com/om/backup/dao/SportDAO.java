package com.om.backup.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.om.backup.dto.SportDTO;

public class SportDAO {

	public void saveSport(SportDTO dto) {
		System.out.println("saving sports...");

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(SportDTO.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(dto);
		transaction.commit();
		session.close();
		factory.close();

	}

}
