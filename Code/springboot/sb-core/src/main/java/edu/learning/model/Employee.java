package edu.learning.model;

public class Employee {
    private String department;

    public Employee() {}

    public Employee(String department) {
        this.department = department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }
}
