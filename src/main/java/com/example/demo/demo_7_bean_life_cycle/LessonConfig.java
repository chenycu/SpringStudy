package com.example.demo.demo_7_bean_life_cycle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LessonConfig {
    @Bean
    public LessonModel lesson1(){
        return new LessonModel();
    }

    @Bean
    public LessonModel lesson2(){
        return new LessonModel();
    }

    @Bean
    public LessonModel lesson3(){
        return new LessonModel();
    }
}
