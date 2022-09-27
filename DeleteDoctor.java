package com.entityDoctor;

import com.entityPatient.Patient;
import com.utility.HibernateUtility;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class DeleteDoctor {
	public static void main(String[] args) {
		
		  //Create session factory object
		  SessionFactory sessionFactory = HibernateUtility.getSessionFactory();
		  //getting session object from session factory
		  Session session = sessionFactory.openSession();
		  //getting transaction object from session object
		  session.beginTransaction();
		  Doctor d=(Doctor)session.get(Doctor.class,"D11");
		  session.delete(d);
		  System.out.println("Deleted Successfully");
		  session.getTransaction().commit();
		     sessionFactory.close();

	}
}
