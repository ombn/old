package com.ria.hibernate.manytomany;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.ria.hibernate.manytomany.SessionFactoryUtil;

public class CoursesDAO 
{
	private SessionFactory factory = SessionFactoryUtil.getFactory();

	public void save(InstiStudentDTO iDTO)
	{
		
	Session session = factory.openSession();
	Transaction transaction= session.beginTransaction();
	try
	{
		session.save(iDTO);
		transaction.commit();
	}
	catch(HibernateException he)
	{
		he.printStackTrace();
		transaction.rollback();
	}
	finally
	{
		session.close();
	}
	
	}
public void save(CoursesDTO cDTO)
{
	Session session = factory.openSession();
	Transaction transaction=session.beginTransaction();
	try
	{
		session.save(cDTO);
		transaction.commit();	
	}
catch(HibernateException he)
	{
	he.printStackTrace();
	transaction.rollback();
	}
	finally
	{
		session.close();
	}
 }
}


