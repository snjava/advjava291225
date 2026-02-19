package com.learning.entity;
import jakarta.persistence.*;

// SQL: select * from emp_details WHERE emp_name = 'A';
// HQL: select * from Employee WHERE name = 'A';

@Table(name = "emp_details")
@Entity
public class Employee {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;
    @Column(name = "emp_name", length = 30)
    private String name;
    @Column(name = "emp_city", length = 30)
    private String city;
    private int experience;
    private String skills;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }
}
