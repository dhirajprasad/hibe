package com.dhiraj.app;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.dhiraj.entity.Customer;
import com.dhiraj.entity.Vehicle;
import com.dhiraj.hibernateAnnotationUtil.HibernateAnnotationUtil;

public class Read {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		SessionFactory factory=HibernateAnnotationUtil.getSessionFactory();
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		Vehicle v= (Vehicle) session.load(Vehicle.class, 1);
		Customer c=new Customer();
		c.setCname("sdf");
		session.save(c);
		v.setCustomer(c);
//		session.save(v);
//		v.setCustomer(customer);
		tx.commit();
		session.close();
	}

}
