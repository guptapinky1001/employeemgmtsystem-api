package com.example.employeemgmt.mapper;

import com.example.employeemgmt.dto.EmployeeDTO;
import com.example.employeemgmt.entity.Employee;

public class EmployeeMapper {

	public static EmployeeDTO mapToDTO(Employee employee) {
		return new EmployeeDTO(employee.getId(), employee.getFirstName(), employee.getLastName(), employee.getEmail());

	}

	public static Employee mapToEntity(EmployeeDTO employeeDTO) {
		return new Employee(employeeDTO.getId(), employeeDTO.getFirstName(), employeeDTO.getLastName(),
				employeeDTO.getEmail());

	}
}
