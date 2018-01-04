package com.om.army.generator;

import java.io.Serializable;
import java.util.UUID;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.id.IdentifierGenerator;

public class MyGenerator implements IdentifierGenerator {

	public MyGenerator() {
		System.out.println("MyGenerator created...");
	}

	@Override
	public Serializable generate(SessionImplementor session,
			Object object) throws HibernateException {
		System.out.println("calling generate method...");
		System.out.println("only testing ,"
				+ " should not be hard-coded");
		Math.random();
		UUID.fromString("abc546");
		return 786;
	}

}
