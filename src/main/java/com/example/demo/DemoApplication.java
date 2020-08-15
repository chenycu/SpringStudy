package com.example.demo;

import com.example.demo.demo1_basic_configuration.BlogProperties;
import com.example.demo.demo3_jdbctemplate.StudentService;
import com.example.demo.demo3_jdbctemplate.StudentServiceImp;
import com.example.demo.demo4_configuration.ScanBean1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@SpringBootApplication
//@EnableConfigurationProperties({BlogProperties.class})
public class DemoApplication {



    public static void main(String[] args) {
//        SpringApplication.run(DemoApplication.class, args);
        test();
    }

    private static void test() {
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScanBean1.class);
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("parent-test.xml");

        for (String beanName : context.getBeanDefinitionNames()) {
            BeanDefinition beanDefinition = context.getBeanFactory().getBeanDefinition(beanName);
            System.out.println(beanName + "->" + beanDefinition.getParentName());
//            System.out.println(beanName + "->" + context.getBean(beanName));
        }


    }
}
