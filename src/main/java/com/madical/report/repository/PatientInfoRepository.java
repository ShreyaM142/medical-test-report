package com.madical.report.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.madical.report.model.entity.PatientInfoEntity;

@Repository
public interface PatientInfoRepository extends JpaRepository<PatientInfoEntity, Long> {

	PatientInfoEntity findByAppointmentID(Long appointmentID);
}


