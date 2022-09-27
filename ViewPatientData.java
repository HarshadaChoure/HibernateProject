package com.entityPatient;



import java.util.List;

import com.utility.HibernateUtility;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


public class ViewPatientData 
{
	public static void main(String[] args) {
		//Create session factory object
		  SessionFactory sessionFactory = HibernateUtility.getSessionFactory();
		  //getting session object from session factory
		  Session session = sessionFactory.openSession();
		  //getting transaction object from session object
		  session.beginTransaction();
		  Query <Patient>query = session.createQuery("from Patient");
		  List <Patient>patients = query.list();
		  for(Patient p :patients)
		  {
			  System.out.println("Patient ID:"+"\t"+p.getPid());
			  System.out.println("Patient Name:"+"\t"+p.getName());
			  System.out.println("Patient Birthdate:"+"\t"+p.getBirthdate());
			  System.out.println("Patient Gender:"+"\t"+p.getGender());
			  System.out.println("Patient Mobile No:"+"\t"+p.getMobileNo());
			  System.out.println("Patient Address:"+"\t"+p.getAddress());
			  System.out.println("Patient BloodGroup:"+"\t"+p.getBloodGroup());
			  System.out.println("Patient Diseases:"+"\t"+p.getDiseases());
			  System.out.println("Patient Medicine Allergy:"+"\t"+p.getMedicineAllergy());
			  System.out.println("Patient Doctor ID Whose handled Doctor:"+"\t"+p.getDoctorId());
			  
		  }
		  System.out.println("View Successfully");
		  session.getTransaction().commit();
		  sessionFactory.close();
		 }


	}

