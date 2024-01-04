package com.dailycodework.sbemailverificationdemo.repositories;

import com.dailycodework.sbemailverificationdemo.enteties.Internship;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface InternshipRepository extends JpaRepository<Internship, Long> {
    List<Internship> findByEmployerUserId(Long userId);
    // Other custom queries if needed
}

