package com.madical.report.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.madical.report.model.entity.TestResultsEntity;
import com.madical.report.repository.TestResultsRepository;

@Service
public class TestResultsService {

     @Autowired
     private TestResultsRepository testResultsRepository;


     public List<TestResultsEntity> getTestResultsList() {

	return testResultsRepository.findAll();
   
    }
     
     public TestResultsEntity addTestResults(TestResultsEntity newTestResult) {
 		
 		return testResultsRepository.save(newTestResult);
 		
 	}
 	
 	public TestResultsEntity getTestResultByAppointmentID(Long appointmentID) {
 		
 		return testResultsRepository.findByAppointmentID(appointmentID);
 	}
     
}

