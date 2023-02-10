package com.example.employee.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.employee.Entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, String>{
    
}
