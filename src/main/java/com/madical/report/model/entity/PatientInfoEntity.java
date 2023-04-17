package com.madical.report.model.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "patient")
public class PatientInfoEntity {
	
	@Id
	@Column(name = "PatientID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long patientID;
	
	@Column(name = "LastName")
	private  String lastName;
	
	@Column(name = "FirstName")
	private String firstName;
	
	@Column(name = "Age")
	private Integer age;
	
	@Column(name = "Gender")
	private String gender;
	
	@Column(name = "Email")
	private String email;
	
	@Column(name = "PhoneNumber")
	private Long phoneNumber;
	
	@Column(name = "AppointmentID")
	private Long appointmentID;

}
