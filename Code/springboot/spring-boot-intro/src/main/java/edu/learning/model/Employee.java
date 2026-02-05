package edu.learning.model;

import org.springframework.stereotype.Component;

@Component
public class Employee {
    public Employee() {
        System.out.println("Employee Class Object Created");
    }

    public void printDetails() {
        System.out.println("I am the method of Employee Cass");
    }
}
