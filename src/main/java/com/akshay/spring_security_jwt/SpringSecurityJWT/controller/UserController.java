package com.akshay.spring_security_jwt.SpringSecurityJWT.controller;


import com.akshay.spring_security_jwt.SpringSecurityJWT.entity.UserRegisterEntity;
import com.akshay.spring_security_jwt.SpringSecurityJWT.service.UserRegisterEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    private UserRegisterEntityService userRegisterEntityService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @GetMapping("/users")
    public String getUserDetails() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return "Welcome, you are logged in!";
    }

    @PostMapping("/user-register")
    public ResponseEntity<String> register(@RequestBody UserRegisterEntity userRegisterEntity) {
        //Hash the password before saving
        userRegisterEntity.setPassword(passwordEncoder.encode(userRegisterEntity.getPassword()));
        //save user
        userRegisterEntityService.save(userRegisterEntity);
        return ResponseEntity.ok("User registered successfully");
    }
}
