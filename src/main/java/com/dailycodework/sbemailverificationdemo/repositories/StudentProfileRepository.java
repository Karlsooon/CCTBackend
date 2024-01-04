package com.dailycodework.sbemailverificationdemo.repositories;

import com.dailycodework.sbemailverificationdemo.enteties.StudentProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentProfileRepository extends JpaRepository<StudentProfile, Long> {
    StudentProfile findByUserId(Long userId);
    // Other custom queries if needed
}

