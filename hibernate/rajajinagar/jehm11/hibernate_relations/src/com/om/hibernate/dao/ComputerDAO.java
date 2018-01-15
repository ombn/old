package com.om.hibernate.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.om.hibernate.dto.onetomany.ComputerDTO;
import com.om.hibernate.dto.onetotone.AccountDTO;
import com.om.hibernate.util.SessionFactoryUtil;

public class ComputerDAO {

	private SessionFactory factory = SessionFactoryUtil.getFactory();

	public void save(ComputerDTO dto) {
		Session session = factory.openSession();
		org.hibernate.Transaction tx = session.beginTransaction();
		try {
			session.save(dto);
			tx.commit();
		} catch (HibernateException e) {
			e.printStackTrace();
			tx.rollback();
		} finally {
			session.close();
		}

	}

}
