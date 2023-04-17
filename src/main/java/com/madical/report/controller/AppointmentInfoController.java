package com.madical.report.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.madical.report.model.entity.PatientInfoEntity;
import com.madical.report.service.PatientInfoService;

@RestController
@RequestMapping(value="/AppointmentInfo")
public class AppointmentInfoController {
	
//	@Autowired
//	private AppointmentInfoService appointmentInfoService/;
	
	@Autowired
	private PatientInfoService patientInfoService;
	
	
	 @GetMapping("/{appointmentId}")
	  public PatientInfoEntity getPatientDetails(@PathVariable Long appointmentId) {
		 
		 return patientInfoService.getPatientInfoByAppointmentID( appointmentId);
		 
	  }
	 
}	 
