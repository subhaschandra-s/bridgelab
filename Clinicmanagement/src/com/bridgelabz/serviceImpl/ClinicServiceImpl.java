package com.bridgelabz.serviceImpl;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.bridgelabz.Utility.Utility;
import com.bridgelabz.controller.ClinicController;
import com.bridgelabz.model.DoctorBio;
import com.bridgelabz.model.PatientBio;
import com.bridgelabz.repository.ClinicRepository;
import com.bridgelabz.service.ClinicService;

public class ClinicServiceImpl implements ClinicService
{
	JSONArray jsonArray = new JSONArray();
	JSONObject jsonObject = new JSONObject();

	static String doctor = "C:\\Users\\Admin\\Desktop\\Clinicmanagement\\Jsonfiles\\Doctor.json";
	static String patient = "C:\\Users\\Admin\\Desktop\\Clinicmanagement\\Jsonfiles\\Patient.json";
	static String appointment = "";

	@SuppressWarnings("unchecked")
	@Override
	public void doctorDetails() 
	{
	
		jsonArray = ClinicRepository.readData(doctor);

		DoctorBio doctorDetails = new DoctorBio();
		System.out.println("Enter Doctor Name");
		String doctorName = Utility.readString();
		
		if (Utility.isStringOnlyAlphabet(doctorName)) {

			doctorDetails.setdoctorName(doctorName);
		}

		System.out.println("Enter Doctor Specialization");
		String specialization = Utility.readString();
		if (Utility.isStringOnlyAlphabet(specialization)) {
			doctorDetails.setSpecialization(specialization);
		}

		System.out.println("Enter Doctor Availability");
		String availability = Utility.readString();
		if (Utility.isStringOnlyAlphabet(availability)) {
			doctorDetails.setavailability(availability);
		}

		doctorDetails.setdoctorId(Utility.doctorId());
		doctorDetails.setnumberOfPatients(0);

		jsonObject.put("Id", doctorDetails.getdoctorId());
		jsonObject.put("Name", doctorDetails.getdoctorName());
		jsonObject.put("Specialization", doctorDetails.getSpecialization());
		jsonObject.put("Availability", doctorDetails.getavailability());
		jsonObject.put("Patients", doctorDetails.getnumberOfPatients());

		jsonArray.add(jsonObject);

		System.out.println(jsonArray);
		ClinicRepository.writeData(doctor, jsonArray);

	}


	/** Reads doctor's data from json file **/
	@SuppressWarnings("rawtypes")
	@Override
	public void readDoctorData(String key, String value,String choice) {
		
			//	adds json data to json array
			jsonArray = (JSONArray) ClinicRepository.readData(doctor);
			//	iterator to iterate json data
			Iterator iterator = jsonArray.iterator();
			//	json objects top store json data from array
			JSONObject jsonObject, lastJasonObject = null;
	
			//	iterates over json array
			while (iterator.hasNext()) {
				//	checks if data given by user matches with any json object
				//	and if present prints it
				if ((jsonObject = (JSONObject) iterator.next()).get(key).equals(value)) {
					lastJasonObject = jsonObject;
					System.out.println("\nDoctor Information:");
					System.out.println("ID: " + jsonObject.get("Id") + "\t");
					System.out.println("Name: " + jsonObject.get("Name") + "\t");
					System.out.println("Specialization: " + jsonObject.get("Specialization") + "\t");
					System.out.println("Availability: " + jsonObject.get("Availability") + "\t");
					System.out.println("Number of Patients: " + jsonObject.get("Patients") + "\n");
					
					//asks user if want to take an appointment
					System.out.println("Do you want to take an appointment?[y/n]");
					String response = Utility.readString().toLowerCase();
					if (response.equals("y")) {
						makeAppointment(lastJasonObject);
					}
					else {
						ClinicController.menu();
					}
				}
			}
			System.out.println("Enter valid Doctor "+key);
			ClinicController.doctorChoice(choice);
	}

