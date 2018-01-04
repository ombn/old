package com.om.hibernate.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.om.hibernate.dto.WeaponDTO;
import com.om.hibernate.util.SessionFactoryUtil;

public class WeaponHQLDAO {

	private SessionFactory factory = SessionFactoryUtil.getFactory();

	public List<WeaponDTO> fetchAllByNamedQuery() {
		Session session = factory.openSession();
		try {
			Query query = session.getNamedQuery("fetchALL");
			List<WeaponDTO> list = query.list();
			return list;
		} finally {
			session.close();
		}
	}
	
	public List<WeaponDTO> fetchAll() {
		String hqlSyntax = "select weapon "
				+ " from WeaponDTO weapon";
		Session session = factory.openSession();
		try {
			Query query = session.createQuery(hqlSyntax);
			List<WeaponDTO> list = query.list();
			return list;
		} finally {
			session.close();
		}
	}
	
	public List<String> fetchAllTypeByModel(String model)
	{
		Session session = factory.openSession();
		try {
			Query query = session.getNamedQuery("fetchAllTypeByModel");
			query.setParameter("mod",model);
			List<String> list = query.list();
			return list;
		} finally {
			session.close();
		}
	
	}
	

}
