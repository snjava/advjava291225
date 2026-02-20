package com.learning.controller;

import com.learning.EmployeeCount;
import com.learning.entity.Employee;
import com.learning.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

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

    @PatchMapping("/update-emp-skills")
    public String updateSkills(@RequestParam("name") String name, @RequestParam("skills") String skills) {
        employeeRepository.updateSkills(name, skills);
        return "SKILLS UPDATED SUCCESSFULLY...";
    }

    @PatchMapping("/update-emp-city")
    public String updateCity(@RequestParam("name") String name, @RequestParam("city") String city) {
        employeeRepository.updateCity(name, city);
        return "CITY UPDATED SUCCESSFULLY...";
    }

    @GetMapping("/get-empcount-for-city")
    public List<EmployeeCount> getEmpCount() {
        return employeeRepository.getEmpCountByCity();
    }

    @DeleteMapping("/delete-by-city/{city}")
    public String deleteByCity(@PathVariable(value = "city") String city) {
        employeeRepository.deleteByCity(city);
        return "EMPLOYEE DELETED SUCCESSFULLY..";
    }

}
