package com.learning.controller;

import com.learning.entity.Address;
import com.learning.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AddressController {

    @Autowired
    private AddressRepository addressRepository;

    @PostMapping("/save-add")
    public Address saveAddDetails(@RequestBody Address address) {
        return addressRepository.save(address);
    }

    @PostMapping("/get-add")
    public List<Address> getAddDetails() {
        return addressRepository.findAll();
    }

}
