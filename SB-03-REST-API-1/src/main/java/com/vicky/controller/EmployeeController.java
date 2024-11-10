package com.vicky.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.vicky.entity.Employee;
import com.vicky.service.EmployeeService;

import lombok.extern.slf4j.Slf4j;





@RestController
@Slf4j
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/hello")
	public String helloWorldEmployee() {
		return "Hello Employee ";
	}

//how to access the value from the URL using the path variable	
	@GetMapping("/get/{empid}")
	public Employee getEmployeeById(@PathVariable("empid") Integer empid) {
		log.info("getEmployeeById " + empid);
		return employeeService.getEmployee(empid);
		
	}
	
	@PostMapping("/add")
	public Employee addEmployee(@RequestBody Employee employee) {
		log.info("addEmployee " + employee.getId());
		return employeeService.addEmployee(employee);
	}
	
	@PutMapping("update/{id}")
	public Employee updateEmployee(@PathVariable Integer id, @RequestBody Employee employee) {
		
		return employeeService.updateEmployee(id,employee);
	}
	
	@DeleteMapping("delete/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteEmployee(@PathVariable Integer id) {
		
		employeeService.deleteEmployee(id); 
	}
	
	@GetMapping("/getall")
	public List<Employee> getAllEmployee() {
		return employeeService.getAllEmployees();
	}
	

}
