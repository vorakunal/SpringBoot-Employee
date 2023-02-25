package com.example.employee.Repository;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.time.LocalDate;
import java.time.Month;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import com.example.employee.Entity.Employee;


@DataJpaTest
public class EmployeeRepoTest {

    @Autowired
    private EmployeeRepository empRepo;

    @Test
    void save() {
        //Arrange
        Employee emp1 = new Employee("1","kunaal","kun@g.com", LocalDate.of(2000, Month.APRIL, 12));
        //Act
        Employee newEmp = empRepo.save(emp1);
        //Assert
        assertNotNull(newEmp);
        assertThat(newEmp.getEmpID()).isNotEqualTo(null);
    }

}
