package com.entityPatient;

import com.utility.HibernateUtility;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class DeletePateint 
{
public static void main(String[] args) {
	  //Create session factory object
	  SessionFactory sessionFactory = HibernateUtility.getSessionFactory();
	  //getting session object from session factory
	  Session session = sessionFactory.openSession();
	  //getting transaction object from session object
	  session.beginTransaction();
	  Patient p=(Patient)session.get(Patient.class, 1);
	  session.delete(p);
	  System.out.println("Deleted Successfully");
	  session.getTransaction().commit();
	     sessionFactory.close();

}
}
