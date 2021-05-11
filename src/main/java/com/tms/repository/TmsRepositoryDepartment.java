package com.tms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tms.entity.Department;

public interface TmsRepositoryDepartment extends JpaRepository<Department, Integer> {

	List<Department> findAll();
}

