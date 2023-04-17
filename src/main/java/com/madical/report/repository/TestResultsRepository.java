package com.madical.report.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.madical.report.model.entity.TestResultsEntity;

@Repository
public interface TestResultsRepository extends JpaRepository<TestResultsEntity, Long> {

	TestResultsEntity findByAppointmentID(Long appointmentID);

}
