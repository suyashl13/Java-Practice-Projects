package com.example.spring_sec_demo.service;

import com.example.spring_sec_demo.dao.UserRepository;
import com.example.spring_sec_demo.model.User;

import com.example.spring_sec_demo.model.UserPrincipal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service
public class MyUserDetailService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User currentUser = userRepository.findByUsername(username);

        if (currentUser == null) {
            System.out.println("404 User not found!");
            throw new UsernameNotFoundException("404 User not found!");
        } else {
            System.out.println("User found: " + username);
        }

        return new UserPrincipal(currentUser);
    }
}
