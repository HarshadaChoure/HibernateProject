package com.entityPatient;

import java.util.Scanner;

import com.utility.HibernateUtility;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class UpdatePatient 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//Create session factory object
		  SessionFactory sessionFactory = HibernateUtility.getSessionFactory();
		  //getting session object from session factory
		  Session session = sessionFactory.openSession();
		  //getting transaction object from session object
		  session.beginTransaction();
		  
		  Patient p=(Patient)session.get(Patient.class, 1);
		  System.out.println("Enter the update data:");
		  p.setName(sc.next());
		  
		  System.out.println("Updated Successfully");
		  session.getTransaction().commit();
		  sessionFactory.close();
		 }

}

