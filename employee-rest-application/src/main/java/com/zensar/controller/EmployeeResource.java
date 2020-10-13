package com.zensar.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.model.Employee;

@RestController
@RequestMapping("/api/v1")

public class EmployeeResource {

	public List<Employee> employees = Arrays.asList(
			new Employee(1001, "Raveena", 10000),
			new Employee(1002, "dipika", 20000),
			new Employee(1003, "kajal", 30000),
			new Employee(1004, "priyanka", 40000)

	);
	
	@GetMapping(value = "/employees")
	@CrossOrigin(origins= "http://localhost:4200")
	public List<Employee> getAllEmployees() {
		return employees;
	}
}
