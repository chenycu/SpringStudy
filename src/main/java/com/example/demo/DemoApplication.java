package com.example.demo;

import com.example.demo.demo1_basic_configuration.BlogProperties;
import com.example.demo.demo3_jdbctemplate.StudentService;
import com.example.demo.demo3_jdbctemplate.StudentServiceImp;
import com.example.demo.demo4_configuration.ScanBean1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableConfigurationProperties({BlogProperties.class})
public class DemoApplication {



    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        test();
    }

    private static void test() {
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScanBean1.class);
//        for (String beanName : context.getBeanDefinitionNames()) {
//            System.out.println(beanName + "->" + context.getBean(beanName));
//        }
//
//        System.out.println(context.getBeanDefinition("serviceA").getScope());
    }


}
