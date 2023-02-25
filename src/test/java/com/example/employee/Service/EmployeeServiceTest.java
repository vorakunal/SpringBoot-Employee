package com.example.employee.Service;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import java.time.*;

import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import com.example.employee.Entity.Employee;
import com.example.employee.Repository.EmployeeRepository;

public class EmployeeServiceTest {
    
    @InjectMocks
    private EmployeeService empService;

    @Mock
    private EmployeeRepository empRepo;

    @Test
    void save() {

        Employee emp1 = new Employee("1","kunaal","kun@g.com", LocalDate.of(2000, Month.APRIL, 12));

        when(empRepo.save(any(Employee.class))).thenReturn(emp1);
    }
}
