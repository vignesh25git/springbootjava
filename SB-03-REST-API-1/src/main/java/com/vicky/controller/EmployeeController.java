package com.vicky.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vicky.entity.Employee;
import com.vicky.service.EmployeeService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/hello")
	public String helloWorldEmployee() {
		return "Hello Employee ";
	}
	
	@GetMapping("/get/{empid}")
	public Employee getEmployeeById(@PathVariable("empid") Integer empid) {
		System.out.println("hello");
		System.out.println(empid);
		return employeeService.getEmployee(empid);
		
	}
	
	@PostMapping("/add")
	public Employee addEmployee(@RequestBody Employee employee) {
		return employeeService.addEmployee(employee);
	}
	

}
