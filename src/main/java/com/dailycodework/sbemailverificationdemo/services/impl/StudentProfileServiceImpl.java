package com.dailycodework.sbemailverificationdemo.services.impl;

import com.dailycodework.sbemailverificationdemo.enteties.StudentProfile;
import com.dailycodework.sbemailverificationdemo.services.StudentProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dailycodework.sbemailverificationdemo.repositories.StudentProfileRepository;

@Service
public class StudentProfileServiceImpl implements StudentProfileService {

    @Autowired
    private StudentProfileRepository studentProfileRepository;

    @Override
    public StudentProfile saveStudentProfile(StudentProfile studentProfile) {
        // Add any additional logic/validation before saving
        return studentProfileRepository.save(studentProfile);
    }

    @Override
    public StudentProfile getStudentProfileByUserId(Long userId) {
        return studentProfileRepository.findByUserId(userId);
    }

    // Implement other student profile-related methods
}

