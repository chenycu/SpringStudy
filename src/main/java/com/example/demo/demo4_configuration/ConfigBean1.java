package com.example.demo.demo4_configuration;

import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
//@Component
public class ConfigBean1 {
    @Bean
    public ServiceA serviceA() {
        System.out.println("调用serviceA()方法"); //@0
        return new ServiceA();
    }


    @Bean
    public ServiceA myServiceA() {

        return new ServiceC();
    }

    @Bean
    ServiceB serviceB1() {
        System.out.println("调用serviceB1()方法");
        ServiceA serviceA = this.serviceA(); //@1
        System.out.println(serviceA);
        return new ServiceB(serviceA);
    }

    @Bean
    ServiceB serviceB2() {
        System.out.println("调用serviceB2()方法");
        ServiceA serviceA = this.serviceA(); //@2
        System.out.println(serviceA);
        return new ServiceB(serviceA);
    }
}
