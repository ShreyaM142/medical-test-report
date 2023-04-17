package com.madical.report.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.madical.report.model.entity.PatientInfoEntity;
import com.madical.report.repository.PatientInfoRepository;

@Service
public class PatientInfoService {
	
	@Autowired
	private PatientInfoRepository patientInfoRepository;
	
	
	public List<PatientInfoEntity> getPatientInfoList() {

		return patientInfoRepository.findAll();
	   
	}
	
	public PatientInfoEntity addPatientInfo(PatientInfoEntity newPatient) {
		
		return patientInfoRepository.save(newPatient);
		
	}
	
	public PatientInfoEntity getPatientInfoByAppointmentID(Long appointmentID) {
		
		return patientInfoRepository.findByAppointmentID(appointmentID);
	}
	
	  
}