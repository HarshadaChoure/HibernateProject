package com.entityDoctor;

import java.util.List;

import com.entityPatient.Patient;
import com.utility.HibernateUtility;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class ViewDoctorData {
	public static void main(String[] args) {
		//Create session factory object
		  SessionFactory sessionFactory = HibernateUtility.getSessionFactory();
		  //getting session object from session factory
		  Session session = sessionFactory.openSession();
		  //getting transaction object from session object
		  session.beginTransaction();
		  Query <Doctor>query = session.createQuery("from Doctor");
		  List <Doctor>doctors = query.list();
		  for(Doctor d :doctors)
		  {
			  System.out.println("Doctor ID:"+"\t"+d.getDoctorId());
			  System.out.println("Doctor Name:"+"\t"+d.getDname());
			  System.out.println("Doctor Birthdate:"+"\t"+d.getDbirthdate());
			  System.out.println("Doctor Gender:"+"\t"+d.getDgender());
			  System.out.println("Doctor Mobile No:"+"\t"+d.getDmobileNo());
			  System.out.println("Doctor Address:"+"\t"+d.getDaddress());
			  System.out.println("Doctor BloodGroup:"+"\t"+d.getDbloodGroup());
			  System.out.println("Doctor Speciality:"+"\t"+d.getSpeciality());
			  System.out.println("Doctor Medicine Allergy:"+"\t"+d.getMedicineAllergy());
			  
			  
		  }
		  System.out.println("View Successfully");
		  session.getTransaction().commit();
		  sessionFactory.close();
		 }


}
