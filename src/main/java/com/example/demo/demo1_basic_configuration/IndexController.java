package com.example.demo.demo1_basic_configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/demo1")
public class IndexController {
    @Autowired
    private BlogProperties blogProperties;
    @Autowired
    private TestConfigBean testConfigBean;

    @RequestMapping("/one")
    String blogInfo() {
        return blogProperties.getName() + "-----" + blogProperties.getTitle();
    }

    @RequestMapping("/two")
    String testInfo() {
        return testConfigBean.getName() + "------" + testConfigBean.getAge();
    }
}
