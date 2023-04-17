package com.madical.report.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.madical.report.model.entity.PatientInfoEntity;
import com.madical.report.service.PatientInfoService;


@RestController
@RequestMapping(value="/PatientInfo")
public class PatientInfoController {
	
	@Autowired
	private PatientInfoService patientInfoService;
	
	// GET method
	@GetMapping(path="/")
	public List<PatientInfoEntity> getPatientInfo() {
	
		return patientInfoService.getPatientInfoList();
	
	}
	
	@PostMapping(path="/")
	public PatientInfoEntity addPatientInfo(@RequestBody PatientInfoEntity newPatient) {
		
		return patientInfoService.addPatientInfo(newPatient);
		
	}
	
	
	
}