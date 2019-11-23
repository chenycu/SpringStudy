package com.example.demo.demo1_basic_configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "test")
@PropertySource("classpath:test.properties")
@Component // 这里声明Component与在入口声明@EnableConfigurationProperties({PropertySource.class})效果一致
public class TestConfigBean {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
