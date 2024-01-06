package com.dailycodework.sbemailverificationdemo.services;
import com.dailycodework.sbemailverificationdemo.enteties.Employer;

public interface EmployerService {
    Employer saveEmployer(Employer employer);
    Employer getEmployerByUserId(Long userId);
}

