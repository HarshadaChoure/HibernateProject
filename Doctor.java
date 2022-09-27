package com.entityDoctor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="HospitalDoctor")
public class Doctor
{
	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="doctorId")
	private String doctorId;
	@Column(name="dname")
	private String dname;
	@Column(name="dbirthdate")
	private String dbirthdate;
	@Column(name="dgender")
	private String dgender;
	@Column(name="dmobileNo")
	private long dmobileNo;
	@Column(name="daddress")
	private String daddress;
	@Column(name="dbloodGroup")
	private String dbloodGroup;
	@Column(name="speciality")
	private String speciality;
	@Column(name="medicineAllergy")
	private String medicineAllergy;	
	
	public Doctor()
	{
		
	}

	public Doctor(String doctorId, String dname, String dbirthdate, String dgender, long dmobileNo, String daddress,
			String dbloodGroup, String speciality, String medicineAllergy) {
		super();
		this.doctorId = doctorId;
		this.dname = dname;
		this.dbirthdate = dbirthdate;
		this.dgender = dgender;
		this.dmobileNo = dmobileNo;
		this.daddress = daddress;
		this.dbloodGroup = dbloodGroup;
		this.speciality = speciality;
		this.medicineAllergy = medicineAllergy;
	}

	public String getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getDbirthdate() {
		return dbirthdate;
	}

	public void setDbirthdate(String dbirthdate) {
		this.dbirthdate = dbirthdate;
	}

	public String getDgender() {
		return dgender;
	}

	public void setDgender(String dgender) {
		this.dgender = dgender;
	}

	public long getDmobileNo() {
		return dmobileNo;
	}

	public void setDmobileNo(long dmobileNo) {
		this.dmobileNo = dmobileNo;
	}

	public String getDaddress() {
		return daddress;
	}

	public void setDaddress(String daddress) {
		this.daddress = daddress;
	}

	public String getDbloodGroup() {
		return dbloodGroup;
	}

	public void setDbloodGroup(String dbloodGroup) {
		this.dbloodGroup = dbloodGroup;
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	public String getMedicineAllergy() {
		return medicineAllergy;
	}

	public void setMedicineAllergy(String medicineAllergy) {
		this.medicineAllergy = medicineAllergy;
	}

	
	
}
