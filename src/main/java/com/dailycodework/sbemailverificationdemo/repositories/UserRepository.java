package com.dailycodework.sbemailverificationdemo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.dailycodework.sbemailverificationdemo.enteties.User;


public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
    // Other custom queries if needed
}

