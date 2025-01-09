package com.janitri.service;

import com.janitri.entity.User;
import com.janitri.exception.ResourceNotFoundException;
import com.janitri.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User registerUser(User user) {
        return userRepository.save(user);
    }

    public User loginUser(String email, String password) {
        return userRepository.findByEmail(email)
                .filter(u -> u.getPassword().equals(password))
                .orElseThrow(() -> new ResourceNotFoundException("Invalid email or password"));
    }
}
