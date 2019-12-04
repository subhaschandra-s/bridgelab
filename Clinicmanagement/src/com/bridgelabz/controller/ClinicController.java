package com.bridgelabz.controller;

import com.bridgelabz.Utility.Utility;
import com.bridgelabz.serviceImpl.ClinicServiceImpl;

public class ClinicController 
{
	static ClinicServiceImpl service = new ClinicServiceImpl();

	public static void main(String[] args) 
	{

		menu();
	}

	public static void menu() 
	{
		System.out.println("Select option");
		System.out.println("1. Add Doctor Details");
		System.out.println("2. Search Doctor");
		System.out.println("3. Search Patient");
		System.out.println("4. Exit");

		String choice = Utility.readString();
		
			switch (choice) {
			case "1":
				service.doctorDetails();
				menu();
				break;
			case "2":
				doctorInput();
				break;
			case "3":
				patientInput();
				break;
			case "4":
				Utility.quit();
				System.out.println("Thanks!!! Have a nice Day ");
				break;
			default:
				System.out.println("Invalid option");
				menu();
				break;
			}
		
		
	}

	private static void doctorInput() {
		System.out.println("Search doctor by:");
		System.out.println("1. Name");
		System.out.println("2. ID");
		System.out.println("3. Specialization");
		System.out.println("4. Availability");
		String choice = Utility.readString();
		doctorChoice(choice);
		
	}

	public static void doctorChoice(String choice) {
		switch (choice) {
		case "1":
			System.out.print("Enter name:");
			
			service.readDoctorData("Name", Utility.readString(),choice);
			break;
		case "2":
			System.out.print("Enter ID:");
			service.readDoctorData("Id", Utility.readString(),choice);
			break;
		case "3":
			System.out.print("Enter speacialization:");
			service.readDoctorData("Specialization", Utility.readString(),choice);
			break;
		case "4":
			System.out.print("Enter availability::");
			service.readDoctorData("Availability", Utility.readString(),choice);
			break;
		default:
			System.out.println("select valid option\n");
			doctorChoice(choice);
		}
	}

	private static void patientInput() {
		System.out.println("Search patient by:");
		System.out.println("1. Name");
		System.out.println("2. ID");
		System.out.println("3. Mobile Number");
		String choice = Utility.readString();
		patientChoice(choice);

	}

	private static void patientChoice(String choice) {
		switch (choice) {
		case "1":
			Utility.readString();
			System.out.print("Enter name:");
			service.readPatientData("Name", Utility.readString());
			break;
		case "2":
			System.out.print("Enter ID:");
			service.readPatientData("Patient Id", Utility.readString());
			break;
		case "3":
			System.out.print("Enter mobile number:");
			service.readPatientData("Mobile", Utility.readString());
			break;
		default:
			System.out.println("Please select valid option");
			patientChoice(choice);
			break;
		}
	}

}
