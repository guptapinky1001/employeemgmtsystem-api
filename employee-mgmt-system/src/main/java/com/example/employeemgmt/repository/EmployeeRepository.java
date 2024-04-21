package com.example.employeemgmt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.employeemgmt.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
