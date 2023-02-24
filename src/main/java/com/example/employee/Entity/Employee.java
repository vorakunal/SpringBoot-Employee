package com.example.employee.Entity;

// import java.sql.Timestamp;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.validation.constraints.NotNull;

@Entity
public class Employee {

    // @SequenceGenerator(
    //     name = "employee_sequence",
    //     sequenceName = "employee_sequence",
    //     allocationSize = 1
    // )
    // @GeneratedValue(
    //     strategy = GenerationType.SEQUENCE,
    //     generator = "employee_sequence"
    // )
    
    @Id
    @Column(name="empid",unique=true)
    @NotNull
    private String EmpID;
    
	
    @Column(name="empname")
    @NotNull
	private String EmpName;

    @Column(name="empemail")
    @NotNull
	private String EmpEmail;

    @Column(name="doj")
    @NotNull
	private LocalDate joiningDate;

    public Employee() {}

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

    // @Override
    public String toString()
    {
        return EmpEmail + " " + EmpName + " " + EmpID + " " + joiningDate;
        
    }

    
}
