package com.vicky.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.vicky.entity.Employee;

@Service
public interface EmployeeService {
	
	public Employee addEmployee(Employee employee);
	public Employee getEmployee(Integer empid);
	public Employee deleteEmployee(Integer empid);
	public List<Employee> getAllEmployees();
	public Employee updateEmployee(Employee employee);
	
}
