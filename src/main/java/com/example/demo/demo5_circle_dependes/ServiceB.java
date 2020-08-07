package com.example.demo.demo5_circle_dependes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServiceB {
    private ServiceA serviceA;

    public ServiceB() {
    }

    public ServiceB(ServiceA serviceA) {
        this.serviceA = serviceA;
    }

    @Autowired
    public void setServiceA(ServiceA serviceA) {
        this.serviceA = serviceA;
    }
}
