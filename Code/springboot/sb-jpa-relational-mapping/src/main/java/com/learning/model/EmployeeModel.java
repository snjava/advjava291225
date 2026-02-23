package com.learning.model;

import com.learning.entity.Address;
import com.learning.entity.EducationDetails;

import java.util.List;

public class EmployeeModel {
    private int id;
    private String name;
    private String email;
    private String contact;
    private Address address;
    private List<EducationDetails> educationDetails;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<EducationDetails> getEducationDetails() {
        return educationDetails;
    }

    public void setEducationDetails(List<EducationDetails> educationDetails) {
        this.educationDetails = educationDetails;
    }
}
