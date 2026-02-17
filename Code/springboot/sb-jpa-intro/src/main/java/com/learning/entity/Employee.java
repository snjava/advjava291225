package com.learning.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.Date;

@Table(name = "emp_details")
@Entity
public class Employee {
    //@SequenceGenerator(name = "emp_seq", initialValue = 1000, allocationSize = 1)
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "emp_seq")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "empId")
    @Id
    private int id;
    private String name;
    @Column(name = "empEmail", length = 50, unique = true, nullable = false)
    private String email;
    @Column(precision = 10)
    private double salary;
    @Enumerated(EnumType.STRING)
    private CityValues city;
    @Temporal(TemporalType.DATE)
    private Date joinDate;
    @CreationTimestamp
    private LocalDateTime createdOn;
    @UpdateTimestamp
    private LocalDateTime updatedOn;
    private boolean active;
    @Transient
    private int age;
}
