package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public class SimpleBean {
    public void send() {
        System.out.println("I am send method from SimpleBean!");
    }
}
