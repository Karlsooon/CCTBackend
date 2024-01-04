package com.dailycodework.sbemailverificationdemo.services.impl;

import com.dailycodework.sbemailverificationdemo.enteties.Employer;
import com.dailycodework.sbemailverificationdemo.repositories.EmployerRepository;
import com.dailycodework.sbemailverificationdemo.services.EmployerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployerServiceImpl implements EmployerService {

    @Autowired
    private EmployerRepository employerRepository;

    @Override
    public Employer saveEmployer(Employer employer) {
        // Add any additional logic/validation before saving
        return employerRepository.save(employer);
    }

    @Override
    public Employer getEmployerByUserId(Long userId) {
        return employerRepository.findByUserId(userId);
    }

    // Implement other employer-related methods
}

