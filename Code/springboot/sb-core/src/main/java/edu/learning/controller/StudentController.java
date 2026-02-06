package edu.learning.controller;

import edu.learning.model.Employee;
import edu.learning.model.StudentModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class StudentController {

    @Autowired
    StudentModel studentModel;  // Dependency Injection

    @Qualifier("getEmp2")
    @Autowired
    Employee employee;

    public void saveStudentDetails() {
        studentModel.save();
        System.out.println("Employee Department : " + employee.getDepartment());
    }
}
