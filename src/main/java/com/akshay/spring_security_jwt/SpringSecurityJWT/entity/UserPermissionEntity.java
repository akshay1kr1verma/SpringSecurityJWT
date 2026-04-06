package com.akshay.spring_security_jwt.SpringSecurityJWT.entity;

import jakarta.persistence.*;

@Table(name = "user_permission")
@Entity
public class UserPermissionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name; // eg. ORDER_READ, SALES_READ

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
