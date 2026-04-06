package com.akshay.spring_security_jwt.SpringSecurityJWT.service;

import com.akshay.spring_security_jwt.SpringSecurityJWT.entity.UserRegisterEntity;
import com.akshay.spring_security_jwt.SpringSecurityJWT.repository.UserRegisterEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserRegisterEntityService implements UserDetailsService {

    @Autowired
    private UserRegisterEntityRepository userRegisterEntityRepository;

    public UserDetails save(UserRegisterEntity userRegisterEntity) {
        return userRegisterEntityRepository.save(userRegisterEntity);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userRegisterEntityRepository.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("User not found"));
    }
}
