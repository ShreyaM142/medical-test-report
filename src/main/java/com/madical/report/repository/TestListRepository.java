package com.madical.report.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.madical.report.model.entity.TestListEntity;

@Repository
public interface TestListRepository extends JpaRepository<TestListEntity, Long> {

}