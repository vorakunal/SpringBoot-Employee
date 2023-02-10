package com.example.employee.Service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.employee.Entity.Employee;
import com.example.employee.Repository.EmployeeRepository;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository emprepo;
    
    public List<Employee> getEmployee() {
		return emprepo.findAll();
	}
}
