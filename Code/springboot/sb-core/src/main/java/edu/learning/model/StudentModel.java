package edu.learning.model;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class StudentModel {

    public StudentModel() {
        System.out.println(" StudentModel Object Created");
    }

    @PostConstruct
    public void setup() {
        System.out.println("Post Object Creation of the StudentModel");
    }

    @PreDestroy
    public void cleanup() {
        System.out.println("Student Object Destroy");
    }

    public void save() {
        System.out.println("Student Save");
    }

    public void get() {
        System.out.println("Student Get");
    }

    public void update() {
        System.out.println("Student Update");
    }
}
