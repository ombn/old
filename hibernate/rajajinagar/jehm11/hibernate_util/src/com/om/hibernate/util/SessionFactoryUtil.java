package com.om.hibernate.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public final class SessionFactoryUtil {

	private final static SessionFactory factory;

	public static SessionFactory getFactory() {
		System.out.println("calling getFactory() from util jar");
		return factory;
	}

	public static void closeFactory() {
		System.out.println("We are closing factory , your codewill not work from now ...msg from util jar");
		factory.close();
	}

	static {
		System.out.println("Starting to init SF through util jar");
		Configuration configuration = new Configuration();
		configuration.configure();
		factory = configuration.buildSessionFactory();
		System.out.println("SF  created through util jar");
	}

}
