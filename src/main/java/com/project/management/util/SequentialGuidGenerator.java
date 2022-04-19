package com.project.management.util;

import com.fasterxml.uuid.Generators;
import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

import java.io.Serializable;
import java.util.UUID;

public class SequentialGuidGenerator implements IdentifierGenerator {

	/**
	 * Method to generate GUID
	 */
	public Serializable generate(SessionImplementor arg0, Object arg1) throws HibernateException {
		return generate();
	}

	public static String generate() {
		// Auto-generated method stub
		final UUID autoGeneratevalue = Generators.timeBasedGenerator().generate();
		final String str = autoGeneratevalue.toString();
		// logger.info("auto generated value :" + str);
		return str;
	}

	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
		return generate();
	}
}