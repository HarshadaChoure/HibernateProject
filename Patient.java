package com.entityPatient;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="HospitalPatient")
public class Patient
{
	@Id
	@Column(name="pid")
	//@GeneratedValue(strategy=GenerationType.AUTO)
	private int pid;
	@Column(name="name")
	private String name;
	@Column(name="birthdate")
	private String birthdate;
	@Column(name="gender")
	private String gender;
	@Column(name="mobileNo")
	private long mobileNo;
	@Column(name="address")
	private String address;
	@Column(name="bloodGroup")
	private String bloodGroup;
	@Column(name="diseases")
	private String diseases;
	@Column(name="medicineAllergy")
	private String medicineAllergy;	
	@Column(name="doctorId")
	private String doctorId;
	public Patient()
	{
		
	}
	public Patient(int pid, String name, String birthdate, String gender, long mobileNo, String address,
			String bloodGroup, String diseases, String medicineAllergy, String doctorId) {
		super();
		this.pid = pid;
		this.name = name;
		this.birthdate = birthdate;
		this.gender = gender;
		this.mobileNo = mobileNo;
		this.address = address;
		this.bloodGroup = bloodGroup;
		this.diseases = diseases;
		this.medicineAllergy = medicineAllergy;
		this.doctorId = doctorId;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int i) {
		this.pid = i;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	public String getDiseases() {
		return diseases;
	}
	public void setDiseases(String diseases) {
		this.diseases = diseases;
	}
	public String getMedicineAllergy() {
		return medicineAllergy;
	}
	public void setMedicineAllergy(String medicineAllergy) {
		this.medicineAllergy = medicineAllergy;
	}
	public String getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}
	@Override
	public String toString() {
		return "Patient [pid=" + pid + ", name=" + name + ", birthdate=" + birthdate + ", gender=" + gender
				+ ", mobileNo=" + mobileNo + ", address=" + address + ", bloodGroup=" + bloodGroup + ", diseases="
				+ diseases + ", medicineAllergy=" + medicineAllergy + ", doctorId=" + doctorId + "]";
	}
	
	
}
