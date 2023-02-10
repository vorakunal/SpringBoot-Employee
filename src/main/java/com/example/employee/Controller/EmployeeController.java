package com.example.employee.Controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.employee.Entity.Employee;
import com.example.employee.Service.EmployeeService;

@RestController
@RequestMapping("api/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService empservice;

    // @GetMapping("/")
	// public String hello()
	// {
	// 	return "hello world";
	// } 

	@GetMapping
    public List<Employee> getEmployee() {
		return empservice.getEmployee();
	}
    
}
