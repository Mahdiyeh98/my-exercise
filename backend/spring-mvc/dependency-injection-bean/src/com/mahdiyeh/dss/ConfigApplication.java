package com.mahdiyeh.dss;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class ConfigApplication {

//    @Bean

    public Student student() {
        return new Student();
    }

    //    @Bean
    public University university() {
        University university = new University();
        university.setNameOfUni("Tj");
        university.setCity("Tehran");
        return university;
    }
}
