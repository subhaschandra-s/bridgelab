package com.bridgelabz.model;

public class DoctorBio 
{
	private String doctorName;
	private String Specialization;
	private String doctorId;
	private String availability;
	private long numberOfPatients;
	
	public String getdoctorName() 
	{
		return doctorName;
	}
	public void setdoctorName(String doctorName) 
	{
		this.doctorName=doctorName;
	}
	public String getSpecialization() 
	{
		return Specialization;
	}
	public void setSpecialization(String specialization) 
	{
		Specialization = specialization;
	}
	public String getdoctorId() 
	{
		return doctorId;
	}
	public void setdoctorId(String doctorId) 
	{
		this.doctorId = doctorId;
	}
	public String getavailability() 
	{
		return availability;
	}
	public void setavailability(String availability) 
	{
		this.availability = availability;
	}
	public long getnumberOfPatients()
	{
		return numberOfPatients;
	}
	
	public void setnumberOfPatients(long numberOfPatients)
	{
		this.numberOfPatients=numberOfPatients;
	}
	
}
