package com.madical.report.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.madical.report.model.entity.TestResultsEntity;
import com.madical.report.service.TestResultsService;

@RestController
@RequestMapping(value="/TestResults")
public class TestResultsController {
	

	@Autowired
	private TestResultsService testResultsService;
	
	// GET method
	@GetMapping(path="/")
	public List<TestResultsEntity> getTestResults() {
	
		return testResultsService.getTestResultsList();
	
	}
	
	//POST Method
	@PostMapping(path="/")
	public TestResultsEntity addTestResults(@RequestBody TestResultsEntity newTestResult) {
		
		return testResultsService.addTestResults(newTestResult);
		
	}

}	