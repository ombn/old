package com.om.hibernate.dao;

import javax.transaction.Transaction;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.om.hibernate.dto.onetotone.AccountDTO;
import com.om.hibernate.util.SessionFactoryUtil;

public class AccountDAO {

	private SessionFactory factory = SessionFactoryUtil.getFactory();

	public void updateIfscByType(String type, String ifsc) {
		Session session = factory.openSession();
		org.hibernate.Transaction tx = session.beginTransaction();
		try {
			String hqlSyntax = "update AccountDTO set ifsc=:ifsc where type=:ty";
			session.createQuery(hqlSyntax).setParameter("ifsc", ifsc).setParameter("ty", type).executeUpdate();
			tx.commit();
		} catch (HibernateException e) {
			e.printStackTrace();
			tx.rollback();
		} finally {
			session.close();
		}
	}

	public void save(AccountDTO dto) {
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

	public AccountDTO fetchById(int id) {
		Session session = factory.openSession();
		try {
			AccountDTO accountDTO = session.load(AccountDTO.class, id);
			System.out.println(accountDTO.getAccountNo());
			AccountDTO accountDTO2 = session.load(AccountDTO.class, id);
			System.out.println(accountDTO2.getType());
			return accountDTO;
		} finally {
			session.close();
		}

	}

}
