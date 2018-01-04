package com.om.army.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.om.army.dto.ArmyDTO;
import com.om.hibernate.util.SessionFactoryUtil;

public class ArmyHQLDAO {

	private SessionFactory factory = SessionFactoryUtil.getFactory();

	public ArmyDTO fetchByCountryName(String cname) {

		// hql -- two steps
		// 1. create a query
		// 2 process the query -- select, update or delete
		Session session = factory.openSession();
		String hqlSyntax = "select army from ArmyDTO " + "army where army.countryName=?";
		try {
			Query query = session.createQuery(hqlSyntax);
			query.setString(0, cname);
			ArmyDTO armyDTOFromDB = (ArmyDTO) query.uniqueResult();
			return armyDTOFromDB;
		} finally {
			session.close();
		}
	}

	public String fetchTypeById(int id) {
		String hqlSyntax = "select army.type from ArmyDTO army where army.aid=:aid";
		Session session = factory.openSession();
		try {
			Query query = session.createQuery(hqlSyntax);
			query.setParameter("aid", id);
			String type = (String) query.uniqueResult();
			return type;
		} finally {
			session.close();
		}

	}

	public Object[] fetchIdAndCountryNameByNoOfRec(String rec) {
		String hqlSyntax =
"select army.aid,army.countryName from ArmyDTO "
+ "army where army.noOfRec=:nor";
		Session session = factory.openSession();
		try{
		Query query = session.createQuery(hqlSyntax);
		query.setParameter("nor", rec);
		Object object = query.uniqueResult();
		System.out.println("object from UR = {}"+ object);		
		Object[] array=(Object[])object;
		System.out.println("Size of array "+array.length);
		return array;
		}finally {
			session.close();
		}

	}

	public Integer fetchIdByCountryName(String cname) {

		String hqlSyntax = "select army.aid from ArmyDTO army where army.countryName=:cn";
		Session session = factory.openSession();
		try {
			Query query = session.createQuery(hqlSyntax);
			query.setParameter("cn", cname);
			Integer id = (Integer) query.uniqueResult();
			return id;
		} finally {
			session.close();
		}

	}

	public ArmyDTO fetchByCountryNameNP(String cname) {
		Session session = factory.openSession();
		String hqlSyntax = "select army from ArmyDTO army where army.countryName=:cn";
		try {
			Query query = session.createQuery(hqlSyntax);
			query.setParameter("cn", cname);
			ArmyDTO armyDTOFromDB = (ArmyDTO) query.uniqueResult();

			return armyDTOFromDB;
		} finally {
			session.close();
		}
	}

}
