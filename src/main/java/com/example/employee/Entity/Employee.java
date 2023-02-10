package com.example.employee.Entity;

// import java.sql.Timestamp;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

@Entity
public class Employee {

    @Id
    @SequenceGenerator(
        name = "employee_sequence",
        sequenceName = "employee_sequence",
        allocationSize = 1
    )
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "employee_sequence"
    )
    private String EmpID;
	
	private String EmpName;
	private String EmpEmail;

	private LocalDate joiningDate;

    public Employee(String empID, String empName, String empEmail, LocalDate localDate) {
        EmpID = empID;
        EmpName = empName;
        EmpEmail = empEmail;
        this.joiningDate = localDate;
    }

    public String getEmpID() {
        return EmpID;
    }

    public String getEmpName() {
        return EmpName;
    }

    public String getEmpEmail() {
        return EmpEmail;
    }

    public LocalDate getJoiningDate() {
        return joiningDate;
    }

    public void setEmpID(String empID) {
        EmpID = empID;
    }

    public void setEmpName(String empName) {
        EmpName = empName;
    }

    public void setEmpEmail(String empEmail) {
        EmpEmail = empEmail;
    }

    public void setJoiningDate(LocalDate joiningDate) {
        this.joiningDate = joiningDate;
    }   
    
}
