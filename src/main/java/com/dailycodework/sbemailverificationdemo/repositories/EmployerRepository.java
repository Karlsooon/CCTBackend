package com.dailycodework.sbemailverificationdemo.repositories;

import com.dailycodework.sbemailverificationdemo.enteties.Employer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployerRepository extends JpaRepository<Employer, Long> {
    Employer findByUserId(Long userId);
    // Other custom queries if needed
}

