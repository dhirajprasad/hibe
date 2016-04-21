package com.dhiraj.hibernateAnnotationUtil;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class HibernateAnnotationUtil {
	static SessionFactory factory;
	static{
		AnnotationConfiguration cfg= new AnnotationConfiguration();
		cfg=(AnnotationConfiguration)cfg.configure("hibernate.cfg.xml");
		 factory= cfg.buildSessionFactory();
	}
		public static SessionFactory getSessionFactory(){
			return factory;
		}
	
	
}
