package com.example.employee.Controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.employee.Entity.Employee;
import com.example.employee.Service.EmployeeService;

import jakarta.validation.Valid;

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

	@GetMapping("allemp")
    public List<Employee> getEmployee() {
		return empservice.getEmployee();
	}

	@PostMapping("saveemp")
	public List<Employee> addNewEmployee(@RequestBody Employee emp)  //Map<String, Object> payload
	{
		System.out.println(emp);
		return empservice.addNewEmployee(emp);
		// return new ArrayList<Employee>();
	}

	@DeleteMapping("emps/{id}")
	public ResponseEntity<Boolean> deleteEmp(@PathVariable("id") String id) // ???
	{
		boolean res = empservice.removeEmp(id);
		return new ResponseEntity<>(res, HttpStatus.GONE);
	}

	@PutMapping("update/{id}")
	public ResponseEntity<Boolean> updateAllField(@PathVariable("id") String id, 
								@RequestBody @Valid Employee emp)
	{
		boolean res = empservice.putUpdate(id);
		return new ResponseEntity<>(res, HttpStatus.OK);
	}
    
}
