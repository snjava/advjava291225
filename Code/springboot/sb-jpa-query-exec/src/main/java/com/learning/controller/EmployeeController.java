package com.learning.controller;

import com.learning.entity.Employee;
import com.learning.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @PostMapping("/save-emp")
    public Employee saveEmployee(@RequestBody Employee employee) {
        return employeeRepository.save(employee);
    }

    @GetMapping("/get-emp")
    public List<Employee>  getEmployee() {
        return employeeRepository.findAll();
    }

    @GetMapping("/get-by-name")
    public List<Employee>  getEmployeeByName(@RequestParam("name") String name) {
        return employeeRepository.findByName(name);
    }

    @GetMapping("/get-by-city/{city}")
    public List<Employee>  getEmployeeByCity(@PathVariable(name = "city") String city) {
        return employeeRepository.findByCity(city);
    }

    @GetMapping("/get-by-Skills/{skills}")
    public List<Employee>  getEmployeeBySkills(@PathVariable(name = "skills") String skills) {
        return employeeRepository.findBySkillsContaining(skills);
    }

    @GetMapping("/get-by-experience/{min}/{max}")
    public List<Employee>  getEmployeeByExperience(@PathVariable(name = "min") int min, @PathVariable(name = "max") int max) {
        return employeeRepository.findByExperienceBetween(min, max);
    }

}
