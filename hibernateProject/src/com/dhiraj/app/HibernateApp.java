package com.dhiraj.app;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.persistence.Query;
import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.dhiraj.entity.Address;
import com.dhiraj.entity.Customer;
import com.dhiraj.entity.Vehicle;
import com.dhiraj.hibernateAnnotationUtil.HibernateAnnotationUtil;


public class HibernateApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		SessionFactory factory=HibernateAnnotationUtil.getSessionFactory();
		Session session=factory.openSession();
		org.hibernate.Transaction tx=session.beginTransaction();
//		Customer c=new Customer();
//		Address add=new Address();
//		Vehicle vehicle=new Vehicle();
//		
//		vehicle.setModel("scorpio");
//		vehicle.setVtype("fourwheeler");
//		vehicle.setCustomer(c);
//		vehicle.setVno(1234);
//		
//		session.save(vehicle);
//		Set<Vehicle> setVehicles =new HashSet<>();
//		setVehicles.add(vehicle);
//		add.setCity("dhanbad");
//		add.setState("jharkhand");
//		c.setAddress(add);
//		c.setCname("dhiraj");
//		c.setSetVehicle(setVehicles);
//		session.save(c);
		String hql="select c.cname ,v.vtype from Customer c left join c.setVehicle v where v.model='scorpio'";
		org.hibernate.Query query= session.createQuery(hql);
		@SuppressWarnings("unchecked")
		List<Object[]> list= query.list();
		System.out.println(list.size());
		for (Object[] objects : list) {
			for (Object object : objects) {
				System.out.println(object);
			}
			System.out.println(objects);
		}
//		Object o=list.get(0);
//		System.out.println(o);
//		for (Object object : o) {
//			System.out.println(object);
//		}
		tx.commit();
		session.close();
	}

}
