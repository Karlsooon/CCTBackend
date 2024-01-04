package com.dailycodework.sbemailverificationdemo.services;
import com.dailycodework.sbemailverificationdemo.enteties.Internship;

import java.util.List;

public interface InternshipService {
    Internship saveInternship(Internship internship);
    Internship getInternshipById(Long internshipId);
    List<Internship> getAllInternships();
    // Other internship-related methods
}