	@SuppressWarnings("unchecked")
	private void makeAppointment(JSONObject doctorJsonObject) {
		String patientId = "";
		String doctorId = (String) doctorJsonObject.get("Id");
		long patients = (long) doctorJsonObject.get("Patients");
		if (patients >= 5) { // doctor is busy
			System.out.println("Sorry!!! Doctor is busy today. Do you want to take an appointment tomorrow[y/n]");
			//current date
		      LocalDate today = LocalDate.now();
			  
			//adding one day to the localdate
			LocalDate tomorrow = today.plusDays(1);
			DateTimeFormatter format =  DateTimeFormatter.ofPattern("dd-MM-yyyy");   
		    
		    String date = tomorrow.format(format); 
			  
			//System.out.println("Tomorrow's Date: "+dateTime);
			String response = Utility.readString().toString();
			if(response.equals("y")) {
			
				JSONArray jsonArray = ClinicRepository.readData(appointment);
				JSONObject jsonObject = new JSONObject();
				patientId = Utility.patientId(); 
				jsonObject.put("DoctorId", doctorId);
				jsonObject.put("PatientId", patientId);
				jsonObject.put("AppointmentDate", date);
				//jsonObject.put("Total Patient", count++);
				
				jsonArray.add(jsonObject);
				
				ClinicRepository.writeData(appointment, jsonArray);
				System.out.println("Congratulation You got an appointment on "+date+". Your Patient ID is " + patientId + "\n");
				ClinicController.menu();
			}
			else {
				ClinicController.menu();
			}
			
			
		} 
		// doctor is not busy. Increases number of patients and updates json file
		else { 
			patientId = Utility.patientId(); 
			// updates patient json file
			patientDetailsNew(patientId,doctorId);
			doctorJsonObject.put("Patients", patients+1);
			updateDoctorData(doctorJsonObject);
			System.out.println("Congratulation You got an appointment. Your Patient ID is " + patientId + "\n");
			ClinicController.menu();
		}

	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	private void updateDoctorData(JSONObject doctorJsonObject) {

		jsonArray = ClinicRepository.readData(doctor);

		JSONArray updatedArray = new JSONArray(); // new array with updated elements
		Iterator iterator = jsonArray.iterator();

		// iterates over array
		while (iterator.hasNext()) {
			JSONObject object = (JSONObject) iterator.next();
			if (object.get("Id").equals(doctorJsonObject.get("Id"))) {
				updatedArray.add(doctorJsonObject);
			} else {
				updatedArray.add(object);
			}
		}

		ClinicRepository.writeData(doctor, updatedArray);

	}

	@SuppressWarnings("unchecked")
	public void patientDetailsNew(String id, String doctorId) {

		JSONArray jsonArray = ClinicRepository.readData(patient);

		PatientBio patientDetails = new PatientBio();
		System.out.println("Enter Patient Name");
		String patientName = Utility.readString();
		if (Utility.isStringOnlyAlphabet(patientName)) {
			patientDetails.setpatientname(patientName);
		}

		System.out.println("Enter Mobile Number");
		String mobile = Utility.readString();
		if (Utility.mobileNumberValidator(mobile)) {
			System.out.println("Mobile :" + mobile);
			patientDetails.setMobilenumber(Long.parseLong(mobile));
		}

		System.out.println("Enter Age");
		int age = Utility.readInt();
		patientDetails.setAge(age);

		patientDetails.setpatientId(Utility.patientId());

		jsonObject.put("Id", patientDetails.getpatientId());
		jsonObject.put("Name", patientDetails.getpatientname());
		jsonObject.put("Mobile", patientDetails.getMobilenumber());
		jsonObject.put("Age", patientDetails.getAge());
		jsonObject.put("Doctor Id",doctorId);

		jsonArray.add(jsonObject);
		//System.out.println(jsonArray);
		ClinicRepository.writeData(patient, jsonArray);
	}

	@SuppressWarnings("rawtypes")
	@Override
	public void readPatientData(String key, String value) {
		jsonArray = ClinicRepository.readData(patient);
		Iterator iterator = jsonArray.iterator();
		JSONObject jsonObject;
		while (iterator.hasNext()) {
			if ((jsonObject = (JSONObject) iterator.next()).containsValue(value)) {
				System.out.println("\nPatient Information:");
				System.out.println("ID: " + jsonObject.get("Id") + "\t");
				System.out.println("Name: " + jsonObject.get("Name") + "\t");
				System.out.println("Mobile Number: " + jsonObject.get("Mobile") + "\t");
				System.out.println("Age: " + jsonObject.get("Age") + "\n");
			}
		}
		ClinicController.menu();
	}

	
}
