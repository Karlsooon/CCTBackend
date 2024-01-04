package com.dailycodework.sbemailverificationdemo.services.impl;

import com.dailycodework.sbemailverificationdemo.enteties.Internship;
import com.dailycodework.sbemailverificationdemo.repositories.InternshipRepository;
import com.dailycodework.sbemailverificationdemo.services.InternshipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InternshipServiceImpl implements InternshipService {

    @Autowired
    private InternshipRepository internshipRepository;

    @Override
    public Internship saveInternship(Internship internship) {
        // Add any additional logic/validation before saving
        return internshipRepository.save(internship);
    }

    @Override
    public Internship getInternshipById(Long internshipId) {
        return internshipRepository.findById(internshipId).orElse(null);
    }

    @Override
    public List<Internship> getAllInternships() {
        return internshipRepository.findAll();
    }

    // Implement other internship-related methods
}

