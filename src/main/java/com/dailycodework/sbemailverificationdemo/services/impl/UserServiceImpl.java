package com.dailycodework.sbemailverificationdemo.services.impl;

import com.dailycodework.sbemailverificationdemo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dailycodework.sbemailverificationdemo.repositories.UserRepository;
import com.dailycodework.sbemailverificationdemo.enteties.User;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User saveUser(User user) {
        // Add any additional logic/validation before saving
        return userRepository.save(user);
    }

    @Override
    public User getUserById(Long userId) {
        return userRepository.findById(userId).orElse(null);
    }

    // Implement other user-related methods
}
