package com.example.employee.Service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import java.time.*;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.example.employee.Entity.Employee;
import com.example.employee.Repository.EmployeeRepository;

@ExtendWith(MockitoExtension.class)
public class EmployeeServiceTest {
    
    @InjectMocks
    private EmployeeService empService;

    @Mock
    private EmployeeRepository empRepo;

    @Test
    public void save() {

        Employee emp1 = new Employee("1","kunaal","kun@g.com", LocalDate.of(2000, Month.APRIL, 12));

        when(empRepo.save(any(Employee.class))).thenReturn(emp1);
        when(empRepo.findAll()).thenReturn(new ArrayList<Employee>( List.of(emp1)) );


        List<Employee> listemp = empService.addNewEmployee(emp1);

        assertNotNull(listemp);
        assertThat(listemp.get(0).getEmpName()).isEqualTo("kunaal");
    }
}
