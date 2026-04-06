package com.akshay.spring_security_jwt.SpringSecurityJWT.repository;

import com.akshay.spring_security_jwt.SpringSecurityJWT.entity.UserRegisterEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRegisterEntityRepository extends JpaRepository<UserRegisterEntity, Long> {

    Optional<UserRegisterEntity> findByUsername(String username);
}
