package edu.learning.dto;

import org.springframework.stereotype.Component;

public class Student extends Person {
    private String clgName;
    public Student(String clgName) {
        this.clgName = clgName;
        System.out.println("Student Class Object Created");
    }

    public void printDetails() {
        System.out.println("Student College Name : " + clgName);
    }

}
