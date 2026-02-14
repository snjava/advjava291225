package com.learning.controller;

import com.learning.dto.Student;
import com.learning.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;
    @PostMapping("/save-student")
    public String addStudent(@RequestBody Student student) {
        boolean flag = studentService.add(student);
        String message = flag ? "Student Created Successfully"  : "Student Creation Failed" ;
        return message;
    }

    @GetMapping("/get-all-students")
    public List<Student> getAllStudent() {
        return studentService.getAll();
    }

    @DeleteMapping("/delete-stud-by-id/{sid}")
    public String deleteStudent(@PathVariable(name = "sid") int id) {
        boolean flag = studentService.delete(id);
        String message = flag ? "Student Deleted Successfully"  : "Failed to Delete Student " ;
        return message;
    }

    @PutMapping("/update-stud")
    public String updateStudent(@RequestBody Student student) {
        boolean flag = studentService.update(student);
        String message = flag ? "Student Updated Successfully"  : "Failed to Update Student " ;
        return message;
    }

    @PatchMapping("/update-stud-name")
    public String updateStudent(@RequestParam("sid") int id, @RequestParam("name") String name) {
        boolean flag = studentService.updateStudName(id, name);
        String message = flag ? "Student Updated Successfully"  : "Failed to Update Student " ;
        return message;
    }

}
