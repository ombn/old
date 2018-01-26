package com.om.integration.dao;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.om.integration.dto.MedicalStoreDTO;

@Component
public class MedicalStoreDAO {

	@Autowired
	private SessionFactory factory;

	// return pk
	public Serializable save(MedicalStoreDTO dto) {
		System.out.println("saving ..." + dto);
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		Integer pk = 0;
		try {
			pk = (Integer) session.save(dto);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		} finally {
			session.close();
		}
		return pk;
	}
}
