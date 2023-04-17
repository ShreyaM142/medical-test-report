package com.madical.report.model.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "TestList")

public class TestListEntity {
	
	@Id
	@Column(name = "TestID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long TestID;
	
	@Column(name = "TestName")
	private  String testName;
	
	@Column(name = "Availability")
	private String availability;
	
}
