package com.learning.controller;

import com.learning.entity.Address;
import com.learning.entity.EducationDetails;
import com.learning.repository.AddressRepository;
import com.learning.repository.EducationDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EducationDetailsController {

    @Autowired
    private EducationDetailsRepository educationDetailsRepository;

    @PostMapping("/save-edu-details")
    public List<EducationDetails> saveEduDetails(@RequestBody List<EducationDetails> educationDetails) {
        return educationDetailsRepository.saveAll(educationDetails);
    }

    @GetMapping("/get-edu-details")
    public List<EducationDetails> getEduDetails() {
        return educationDetailsRepository.findAll();
    }

}
