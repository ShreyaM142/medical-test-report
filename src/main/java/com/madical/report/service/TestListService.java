package com.madical.report.service;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.madical.report.model.entity.TestListEntity;
import com.madical.report.repository.TestListRepository;

@Service
public class TestListService {
	
	@Autowired
	private TestListRepository TestListRepository;
	
	// property
	
	public List<TestListEntity> getTestDetailsList() {
		
			List<TestListEntity> TestDetailsList = new ArrayList<>();
		
	    // populate list from repository
			TestDetailsList = TestListRepository.findAll();
	      
	      
		return TestDetailsList;

	      
	      

	   }
	
}
	
	


