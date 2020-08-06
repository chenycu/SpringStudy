package com.example.demo;

import com.example.demo.demo3_jdbctemplate.StudentService;
import com.example.demo.demo3_jdbctemplate.StudentServiceImp;
import com.example.demo.demo4_configuration.ConfigBean1;
import com.example.demo.demo4_configuration.ScanBean1;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.xml.ws.Service;
import java.util.Arrays;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {
    }
    @Autowired
    StudentService studentService;

    @Test
    public void test2() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScanBean1.class);

    }

    @Test
    public void test1() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-bean.xml");
//        SimpleBean bean = context.getBean(SimpleBean.class);
//        bean.send();
        SimpleBean bean1 = context.getBean("simpleBean", SimpleBean.class);
        context.close();
    }
}
