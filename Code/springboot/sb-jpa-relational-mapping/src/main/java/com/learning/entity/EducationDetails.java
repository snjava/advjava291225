package com.learning.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Table(name = "edu_details")
@Entity
public class EducationDetails {
    @Column(name = "eduid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int eduId;
    private String title;
    private String year;
    private double percent;

    @JsonBackReference
    @JoinColumn(name = "eid")
    @ManyToOne // Many EduDetails To One Employee
    private Employee employee;

    public int getEduId() {
        return eduId;
    }

    public void setEduId(int eduId) {
        this.eduId = eduId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
