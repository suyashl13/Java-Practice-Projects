package com.example.spring_sec_demo.controller;


import com.example.spring_sec_demo.model.User;
import com.example.spring_sec_demo.service.JwtService;
import com.example.spring_sec_demo.service.UserService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloController {

    @Autowired
    UserService userService;

    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    JwtService jwtService;

    @GetMapping("/")
    public String getHello() {
        return "Hello Home page";
    }

    @GetMapping("/about")
    public String getAbout(HttpServletRequest request) {
        return "This is about page with Session Id: " + request.getSession().getId();
    }

    @PostMapping("/registerUser")
    public ResponseEntity<?> registerUser(@RequestBody User user){
        return new ResponseEntity<>(
                userService.saveUser(user),
                HttpStatus.OK
        );
    }

    @PostMapping("login")
    public String login(@RequestBody User user){
        System.out.println("login");
        Authentication authentication = authenticationManager
                .authenticate(new UsernamePasswordAuthenticationToken(user.getUsername(), user.getPassword()));

        System.out.println(authentication.isAuthenticated());
        if(authentication.isAuthenticated())
            return jwtService.generateToken(user.getUsername());
        else
            return "Login Failed";

    }
}
