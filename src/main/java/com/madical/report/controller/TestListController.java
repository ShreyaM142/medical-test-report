package com.madical.report.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.madical.report.model.entity.TestListEntity;
import com.madical.report.service.TestListService;


@RestController
@RequestMapping(value="/TestDetails")
@CrossOrigin
public class TestListController {
	@Autowired
	private TestListService testListService;

	// GET method
	@GetMapping(path="/")
	public List<TestListEntity> getTestDetails() {
			return testListService.getTestDetailsList();
			
	
	}

	
}