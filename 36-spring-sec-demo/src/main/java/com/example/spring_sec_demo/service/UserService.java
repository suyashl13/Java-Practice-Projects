package com.example.spring_sec_demo.service;

import com.example.spring_sec_demo.dao.UserRepository;
import com.example.spring_sec_demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);

    public User saveUser(User user){
        user.setPassword(
                encoder.encode(user.getPassword())
        );
        return userRepository.save(user);
    }
}
