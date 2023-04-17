package com.madical.report.model.entity;

import java.time.LocalDateTime;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "TestResults")
public class TestResultsEntity {
	
	@Id
	@Column(name = "ResultID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long resultID;
	
	@ManyToOne
	@JoinColumn(name = "PatientID")
	private PatientInfoEntity patientID;
	
	@Column(name = "AppointmentID")
	private Long appointmentID;
	
	@Column(name = "Hemoglobin")
	private  Integer hemoglobin;
	
	@Column(name = "BloodResult")
	private String bloodResult;
	
	@Column(name = "UrinepHLevel")
	private Integer urinepHLevel;
	
	@Column(name = "BacterialPresence")
	private String bacterialPresence;
	
	@Column(name = "XrayImageDate&Time")
	private LocalDateTime xrayImageDateTime;
	
	@Column(name = "XrayResult")
	private String xrayResult;
	
	@Column(name = "CTScanTest")
	private String ctScanTest;
	
	@Column(name = "CTScanResult")
	private String ctScanResult;
	
	@Column(name = "MRITest")
	private String mriTest;
	
	@Column(name = "MRIResult")
	private String mriResult;
	
	@Column(name = "ECGType")
	private String ecgType;
	
	@Column(name = "HeartbeatperMin")
	private Integer heartbeatperMin;

}
