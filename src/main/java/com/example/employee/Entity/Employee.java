package com.example.employee.Entity;

import java.sql.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {

    @Id
    private String EmpID;
	
	private String EmpName;
	private String EmpEmail;

	private Timestamp joiningDate;

    public Employee(String empID, String empName, String empEmail, Timestamp joiningDate) {
        EmpID = empID;
        EmpName = empName;
        EmpEmail = empEmail;
        this.joiningDate = joiningDate;
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

    public Timestamp getJoiningDate() {
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

    public void setJoiningDate(Timestamp joiningDate) {
        this.joiningDate = joiningDate;
    }   
    
}
