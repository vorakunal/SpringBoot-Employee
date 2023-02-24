package com.example.employee.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Optionals;
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

    public List<Employee> addNewEmployee(Employee emp) {
      // System.out.println("ddddddddddddddddddddddd");

      System.out.println(emp);
      emprepo.save(emp);

      return emprepo.findAll();
    }

    public boolean removeEmp(String id)
    {
        boolean isFound = emprepo.existsById(id);
        emprepo.deleteById(id);

        return isFound;
    }

    public boolean putUpdate(String id)
    {
        boolean isFound = emprepo.existsById(id);
        Optional<Employee> e = emprepo.findById(id);
        System.out.println(e);
        if(e.isPresent()) {
            Employee existingEmployee = e.get();
            System.out.println(existingEmployee);
        } else {
            //there is no Customer in the repo with 'id'
            
        }

        return isFound; 
    }
}
