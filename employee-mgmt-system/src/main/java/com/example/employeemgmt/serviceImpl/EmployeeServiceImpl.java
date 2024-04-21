package com.example.employeemgmt.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.employeemgmt.dto.EmployeeDTO;
import com.example.employeemgmt.entity.Employee;
import com.example.employeemgmt.mapper.EmployeeMapper;
import com.example.employeemgmt.repository.EmployeeRepository;
import com.example.employeemgmt.service.EmployeeService;

@Service

public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public EmployeeDTO createEmployee(EmployeeDTO employeeDTO) {
		Employee employee = EmployeeMapper.mapToEntity(employeeDTO);
		Employee savedEmployee = employeeRepository.save(employee);
		return EmployeeMapper.mapToDTO(savedEmployee);
	}

}
