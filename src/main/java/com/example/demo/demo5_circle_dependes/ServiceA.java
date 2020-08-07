package com.example.demo.demo5_circle_dependes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServiceA {
    private ServiceB serviceB;

    public ServiceA() {
    }

    public ServiceA(ServiceB serviceB) {
        this.serviceB = serviceB;
    }

    @Autowired
    public void setServiceB(ServiceB serviceB) {
        this.serviceB = serviceB;
    }
}
