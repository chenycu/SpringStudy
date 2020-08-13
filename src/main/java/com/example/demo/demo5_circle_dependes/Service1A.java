package com.example.demo.demo5_circle_dependes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Service1A {
    private Service1B service1B;

    public Service1A() {
    }

    public Service1A(Service1B service1B) {
        this.service1B = service1B;
    }

    @Autowired
    public void setService1B(Service1B service1B) {
        this.service1B = service1B;
    }
}
