package com.akshay.spring_security_jwt.SpringSecurityJWT.dto;

public class OrderResponse {
    private long userId;

    public OrderResponse(long userId) {
        this.userId = userId;
    }

    public long getUserId() {
        return userId;
    }
}
