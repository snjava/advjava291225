package com.learning.entity;

import jakarta.persistence.*;

@Table(name = "address_details")
@Entity
public class Address {
    @Column(name = "addid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;
    private String city;
    private String pinncode;
    private String state;
    private String addressline;
    @JoinColumn(name = "eid")
    @OneToOne(cascade = CascadeType.ALL)
    private Employee employee;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPinncode() {
        return pinncode;
    }

    public void setPinncode(String pinncode) {
        this.pinncode = pinncode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getAddressline() {
        return addressline;
    }

    public void setAddressline(String addressline) {
        this.addressline = addressline;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
