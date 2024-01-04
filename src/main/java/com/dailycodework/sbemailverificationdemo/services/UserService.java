package com.dailycodework.sbemailverificationdemo.services;

import com.dailycodework.sbemailverificationdemo.enteties.User;

public interface UserService {
    User saveUser(User user);
    User getUserById(Long userId);
    // Add other user-related methods if needed
}
