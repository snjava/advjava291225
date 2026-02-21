package com.learning.controller;

import com.learning.entity.Employee;
import com.learning.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @PostMapping("/save-emp")
    public Employee saveEmpDetails(@RequestBody Employee employee) {
        return employeeRepository.save(employee);
    }

    @PostMapping("/get-emp")
    public List<Employee> getEmpDetails() {
        return employeeRepository.findAll();
    }

}
