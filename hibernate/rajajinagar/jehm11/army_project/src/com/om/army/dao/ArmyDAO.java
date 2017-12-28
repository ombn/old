package com.om.army.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.om.army.dto.ArmyDTO;
import com.om.hibernate.util.SessionFactoryUtil;

public class ArmyDAO {

	private SessionFactory factory = SessionFactoryUtil.getFactory();

	public void deleteById(int id) {
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		ArmyDTO armyDtoFromDb = session.get(ArmyDTO.class, id);
		if (armyDtoFromDb != null) {
			System.out.println("entity found , can delete");
			session.delete(armyDtoFromDb);
			tx.commit();
		} else {
			System.out.println("entity not found");
		}
		session.close();
		// factory.close(); DONT CLOSE

	}

	public void anythingButSave(ArmyDTO armyDTO) {
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		try {
			session.save(armyDTO);
			tx.commit();
		} catch (HibernateException he) {
			he.printStackTrace();
			tx.rollback();
		} finally {
			session.close();
		}

	}

	public ArmyDTO loadById(int no) {
		Session session = factory.openSession();
		ArmyDTO refOfArmyFromDB = session.get(ArmyDTO.class, no);
		session.close();
		factory.close();
		return refOfArmyFromDB;
	}

	public void updateCountryNameById(int id, String newCountryName) {
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		// two steps, read and update
		ArmyDTO armyDTOFromDB = session.get(ArmyDTO.class, id);
		if (armyDTOFromDB != null) {
			System.out.println("Entity exists can update");
			armyDTOFromDB.setCountryName(newCountryName);
			session.update(armyDTOFromDB);
			tx.commit();
		} else {
			System.out.println("Entity not found");
		}
		session.close();
		factory.close();

	}

}
