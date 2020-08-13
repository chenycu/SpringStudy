package com.example.demo.demo5_circle_dependes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Service1B {
    private Service1A service1A;

    public Service1B() {
    }

    public Service1B(Service1A service1A) {
        this.service1A = service1A;
    }

    @Autowired
    public void setService1A(Service1A service1A) {
        this.service1A = service1A;
    }
}
