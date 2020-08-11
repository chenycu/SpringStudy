package com.example.demo;

import com.example.demo.demo3_jdbctemplate.StudentService;
import com.example.demo.demo5_circle_dependes.ScanConfig;
import com.example.demo.demo5_circle_dependes.ServiceA;
import com.example.demo.demo5_circle_dependes.ServiceB;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {
    }
    @Autowired
    StudentService studentService;

    @Test
    public void test2() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScanConfig.class);
//        ServiceA serviceA = new ServiceA();
//        ServiceB serviceB = new ServiceB();
//        serviceA.setServiceB(serviceB);
//        serviceB.setServiceA(serviceA);
        ServiceA serviceA = new ServiceA();
        ServiceB serviceB = new ServiceB();
    }

    @Test
    public void test1() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-bean.xml");
//        SimpleBean bean = context.getBean(SimpleBean.class);
//        bean.send();
        SimpleBean bean1 = context.getBean("simpleBean", SimpleBean.class);
        context.close();
    }

    @Test
    public void test3() {
        String a = "bbg";
        System.out.println(a instanceof Object);
    }
}
