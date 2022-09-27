package com.entityDoctor;

import java.util.Scanner;

import com.entityPatient.Patient;
import com.utility.HibernateUtility;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class CreateDoctor {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Doctor d=new Doctor();
		System.out.println("Enter the Doctor ID:");
		d.setDoctorId(sc.next());
		System.out.println("Enter the Doctor Name:");
		d.setDname(sc.next());
		System.out.println("Enter the Doctor Birthdate:");
		d.setDbirthdate(sc.next());
		System.out.println("Enter the Doctor Gender:");
		d.setDgender(sc.next());
		System.out.println("Enter the Doctor Mobile Number:");
		d.setDmobileNo(sc.nextLong());
		System.out.println("Enter the Doctor Address:");
		d.setDaddress(sc.next());
		System.out.println("Enter the Doctor Blood group:");
		d.setDbloodGroup(sc.next());
		System.out.println("Enter the Doctor Speciality:");
		d.setSpeciality(sc.next());
		System.out.println("Enter the Doctor Medicine Allergy:");
		d.setMedicineAllergy(sc.next());
		
		
		//Create session factory object
		  SessionFactory sessionFactory = HibernateUtility.getSessionFactory();
		  //getting session object from session factory
		  Session session = sessionFactory.openSession();
		  //getting transaction object from session object
		  session.beginTransaction();
		  
		  session.save(d);
		  System.out.println("Inserted Successfully");
		  session.getTransaction().commit();
		  session.close();
		  sessionFactory.close();
}
}
