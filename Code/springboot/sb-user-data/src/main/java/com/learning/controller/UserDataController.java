package com.learning.controller;

import com.learning.mode.Employee;
import org.springframework.web.bind.annotation.*;

@RestController("user-controller")
@RequestMapping("/user-data")
public class UserDataController {

    // http://localhost:8080/user-data/student-details?id=12&name=Xyz&contact=9988776655
    @GetMapping("/student-details")
    public String studentDetails(@RequestParam("id") int id,
                                 @RequestParam("name") String name,
                                 @RequestParam("contact") String contact) {
        System.out.println("Id : " + id);
        System.out.println("Name : " + name);
        System.out.println("Contact : " + contact);
        return "Hello User : " + name;
    }

    // http://localhost:8080/user-data/Mumbai/34352/address-details/MH
    @GetMapping("/{ct}/{pin}/address-details/{state}")
    public String addressDetails(@PathVariable(name = "ct") String city,
                                 @PathVariable(name = "pin") int pincode,
                                 @PathVariable(name = "state") String state) {
        System.out.println("City : " + city);
        System.out.println("Pincode : " + pincode);
        System.out.println("State : " + state);
        return "City id  : " + city;
    }

    // http://localhost:8080/user-data/employee-details
    @PostMapping("/employee-details")
    public String employeeDetails(@RequestBody Employee employee) {
        System.out.println("Name : " + employee.getEmpName());
        System.out.println("Salary : " + employee.getSalary());
        System.out.println("Dept : " + employee.getDept());
        return "Data In JSON";
    }


}
