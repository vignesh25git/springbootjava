package com.vicky.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vicky.entity.Employee;
import com.vicky.repos.EmployeeRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public Employee addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepository.save(employee);
	}

	@Override
	public Employee getEmployee(Integer empid) {
		System.out.println(empid);
		return employeeRepository.findById(empid).orElseThrow(()-> new EntityNotFoundException("Employee not found"));
	}

	@Override
	public void deleteEmployee(Integer empid) {
		//employeeRepository.deleteById(empid); -> one way of delete
		
		if (employeeRepository.existsById(empid)) {
			employeeRepository.deleteById(empid);
		} else {
			throw new EntityNotFoundException("User not found for Deleting..." + empid);
		}
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

	@Override
	public Employee updateEmployee(Integer empid,Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepository.findById(empid).map(emp -> {
			emp.setAge(employee.getAge());
			emp.setDob(employee.getDob());
			emp.setId(employee.getId());
			emp.setName(employee.getName());
			emp.setSalary(employee.getSalary());
			return employeeRepository.save(emp);
		}).orElseThrow(()-> new EntityNotFoundException("Employee not found"));
	}

	
}
