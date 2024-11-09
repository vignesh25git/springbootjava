package com.vicky.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vicky.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
