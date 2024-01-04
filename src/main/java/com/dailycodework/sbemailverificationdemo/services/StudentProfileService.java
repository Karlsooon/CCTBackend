package com.dailycodework.sbemailverificationdemo.services;
import com.dailycodework.sbemailverificationdemo.enteties.StudentProfile;

public interface StudentProfileService {
    StudentProfile saveStudentProfile(StudentProfile studentProfile);
    StudentProfile getStudentProfileByUserId(Long userId);
    // Other student profile-related methods
}

