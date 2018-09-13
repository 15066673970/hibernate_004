package com.jinan.www.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private  static SessionFactory sessionFactory;
	private  static  Session session;
	static  {
		
		//����configuration���󣬶�ȡhibernate.cfg.xml�ļ�����ɳ�ʼ����
		/*
		Configuration configuration = new Configuration().configure();
		StandardServiceRegistryBuilder ssRegistryBuilder= new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties());
		StandardServiceRegistry standardServiceRegistry = ssRegistryBuilder.build();
		sessionFactory=configuration.buildSessionFactory(standardServiceRegistry);
		*/
		Configuration configuration = new Configuration().configure();
		sessionFactory = configuration.buildSessionFactory();
		
	}
	//��ȡsessionfactory
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	//��ȡsession
	public static Session getSession() {
		session=sessionFactory.openSession();
		return session;
	}
	
	//�ر�session
	public static void closeSession(Session session) {
		if(session!=null) {
			session.close();
		}
	}
}
