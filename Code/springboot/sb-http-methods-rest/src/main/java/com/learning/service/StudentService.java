package com.learning.service;

import com.learning.dto.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    private List<Student> list = new ArrayList<>();

    public boolean add(Student student) {
        return list.add(student);
    }

    public List<Student> getAll() {
        return list;
    }

    public boolean delete(int id) {
        int idx = getStudentIndex(id);
        return list.remove(idx) != null;
    }

    public boolean update(Student student) {
        int idx = getStudentIndex(student.getId());
        return list.set(idx, student) != null;
    }

    public boolean updateStudName(int sid, String name) {
        int idx = getStudentIndex(sid);
        Student stud = list.get(idx);
        stud.setName(name);
        return true;
    }

    private int getStudentIndex(int studId) {
        int index = 0;
        for(Student stud : list) {
            if(stud.getId() == studId) {
                break;
            }
            index++;
        }
        return index;
    }


}
